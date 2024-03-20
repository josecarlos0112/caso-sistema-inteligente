package org.example.entidades;

import org.example.entorno.Entorno;

public class Organismos {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String fecha;
    private String lugar;
    private String estado;

    protected Posicion posicion;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;

    public Organismos(String nombre, String tipo, String descripcion, String fecha, String lugar, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estado = estado;
    }

    public Organismos(int posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = new Posicion(posicion, posicion);
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    public void mover() {
        int dx = (int) (Math.random() * 3) - 1; // Genera un número aleatorio entre -1 y 1
        int dy = (int) (Math.random() * 3) - 1; // Genera un número aleatorio entre -1 y 1
        this.posicion.setX(this.posicion.getX() + dx);
        this.posicion.setY(this.posicion.getY() + dy);
    }

    public void crecer() {
        this.edad++;
    }

    public void reproducir() {
        this.estadoReproductivo = true;
    }

    public void Organismo(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
    this.posicion = posicion;
    this.salud = salud;
    this.edad = edad;
    this.estadoReproductivo = estadoReproductivo;
}

    public Organismos(String nombre) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estado = estado;
    }



    public Organismos() {
        this.nombre = "";
        this.tipo = "";
        this.descripcion = "";
        this.fecha = "";
        this.lugar = "";
        this.estado = "";
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Lugar: " + this.lugar);
        System.out.println("Estado: " + this.estado);
    }

    public void consumirRecurso(Entorno entorno) {
        if (entorno.getRecursosDisponibles() > 0) {
            entorno.setRecursosDisponibles(entorno.getRecursosDisponibles() - 1);
        }
    }

    public void symbiosis(Organismos partner) {
        if (partner.getSalud() > 0) {
            this.salud += 1; // Increase health due to symbiosis
            partner.setSalud(partner.getSalud() + 1); // Increase partner's health due to symbiosis
        }
    }



    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    protected int getSalud() {
        return salud;
    }

    protected void setSalud(int i) {
        this.salud = i;
    }
}
