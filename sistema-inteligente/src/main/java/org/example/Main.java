package org.example;

import org.example.usuario.User;
import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de User
        User user = new User();

        // Crear un entorno y una lista de organismos
        Entorno entorno = new Entorno("Templado", "Bosque", 100);
        List<Organismos> organismos = new ArrayList<>();

        // Crear una nueva simulación
        user.crearNuevaSimulacion(entorno, organismos);

        // Iniciar la simulación
        user.iniciarSimulacion();

        // Pausar la simulación
        user.pausarSimulacion();

        // Obtener estadísticas de la simulación
        user.obtenerEstadisticas();
    }
}