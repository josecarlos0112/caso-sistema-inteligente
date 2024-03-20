package org.example.entorno;

import org.example.entidades.Organismos;

import java.util.Random;

public class Entorno {
    private String clima;
    private String terreno;
    private int recursosDisponibles;

    public Entorno(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public void incrementarPoblacion(Class<? extends Organismos> aClass) {
        // Increase the population of the organism

    }

    public void actualizar() {
    // Randomly change the climate
    String[] climas = {"Soleado", "Lluvioso", "Nublado", "Ventoso"};
    this.clima = climas[new Random().nextInt(climas.length)];

    // Decrease available resources
    this.recursosDisponibles -= new Random().nextInt(10);  // Decrease by a random amount up to 10

    // Ensure resources don't go below 0
    if (this.recursosDisponibles < 0) {
        this.recursosDisponibles = 0;
    }
}
}