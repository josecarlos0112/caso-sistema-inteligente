package org.example.usuario;

import org.example.simulacion.Simulacion;
import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import java.util.List;

public class ManejoSimulaciones {
    private Simulacion simulacionActual;

    public void crearNuevaSimulacion(Entorno entorno, List<Organismos> organismos) {
        this.simulacionActual = new Simulacion(entorno, organismos);
    }

    public void iniciarSimulacion() {
        if (this.simulacionActual != null) {
            this.simulacionActual.iniciar();
        }
    }

    public void pausarSimulacion() {
        if (this.simulacionActual != null) {
            this.simulacionActual.pausar();
        }
    }

    public void reanudarSimulacion() {
        if (this.simulacionActual != null) {
            this.simulacionActual.reanudar();
        }
    }

    public void obtenerEstadisticas() {
        if (this.simulacionActual != null) {
            this.simulacionActual.mostrarEstadisticas();
        }
    }
}