/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author Usuario ITC
 */
public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }
    
    public void insertar (String pathDirectorio){
               
    }
    private NodoArbol insertarRecursivo(NodoArbol actual,String pathDirectorio){
        if (actual ==null) {
            return  new NodoArbol(pathDirectorio);
            
        }
        if(pathDirectorio.compareTo(actual.datos)<0){
        actual.izquierda=insertarRecursivo(actual.izquierda,pathDirectorio);
        }else{
        actual.derecha=insertarRecursivo(actual.derecha,pathDirectorio);
        }
        return actual;
    }
}
