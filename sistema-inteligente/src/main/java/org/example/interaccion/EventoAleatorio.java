package org.example.interaccion;

import org.example.entorno.Entorno;
import org.example.entidades.Organismos;

import java.util.Random;

public class EventoAleatorio {
    private Random random;

    public EventoAleatorio() {
        this.random = new Random();
    }

    public void desastreNatural(Entorno entorno) {
        // Reduce the resources in the environment
        entorno.setRecursosDisponibles(entorno.getRecursosDisponibles() - random.nextInt(20));
    }

    public void enfermedad(Organismos organismo) {
        // Reduce the health of the organism
        organismo.setSalud(organismo.getSalud() - random.nextInt(20));
    }

    public void cambioClimatico(Entorno entorno) {
        // Change the climate of the environment
        String[] climas = {"Templado", "Tropical", "Desértico", "Polar"};
        entorno.setClima(climas[random.nextInt(climas.length)]);
    }
}