/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.gestor_tareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Usuario iTC
 */
class GestorTareas {
    private Stack<Tarea> pilaTareas;
    private Queue<Tarea> colaTareas;
    private LinkedList<Tarea> listaTareas;

    public GestorTareas() {
        pilaTareas = new Stack<>();
        colaTareas = new LinkedList<>();
        listaTareas = new LinkedList<>();
    }

    public void agregarTarea(String nombre, String descripcion, String fecha, int prioridad) {
        Tarea tarea = new Tarea(nombre,descripcion,fecha,prioridad);
        pilaTareas.push(tarea);
        colaTareas.add(tarea);
        listaTareas.add(tarea);
    }

    public void eliminarTarea(String nombre) {
        pilaTareas.removeIf(tarea -> tarea.nombre.equals(nombre));
        colaTareas.removeIf(tarea -> tarea.nombre.equals(nombre));
        listaTareas.removeIf(tarea -> tarea.nombre.equals(nombre));
    }

    public void mostrarTareasPendientes() {
    System.out.println("Pila de tareas pendientes (ultima tarea agregada se muestra primero):");
    Stack<Tarea> pilaCopia = (Stack<Tarea>) pilaTareas.clone();
    while (!pilaCopia.isEmpty()) {
        Tarea tarea = pilaCopia.pop();
        System.out.println(tarea.toString());
    }

    System.out.println("\nCola de tareas pendientes (primera tarea agregada se muestra primero):");
    Queue<Tarea> colaCopia = new LinkedList<>(colaTareas);
    while (!colaCopia.isEmpty()) {
        Tarea tarea = colaCopia.poll();
        System.out.println(tarea.toString());
    }

    System.out.println("\nLista de tareas pendientes:");
    for (Tarea tarea : listaTareas) {
        System.out.println(tarea.toString());
    }
}

}