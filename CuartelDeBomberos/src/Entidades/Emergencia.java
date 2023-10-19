package Entidades;

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
        return emergencia;
    }
}
