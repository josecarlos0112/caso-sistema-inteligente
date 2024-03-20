package org.example.usuario;

import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import java.util.List;

public class User {
    private ManejoSimulaciones manejoSimulaciones;
    private String nombreUsuario;
    private String contrasena;

    public User(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.manejoSimulaciones = new ManejoSimulaciones();
    }

    public boolean verificarCredenciales(String nombreUsuario, String contrasena) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasena.equals(contrasena);
    }

    public User() {
        this.manejoSimulaciones = new ManejoSimulaciones();
    }

    public void crearNuevaSimulacion(Entorno entorno, List<Organismos> organismos) {
        this.manejoSimulaciones.crearNuevaSimulacion(entorno, organismos);
    }

    public void iniciarSimulacion() {
        this.manejoSimulaciones.iniciarSimulacion();
    }

    public void pausarSimulacion() {
        this.manejoSimulaciones.pausarSimulacion();
    }

    public void obtenerEstadisticas() {
        this.manejoSimulaciones.obtenerEstadisticas();
    }

    public void reanudarSimulacion() {
        this.manejoSimulaciones.reanudarSimulacion();
    }
}