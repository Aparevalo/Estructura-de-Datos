/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.simulacionbanco;

/**
 *
 * @author Usuario iTC
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BancoSimulacion {
    private Queue<String> filaClientes;
    private int clientesAtendidos;
    private int tiempoTotalEspera;

    public BancoSimulacion() {
        filaClientes = new LinkedList<>();
        clientesAtendidos = 0;
        tiempoTotalEspera = 0;
    }

    public void llegadaCliente(String cliente) {
        filaClientes.add(cliente);
        System.out.println("Llego un nuevo cliente: " + cliente);
    }

    public void atencionCliente() {
        if (!filaClientes.isEmpty()) {
            String cliente = filaClientes.poll();
            System.out.println("Atendiendo al cliente: " + cliente);
            Random rand = new Random();
            int tiempoEspera = rand.nextInt(6) + 1; 
            tiempoTotalEspera += tiempoEspera;
            clientesAtendidos++;
            System.out.println("Cliente atendido. Tiempo de espera: " + tiempoEspera + " minutos.");
        } else {
            System.out.println("No hay clientes en la fila.");
        }
    }

    public void simulación(int duracionSimulacion, int hora) {
        System.out.println("Iniciando simulacion del banco por " + duracionSimulacion + " minutos.");
        int tiempoTranscurrido = 0;
        int concurrencia=0;
        switch(hora){
            case 1: concurrencia = 9;break;
            case 2: concurrencia = 8 ;break;
            case 3: concurrencia = 7; break;
            default: concurrencia = 8;break;
        }
        Random rand = new Random();

        while (tiempoTranscurrido < duracionSimulacion) {
             int numAleatorio = rand.nextInt(10);
            if (numAleatorio < concurrencia) {
            int numClientes = rand.nextInt(3);
            
            for (int i = 0; i < numClientes; i++) {
                String nuevoCliente = "Cliente " + (clientesAtendidos + 1+i);
                llegadaCliente(nuevoCliente);
            }
        }

            atencionCliente();

            tiempoTranscurrido++;
        }

        System.out.println("Simulacion finalizada. Resultados:");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Tiempo promedio de espera: " + (double) tiempoTotalEspera / clientesAtendidos + " minutos.");
    }
}