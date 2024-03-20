package org.example.simulacion;

import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
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
        // Implementar la lógica para calcular las estadísticas
    }

    public boolean estaPausado() {
        return this.pausado;
    }
}