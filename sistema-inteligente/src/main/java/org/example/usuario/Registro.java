package org.example.usuario;
import org.example.simulacion.Simulacion;

import java.io.*;

public class Registro {
    private File archivoRegistro;

    public Registro(String nombreArchivo) {
        this.archivoRegistro = new File(nombreArchivo);
    }

    public void guardarSimulacion(Simulacion simulacion) {
        try (PrintWriter out = new PrintWriter(new FileWriter(archivoRegistro, true))) {
            out.println(simulacion);
        } catch (IOException e) {
            System.out.println("Error al guardar la simulación: " + e.getMessage());
        }
    }
}