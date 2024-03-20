package org.example.simulacion;

import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import org.example.entidades.Animal;
import org.example.entidades.Planta;
import java.util.List;

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

    public void calcularEstadisticas() {
    int totalOrganismos = organismos.size();
    int totalAnimales = (int) organismos.stream().filter(o -> o instanceof Animal).count();
    int totalPlantas = (int) organismos.stream().filter(o -> o instanceof Planta).count();
    double saludPromedio = organismos.stream().mapToInt(Organismos::getSalud).average().orElse(0.0);
    int recursosDisponibles = entorno.getRecursosDisponibles();

    System.out.println("Total de organismos: " + totalOrganismos);
    System.out.println("Total de animales: " + totalAnimales);
    System.out.println("Total de plantas: " + totalPlantas);
    System.out.println("Salud promedio de los organismos: " + saludPromedio);
    System.out.println("Recursos disponibles en el entorno: " + recursosDisponibles);
}

    public boolean estaPausado() {
        return this.pausado;
    }
}