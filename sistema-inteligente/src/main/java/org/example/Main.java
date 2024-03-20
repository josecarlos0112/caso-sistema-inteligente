package org.example;

import org.example.usuario.User;
import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de User
        User user = new User();

        // Crear un entorno y una lista de organismos
        Entorno entorno = new Entorno("Templado", "Bosque", 100);
        List<Organismos> organismos = new ArrayList<>();

        // Crear una nueva simulación
        user.crearNuevaSimulacion(entorno, organismos);

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú hasta que el usuario decida salir
        boolean continuar = true;
        while (continuar) {
            System.out.println("=======================================");
            System.out.println("¡Bienvenido a la Simulación de Ecosistema!");
            System.out.println("=======================================");
            System.out.println("1. Iniciar la simulación");
            System.out.println("2. Pausar la simulación");
            System.out.println("3. Obtener estadísticas de la simulación");
            System.out.println("4. Reanudar la simulación");
            System.out.println("5. Ver información de los organismos");
            System.out.println("6. Salir de la simulación");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    user.iniciarSimulacion();
                    break;
                case 2:
                    user.pausarSimulacion();
                    break;
                case 3:
                    user.obtenerEstadisticas();
                    break;
                case 4:
                    user.reanudarSimulacion();
                    break;
                case 5:
                    for (Organismos organismo : organismos) {
                        organismo.mostrarInformacion();
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}