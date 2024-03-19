package org.example.entidades;

public class Plantas extends Organismos{
    private String tipoPlanta;
    private String tipoReproduccion;
    private String tipoAlimentacion;

    public Plantas(String nombre, String tipoPlanta, String tipoReproduccion, String tipoAlimentacion) {
        super(nombre);
        this.tipoPlanta = tipoPlanta;
        this.tipoReproduccion = tipoReproduccion;
        this.tipoAlimentacion = tipoAlimentacion;
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
