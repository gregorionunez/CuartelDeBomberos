/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/*
*
 *
 * @author Natasha
 */
public class brigada {
    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private int nro_cuartel;

    public brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public brigada() {
    
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
        
    }
    
    
}



