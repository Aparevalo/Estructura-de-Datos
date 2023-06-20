/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.cnvertirabinario;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Usuario iTC
 */
public class CnvertiraBinario {

   public static String decimalABinario(int numeroDecimal) {
        Stack<Integer> pila = new Stack<>();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            pila.push(residuo);
            numeroDecimal /= 2;
        }

        StringBuilder numeroBinario = new StringBuilder();
        while (!pila.isEmpty()) {
            numeroBinario.append(pila.pop());
        }

        return numeroBinario.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int decimal = sc.nextInt();
        String binario = decimalABinario(decimal);
        System.out.println("El numero: " + decimal + " en binario es:  " + binario);
    }
}
