/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.arbolestudiante;

/**
 *
 * @author Usuario iTC
 */
public class ArbolBinarioEstudiantes {
    private NodoArbol raiz;

    public ArbolBinarioEstudiantes() {
        raiz = null;
    }

    public void agregarEstudiante(int id, String nombre, int edad) {
        Estudiante estudiante = new Estudiante(id, nombre, edad);
        raiz = agregarEstudianteRecursivo(raiz, estudiante);
    }

    private NodoArbol agregarEstudianteRecursivo(NodoArbol actual, Estudiante estudiante) {
        if (actual == null) {
            return new NodoArbol(estudiante);
        }

        if (estudiante.id < actual.estudiante.id) {
            actual.izquierdo = agregarEstudianteRecursivo(actual.izquierdo, estudiante);
        } else if (estudiante.id > actual.estudiante.id) {
            actual.derecho = agregarEstudianteRecursivo(actual.derecho, estudiante);
        }

        return actual;
    }

    public Estudiante buscarEstudiante(int id) {
        return buscarEstudianteRecursivo(raiz, id);
    }

    private Estudiante buscarEstudianteRecursivo(NodoArbol actual, int id) {
        if (actual == null || actual.estudiante.id == id) {
            return (actual != null) ? actual.estudiante : null;
        }

        if (id < actual.estudiante.id) {
            return buscarEstudianteRecursivo(actual.izquierdo, id);
        }

        return buscarEstudianteRecursivo(actual.derecho, id);
    }

    public void actualizarEstudiante(int id, String nuevoNombre, int nuevaEdad) {
        raiz = actualizarEstudianteRecursivo(raiz, id, nuevoNombre, nuevaEdad);
    }

    private NodoArbol actualizarEstudianteRecursivo(NodoArbol actual, int id, String nuevoNombre, int nuevaEdad) {
        if (actual == null) {
            return null;
        }

        if (id == actual.estudiante.id) {
            actual.estudiante.nombre = nuevoNombre;
            actual.estudiante.edad = nuevaEdad;
        } else if (id < actual.estudiante.id) {
            actual.izquierdo = actualizarEstudianteRecursivo(actual.izquierdo, id, nuevoNombre, nuevaEdad);
        } else {
            actual.derecho = actualizarEstudianteRecursivo(actual.derecho, id, nuevoNombre, nuevaEdad);
        }

        return actual;
    }

    public void eliminarEstudiante(int id) {
        raiz = eliminarEstudianteRecursivo(raiz, id);
    }

    private NodoArbol eliminarEstudianteRecursivo(NodoArbol actual, int id) {
        if (actual == null) {
            return null;
        }

        if (id == actual.estudiante.id) {
            if (actual.izquierdo == null) {
                return actual.derecho;
            } else if (actual.derecho == null) {
                return actual.izquierdo;
            }

            actual.estudiante = encontrarMinimo(actual.derecho);
            actual.derecho = eliminarEstudianteRecursivo(actual.derecho, actual.estudiante.id);
        } else if (id < actual.estudiante.id) {
            actual.izquierdo = eliminarEstudianteRecursivo(actual.izquierdo, id);
        } else {
            actual.derecho = eliminarEstudianteRecursivo(actual.derecho, id);
        }

        return actual;
    }

    private Estudiante encontrarMinimo(NodoArbol nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo.estudiante;
    }
}