/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.arbolestudiante;

/**
 *
 * @author Usuario iTC
 */
public class ArbolEstudiante {

    public static void main(String[] args) {
        ArbolBinarioEstudiantes arbol = new ArbolBinarioEstudiantes();

        arbol.agregarEstudiante(101, "Alice", 20);
        arbol.agregarEstudiante(102, "Bob", 22);
        arbol.agregarEstudiante(103, "Charlie", 21);

        Estudiante resultadoBusqueda = arbol.buscarEstudiante(102);
        if (resultadoBusqueda != null) {
            System.out.println("Estudiante encontrado: " + resultadoBusqueda.nombre);
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        arbol.actualizarEstudiante(102, "Bobby", 23);

        arbol.eliminarEstudiante(101);
    }
}
