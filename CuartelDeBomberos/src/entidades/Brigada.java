/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author Natasha
 */
public class Brigada {
    private int codigoBrigada;
    private String nombreBrigada;
    private Emergencia especialidad;
    private boolean estado;
    private int numeroCuartel;
    private boolean libre ;
    private List<Bombero> bomberos;

    public Brigada(String nombreBrigada, Emergencia especialidad, boolean estado, boolean libre) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.libre = libre;
    }

    public Brigada(String nombreBrigada, Emergencia especialidad, boolean estado, int numeroCuartel, boolean libre) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.numeroCuartel = numeroCuartel;
        this.libre = libre;
    }

    public Brigada(int codigoBrigada, String nombreBrigada, Emergencia especialidad, boolean estado, boolean libre) {
        this.codigoBrigada = codigoBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.libre = libre;
    }

    public Brigada() {
    }

    public int getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(int codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public Emergencia getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Emergencia especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroCuartel() {
        return numeroCuartel;
    }

    public void setNumeroCuartel(int numeroCuartel) {
        this.numeroCuartel = numeroCuartel;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public List<Bombero> getBomberos() {
        return bomberos;
    }

    public void setBomberos(List<Bombero> bomberos) {
        this.bomberos = bomberos;
    }

    @Override
    public String toString() {
        return nombreBrigada+" - "+especialidad;
    }
   
}
