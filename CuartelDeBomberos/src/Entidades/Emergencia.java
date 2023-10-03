/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Emergencia {
    private int id;
    private String emergencia;

    public Emergencia() {
    }

    public Emergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public Emergencia(int id, String emergencia) {
        this.id = id;
        this.emergencia = emergencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    @Override
    public String toString() {
        return "Emergencia{" + "id=" + id + ", emergencia=" + emergencia + '}';
    }
}
