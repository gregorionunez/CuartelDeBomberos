/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Bombero {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String celular;
    private int codigoBrigada;
    private String grupoSanguineo;
    private boolean estado;

    public Bombero() {
    }

    public Bombero(int dni, String nombre, String apellido, Date fechaNacimiento, String celular, String grupoSanguineo, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    public Bombero(int dni, String nombre, String apellido, Date fechaNacimiento, String celular, int codigoBrigada, String grupoSanguineo, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    public Bombero(int id, int dni, String nombre, String apellido, Date fechaNacimiento, String celular, int codigoBrigada, String grupoSanguineo, boolean estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.codigoBrigada = codigoBrigada;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(int codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bombero{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", codigoBrigada=" + codigoBrigada + ", estado=" + estado + '}';
    }  
}
