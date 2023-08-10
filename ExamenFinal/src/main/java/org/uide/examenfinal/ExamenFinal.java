/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.examenfinal;

/**
 *
 * @author Usuario iTC
 */
public class ExamenFinal {

      public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new Nodo(10);
        arbol.raiz.izquierdo = new Nodo(5);
        arbol.raiz.izquierdo.izquierdo = new Nodo(3);
        arbol.raiz.izquierdo.derecho = new Nodo(8);
        arbol.raiz.derecho = new Nodo(15);
        arbol.raiz.derecho.derecho = new Nodo(20);

        System.out.print("Recorrido preorden: ");
        arbol.recorridoPreorden(arbol.raiz);
        System.out.println();

        System.out.print("Recorrido inorden: ");
        arbol.recorridoInorden(arbol.raiz);
        System.out.println();

        System.out.print("Recorrido postorden: ");
        arbol.recorridoPostorden(arbol.raiz);
        System.out.println();
    }
}
