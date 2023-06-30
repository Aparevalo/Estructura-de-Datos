/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.gestor_tareas;

/**
 *
 * @author Usuario iTC
 */
class Tarea {
    String nombre;
    String descripcion;
    String fecha;
    int prioridad;
    

    public Tarea(String nombre, String descripcion, String fecha, int prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + ", Descripción: " + descripcion + ", Fecha: " + fecha + ", Prioridad: " + prioridad ;
    }
}
