package org.example.simulacion;

import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import java.util.List;

public class Simulacion {
    private Entorno entorno;
    private List<Organismos> organismos;

    public Simulacion(Entorno entorno, List<Organismos> organismos) {
        this.entorno = entorno;
        this.organismos = organismos;
    }

    public void iniciar() {
        // Implementar la lógica para iniciar la simulación
    }

    public void actualizarEstado() {
        // Implementar la lógica para actualizar el estado de la simulación
    }

    public void calcularEstadisticas() {
        // Implementar la lógica para calcular estadísticas sobre la salud del ecosistema y las tendencias poblacionales
    }
}