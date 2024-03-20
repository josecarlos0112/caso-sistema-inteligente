package org.example;

import org.example.usuario.User;
import org.example.entorno.Entorno;
import org.example.entidades.Organismos;
import org.example.entidades.Animal;
import org.example.entidades.Planta;
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

        // Crear un animal y una planta
        Animal animal = new Animal("León", "Carnívoro", "Grande y feroz", 21/03/2024, "África", "Saludable");
        Planta planta = new Planta("Roble", "Deciduo", "Sexual", "Fotosíntesis");
        organismos.add(animal);
        organismos.add(planta);

        // Mostrar el menú hasta que el usuario decida salir
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=======================================");
            System.out.println("¡Bienvenido a la Simulación de Ecosistema!");
            System.out.println("=======================================");
            System.out.println("1. Iniciar la simulación");
            System.out.println("2. Pausar la simulación");
            System.out.println("3. Obtener estadísticas de la simulación");
            System.out.println("4. Reanudar la simulación");
            System.out.println("5. Ver información de los organismos");
            System.out.println("6. Simular predación");
            System.out.println("7. Simular competencia por recursos");
            System.out.println("8. Simular polinización");
            System.out.println("9. Simular simbiosis");
            System.out.println("10. Salir de la simulación");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Iniciando la simulación....\n");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.iniciarSimulacion();
                    break;
                case 2:
                    System.out.print("Pausando la simulación....\n");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.pausarSimulacion();
                    break;
                case 3:
                    System.out.print("Obteniendo estadísticas de la simulación....\n");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.obtenerEstadisticas();
                    break;
                case 4:
                    System.out.print("Reanudando la simulación....\n");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.reanudarSimulacion();
                    break;
                case 5:
                    for (Organismos organismo : organismos) {
                        organismo.mostrarInformacion();
                    }
                    break;
                case 6:
                    System.out.println("Simulando predación....");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    animal.predar(planta);
                    System.out.println("Predación simulada");
                    break;
                case 7:
                    System.out.println("Simulando competencia por recursos....");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    animal.consumirRecurso(entorno);
                    planta.consumirRecurso(entorno);
                    System.out.println("Competencia por recursos simulada");
                    break;
                case 8:
                    System.out.println("Simulando polinización....");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    animal.pollinate(planta);
                    System.out.println("Polinización simulada");
                    break;
                case 9:
                    System.out.println("Simulando simbiosis....");
                    try {
                        Thread.sleep(1500); // Hacer que el hilo actual se detenga durante 1500 milisegundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    animal.symbiosis(planta);
                    System.out.println("Simbiosis simulada");
                    break;
                case 10:
                    System.out.println("\n¡Gracias por usar la simulación de ecosistema!");
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