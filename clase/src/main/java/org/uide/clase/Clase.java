/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.uide.clase;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    
   public static void ordenarReversoRecursivo(String[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        String temp = arreglo[inicio];
        arreglo[inicio] = arreglo[fin];
        arreglo[fin] = temp;
        ordenarReversoRecursivo(arreglo, inicio + 1, fin - 1);
    }
   
  
   
   private static void recorrer(String[] arreglo) {
        for(int i=0;i<arreglo.length;i++)
                System.out.println(arreglo[i]);
    }
   
   
   private static void buscar(String[] arreglo){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el elemento a buscar");
       String buscar = sc.nextLine();
       int indiceBusqueda=buscarRecursivo(arreglo,buscar,0);
       if(indiceBusqueda==12){
           System.out.println("El elemento no se encontro en el arreglo");
       }else{
           System.out.println("El elemento se encontro en la posicion "+indiceBusqueda+". Desea remplazarlo? Y/N");
           String aceptar =sc.nextLine();
           System.out.println("Ingrese el Nombre");
           if(aceptar.equals("Y")|| aceptar.equals("y") ){
               String reemplazo = sc.nextLine();
           arreglo[indiceBusqueda]=reemplazo;
           }
       }
   }
   
   private static int buscarRecursivo(String[] arreglo, String buscar, int indice){
        if (indice == arreglo.length) {
            return 12;
        }
        if (arreglo[indice].equals(buscar)) {
            return indice;
        }

        return buscarRecursivo(arreglo, buscar, indice + 1);
    }
   
   public static int[] concatenarArreglos(int[] arreglo1, int[] arreglo2) {
    int[] resultado = Arrays.copyOf(arreglo1, arreglo1.length + arreglo2.length);
    System.arraycopy(arreglo2, 0, resultado, arreglo1.length, arreglo2.length);
    return resultado;
}
   
   public static void menu(String[] nombres,int[] arreglo1, int[] arreglo2){
   Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Ordenar Descendente");
            System.out.println("2. Buscar");
            System.out.println("3. Concatenar");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    ordenarReversoRecursivo(nombres, 0, nombres.length - 1);
                    recorrer(nombres);
                    break;
                case 2:
                    buscar(nombres);
                    recorrer(nombres);
                    break;
                case 3:
                    int[] concatenado = concatenarArreglos(arreglo1, arreglo2);
                    System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
                    System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
                    System.out.println("Arreglo concatenado: " + Arrays.toString(concatenado));
        
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while(opcion != 4);
    }
   
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[] = new String[11];
        nombres[0]="Jefferson";
        nombres[1]="Arlette";
        nombres[2]="Leonardo";
        nombres[3]="Juan";
        nombres[4]="Kevin";
        nombres[5]="Danny";
        nombres[6]="Ricardo";
        nombres[7]="Nicolas";
        nombres[8]="Santiago";
        nombres[9]="Nicolas";
        nombres[10]="Anderson";
         
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6, 7};
         menu(nombres,arreglo1,arreglo2);
    
    }
    
}
