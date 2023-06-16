/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.simulacionhistorial;

import java.util.Date;

/**
 *
 * @author Usuario iTC
 */
public class PaginaWeb {
    public String nombre;
    public String ruta;
    public Date horaVisita;
    public byte[] icono;
    public Date horaCierre;
    public String dispositivo;

    public PaginaWeb(String nombre, String ruta, Date horaVisita, byte icono[], Date horaCierre, String dispositivo) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaVisita = horaVisita;
        this.icono = icono;
        this.horaCierre = horaCierre;
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(Date horaVisita) {
        this.horaVisita = horaVisita;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    public Date getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Date horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" + "nombre=" + nombre + ", ruta=" + ruta + ", horaVisita=" + horaVisita + ", icono=" + icono + ", horaCierre=" + horaCierre + ", dispositivo=" + dispositivo + '}';
    }
    
    
}
