/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.estructura_deber1;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Estructura_deber1 {

    
    public static void menu(int[]arreglo){
    Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Promedio");
            System.out.println("2. Buscar");
            System.out.println("3. Min y Max");
            System.out.println("4. Mayor del Promedio");
            System.out.println("5. Ascendente");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    
                    System.out.println("El promedio es: " +  sumaRecursiva(arreglo,arreglo.length)/arreglo.length);
        
                    break;
                case 2:
                    buscar(arreglo);
                    break;
                case 3:
                    maxmin(arreglo);
                    break;
                case 4:
                    System.out.println(mayorAlPromedio(arreglo,0,0));  
                    break;
                case 5:
                    boolean comprobar =estaOrdenado(arreglo,0);
                    System.out.println("El arreglo esta ordenado: "+(comprobar ? "Verdadero" : "Falso"));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while(opcion != 6);
    
    }
    
    public static int sumaRecursiva(int[] arreglo, int tamano) {
        if (tamano == 0) {
            return 0;
        } else {
            return arreglo[tamano - 1] + sumaRecursiva(arreglo, tamano - 1);
        }
    }
    
    public static int buscarRecursivo(int[] arreglo, int buscar, int indice){
        if (indice == arreglo.length) {
            return 12;
        }
        if (arreglo[indice]==buscar) {
            return indice;
        }
        return buscarRecursivo(arreglo, buscar, indice + 1);
    } 
    
    private static void buscar(int[] arreglo){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el elemento a buscar");
       int buscar = sc.nextInt();
       int indiceBusqueda=buscarRecursivo(arreglo,buscar,0);
       if(indiceBusqueda==12){
           System.out.println("El elemento no se encontro en el arreglo");
       }else{
           System.out.println("El elemento se encontro en la posicion "+indiceBusqueda);
           }
       }
    
    public static void maxmin(int[] arreglo){
        int maximo = buscarMaximo(arreglo, 0);
        int minimo = buscarMinimo(arreglo, 0);

        System.out.println("El valor máximo del arreglo es: " + maximo);
        System.out.println("El valor mínimo del arreglo es: " + minimo);
    }
    
     public static int buscarMaximo(int[] arreglo, int indice) {
        if (indice == arreglo.length - 1) {
            return arreglo[indice];
        }

        int maximo = buscarMaximo(arreglo, indice + 1);

        return (arreglo[indice] > maximo) ? arreglo[indice] : maximo;
    }

    public static int buscarMinimo(int[] arreglo, int indice) {
        if (indice == arreglo.length - 1) {
            return arreglo[indice];
        }

        int minimo = buscarMinimo(arreglo, indice + 1);

        return (arreglo[indice] < minimo) ? arreglo[indice] : minimo;
    }
        
    
    public static int mayorAlPromedio(int[]arreglo,int indice, int suma){
    
        if (indice == arreglo.length) {
            return suma;
        } else {
            int promedio = sumaRecursiva(arreglo,arreglo.length)/arreglo.length;
            if(arreglo[indice]>promedio){
            suma++;
            }
            return mayorAlPromedio(arreglo, indice+1, suma);
        }
    
    }
    
    
    public static boolean estaOrdenado(int[] arreglo, int indice) {
    if (indice == arreglo.length - 1) {
        return true;
    }
    
    if (arreglo[indice] > arreglo[indice + 1]) {
        return false;
    }
    
    return estaOrdenado(arreglo, indice + 1);
}
    
    public static void main(String[] args) {
        
        int[] arreglo = {2, 4, 6, 8, 10};
        menu(arreglo);
        
    }
       
    }

