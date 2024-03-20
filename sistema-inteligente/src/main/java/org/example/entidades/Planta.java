package org.example.entidades;

import org.example.entorno.Entorno;

public class Planta extends Organismos{
    private String tipoPlanta;
    private String tipoReproduccion;
    private String tipoAlimentacion;

    public Planta(String nombre, String tipoPlanta, String tipoReproduccion, String tipoAlimentacion) {
        super(nombre);
        this.tipoPlanta = tipoPlanta;
        this.tipoReproduccion = tipoReproduccion;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Planta(int posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void consumirRecurso(Entorno entorno) {
        if (entorno.getRecursosDisponibles() > 0) {
            entorno.setRecursosDisponibles(entorno.getRecursosDisponibles() - 1); // Plants consume less resources
        }
    }

    public void pollinate() {
        if (!this.estadoReproductivo) {
            this.estadoReproductivo = true; // The plant is now in a reproductive state
        }
    }

    @Override
    public void symbiosis(Organismos partner) {
        super.symbiosis(partner);
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "tipoPlanta='" + tipoPlanta + '\'' +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }
}
