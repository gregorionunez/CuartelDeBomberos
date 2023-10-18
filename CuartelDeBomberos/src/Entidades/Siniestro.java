package Entidades;

import java.time.LocalDate;

public class Siniestro {
    
    private int codigo;
    private Emergencia tipoEmergencia;
    private LocalDate fecha;
    private int coordX;
    private int coordY;
    private String detalles;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private int codBrigada;
    private boolean estado;

    public Siniestro() {
    }

    public Siniestro(int codigo, Emergencia tipoEmergencia, LocalDate fecha, int coordX, int coordY, String detalles, LocalDate fechaResolucion, int puntuacion, int codBrigada, boolean estado) {
        this.codigo = codigo;
        this.tipoEmergencia = tipoEmergencia;
        this.fecha = fecha;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }
    
    public Siniestro(Emergencia tipoEmergencia, LocalDate fecha, int coordX, int coordY, String detalles, LocalDate fechaResolucion, int puntuacion, int codBrigada, boolean estado) {
        this.tipoEmergencia = tipoEmergencia;
        this.fecha = fecha;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public Siniestro(Emergencia tipoEmergencia, LocalDate fecha, int coordX, int coordY, String detalles, int codBrigada, boolean estado) {
        this.tipoEmergencia = tipoEmergencia;
        this.fecha = fecha;
        this.coordX = coordX;
        this.coordY = coordY;
        this.detalles = detalles;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Emergencia getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(Emergencia tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cod: "+codigo+" - Fecha: "+fecha.toString()+" - "+"X: "+coordX+"- Y: "+coordY+" - Detalle: "+detalles;
    }
       
    
}
