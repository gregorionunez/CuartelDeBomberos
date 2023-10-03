
package Entidades;

//CLASE CUARTEL DE BOMBERO
public class Cuartel {
    
    private int codCuartel;  //CODIGO DEL CUARTEL
    private String nombre_cuartel; //NOMBRE DEL CUARTEL
    private String direccion; // DIRECCION
    private int coord_X; // COORDENA X DEL CUARTEL
    private int coord_Y; // COORDENA Y DEL CUARTEL
    private String telefono;  //TELEFONO DEL CUARTEL
    private String correo;  //CORREO ELECTRONICO DEL CUARTEL
    private boolean estado; //CORRESPONDE SI EL CUARTEL ESTA ACTIVO

    public Cuartel() {
    }

    public Cuartel(int codCuartel, String nombre_cuartel, String direccion, int coord_X, int coord_Y, String telefono, String correo, boolean estado) {
        this.codCuartel = codCuartel;
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombre_cuartel() {
        return nombre_cuartel;
    }

    public void setNombre_cuartel(String nombre_cuartel) {
        this.nombre_cuartel = nombre_cuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cuartel{" + "codCuartel=" + codCuartel + ", nombre_cuartel=" + nombre_cuartel + ", direccion=" + direccion + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
    
}
