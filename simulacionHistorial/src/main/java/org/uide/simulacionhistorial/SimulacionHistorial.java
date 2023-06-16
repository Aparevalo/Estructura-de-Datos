/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.simulacionhistorial;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class SimulacionHistorial {

    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<3;i++){
            System.out.println("Ingresa el nombre de la web");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese direecion de la web");
            String direccion = entrada.nextLine();
            System.out.println("Desde que dispositivo ingresas");
            String dispositivo = entrada.nextLine();
            gestor.visitarWeb(new PaginaWeb(nombre,direccion,new Date(),null,null,dispositivo));
        }
        gestor.historial();
        System.out.println("--------------------------");
        System.out.println(gestor.obtenerUiltimaWebVisitada().toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUiltimaWebVisitada().toString());
        gestor.eliminarWeb();
        System.out.println(gestor.obtenerUiltimaWebVisitada().toString());
        
        System.out.println("--------------------------");
        System.out.println("Ingrese dispositivo");
        String dis = entrada.nextLine();
        System.out.println(gestor.obtenerUtilmaWebVisitadaDispositivo(dis).toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUtilmaWebVisitadaDispositivo(dis).toString());
        gestor.eliminarWeb();
        System.out.println(gestor.obtenerUtilmaWebVisitadaDispositivo(dis).toString());
       
        
       
    }
}
