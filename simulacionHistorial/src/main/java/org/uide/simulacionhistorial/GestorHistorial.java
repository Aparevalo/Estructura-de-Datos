/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.simulacionhistorial;

import java.util.Date;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Usuario iTC
 */
public class GestorHistorial {
    
    public Stack pila;

    public GestorHistorial() {
        pila = new Stack();
    }

    
    public Stack getPila() {
        return pila;
    }

    public void setPila(Stack pila) {
        this.pila = pila;
    }
    
    
    public void visitarWeb(PaginaWeb pagina){
    
        pila.push(pagina);
        System.out.println("Se agrego la web al historial");
    }
    
    public void cerrarWeb(){
    
        PaginaWeb pg = (PaginaWeb) pila.firstElement();
        pg.setHoraCierre(new Date());
        pila.set(0, pg);
        
    }
    
    public void eliminarWeb(){
    pila.pop();
        System.out.println("Se elimino el ultimo sitio web");
    }
    
    public PaginaWeb obtenerUiltimaWebVisitada(){
    
        return (PaginaWeb) pila.peek();
    } 
    
    
    
    public PaginaWeb obtenerUtilmaWebVisitadaDispositivo(String dispositivo){
     PaginaWeb ultimoElemento = null;
        for (Object o : pila) {
            PaginaWeb pw = (PaginaWeb) o;
            
            if (pw.getDispositivo().equals(dispositivo)) {
                ultimoElemento  = pw;
            }
        }
        return ultimoElemento;
       
    }
    
    public void historial(){
       for (Object o: pila) {
         PaginaWeb pw = (PaginaWeb) o;
           System.out.println(pw.toString());
        }
    }
}
