/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.arbolestudiante;

/**
 *
 * @author Usuario iTC
 */
class NodoArbol {
    Estudiante estudiante;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierdo = null;
        this.derecho = null;
    }
}