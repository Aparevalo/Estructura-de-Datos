/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenfinal;

/**
 *
 * @author Usuario iTC
 */
public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Recorrido en preorden 
    public void recorridoPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorridoPreorden(nodo.izquierdo);
            recorridoPreorden(nodo.derecho);
        }
    }

    // Recorrido en inorden 
    public void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecho);
        }
    }

    // Recorrido en postorden 
    public void recorridoPostorden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostorden(nodo.izquierdo);
            recorridoPostorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}