/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.gestor_tareas;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Gestor_tareas {


    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la descripcion de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la fecha de la tarea (YYYY-MM-DD): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    int prioridad = scanner.nextInt();
                    gestor.agregarTarea(nombre, descripcion, fecha, prioridad);
                    System.out.println("Tarea agregada correctamente.");
                    break;
                case 2:
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nombre de la tarea a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    gestor.eliminarTarea(nombreEliminar);
                    System.out.println("Tarea eliminada correctamente.");
                    break;
                case 3:
                    gestor.mostrarTareasPendientes();
                    break;
                case 4:
                    System.out.println("Aplicacion cerrada");
                    break;
                default:
                    System.out.println("Opcion inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}



