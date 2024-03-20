package org.example.simulacion;

import org.example.entidades.Animal;
import org.example.entidades.Organismos;
import org.example.entidades.Planta;
import org.example.entorno.Entorno;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.util.List;
import java.util.Random;

public class Simulacion {
    private Entorno entorno;
    private List<Organismos> organismos;
    private boolean pausado;

    public Simulacion(Entorno entorno, List<Organismos> organismos) {
        this.entorno = entorno;
        this.organismos = organismos;
        this.pausado = false;
    }

    public void mostrarEstadisticas() {
        int totalOrganismos = organismos.size();
        int totalAnimales = (int) organismos.stream().filter(o -> o instanceof Animal).count();
        int totalPlantas = (int) organismos.stream().filter(o -> o instanceof Planta).count();
        double saludPromedio = organismos.stream().mapToInt(Organismos::getSalud).average().orElse(0.0);
        int recursosDisponibles = entorno.getRecursosDisponibles();

        System.out.println("Estadísticas de la simulación:");
        System.out.println("Total de organismos: " + totalOrganismos);
        System.out.println("Total de animales: " + totalAnimales);
        System.out.println("Total de plantas: " + totalPlantas);
        System.out.println("Salud promedio de los organismos: " + saludPromedio);
        System.out.println("Recursos disponibles en el entorno: " + recursosDisponibles);
    }

    public void iniciar() {
        // Implementar la lógica para iniciar la simulación
    }

    public void pausar() {
        this.pausado = true;
    }

    public void reanudar() {
        this.pausado = false;
    }

    public boolean estaPausado() {
        return this.pausado;
    }

    public void buscarEquilibrioEcológico() {
    int ciclosEstables = 0;
    int totalAnimalesAnterior = -1;
    int totalPlantasAnterior = -1;

    while (ciclosEstables < 10) {  // Consideramos un equilibrio si los números se mantienen constantes durante 10 ciclos
        int totalAnimales = (int) organismos.stream().filter(o -> o instanceof Animal).count();
        int totalPlantas = (int) organismos.stream().filter(o -> o instanceof Planta).count();

        if (totalAnimales == totalAnimalesAnterior && totalPlantas == totalPlantasAnterior) {
            ciclosEstables++;
        } else {
            ciclosEstables = 0;
        }

        totalAnimalesAnterior = totalAnimales;
        totalPlantasAnterior = totalPlantas;

        this.ejecutarCiclo();
    }

    System.out.println("Se ha alcanzado un equilibrio ecológico después de " + ciclosEstables + " ciclos estables.");
}

   private void ejecutarCiclo() {
    entorno.actualizar();

    for (Organismos organismo : organismos) {
        organismo.actualizar(entorno);
    }

    if (new Random().nextInt(100) < 5) {
        entorno.invasionEspecie(entorno, organismos);
    }

    // Remove any dead organisms
    organismos.removeIf(organismo -> organismo.getSalud() <= 0);
}

    public void visualizarDatos() {
        XYSeries series = new XYSeries("Datos de la simulación");

        // Agrega los datos de la simulación a la serie
        // Por ejemplo: series.add(x, y);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Datos de la simulación",
                "Tiempo",
                "Valor",
                dataset
        );

        ChartFrame frame = new ChartFrame("Datos de la simulación", chart);
        frame.pack();
        frame.setVisible(true);
    }
}