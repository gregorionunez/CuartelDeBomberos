package Entidades;

import java.util.Date;

public class Siniestro {
    
    private int codigo;
    private Emergencia tipoEmergencia;
    private Date fecha;
    private int coordX;
    private int coordY;
    private String detalles;
    private Date fechaResolucion;
    private int puntuacion;
    private int codBrigada;
    private boolean estado;

    public Siniestro() {
    }

    public Siniestro(Emergencia tipoEmergencia, Date fecha, int coordX, int coordY, String detalles, Date fechaResolucion, int puntuacion, int codBrigada, boolean estado) {
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

    public Siniestro(Emergencia tipoEmergencia, Date fecha, int coordX, int coordY, String detalles, int codBrigada, boolean estado) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
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
        return "Siniestro{" + "codigo=" + codigo + ", tipoEmergencia=" + tipoEmergencia + ", fecha=" + fecha + ", coordX=" + coordX + ", coordY=" + coordY + ", detalles=" + detalles + ", fechaResolucion=" + fechaResolucion + ", puntuacion=" + puntuacion + ", codBrigada=" + codBrigada + ", estado=" + estado + '}';
    }
    
    
    
    
}
