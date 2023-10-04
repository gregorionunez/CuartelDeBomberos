/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author Natasha
 */
public class Brigada {
    private int codigoBrigada;
    private String nombreBrigada;
    private Emergencia especialiad;
    private boolean estado;
    private int numeroCuartel;
    private boolean libre ;
    private  List <Bombero> bomberos;

    public Brigada(String nombreBrigada, Emergencia especialiad, boolean estado, boolean libre) {
        this.nombreBrigada = nombreBrigada;
        this.especialiad = especialiad;
        this.estado = estado;
        this.libre = libre;
    }

    public Brigada(String nombreBrigada, Emergencia especialiad, boolean estado, int numeroCuartel, boolean libre) {
        this.nombreBrigada = nombreBrigada;
        this.especialiad = especialiad;
        this.estado = estado;
        this.numeroCuartel = numeroCuartel;
        this.libre = libre;
    }

    public Brigada(int codigoBrigada, String nombreBrigada, Emergencia especialiad, boolean estado, boolean libre) {
        this.codigoBrigada = codigoBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialiad = especialiad;
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

    public Emergencia getEspecialiad() {
        return especialiad;
    }

    public void setEspecialiad(Emergencia especialiad) {
        this.especialiad = especialiad;
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
        return "Brigada{" + "codigoBrigada=" + codigoBrigada + ", nombreBrigada=" + nombreBrigada + ", especialiad=" + especialiad + ", estado=" + estado + ", numeroCuartel=" + numeroCuartel + ", libre=" + libre + ", bomberos=" + bomberos + '}';
    }
   
}
