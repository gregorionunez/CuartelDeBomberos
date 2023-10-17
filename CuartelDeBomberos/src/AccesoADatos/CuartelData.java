package AccesoADatos;

import Entidades.Coordenada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CuartelData {

    private Connection con = null; //CREO MI ATRIBUTO CONEXION

    //CONSTRUCTOR VACIO
    public CuartelData() {
    }

    //AGREGO UN CUARTEL
    public void agregarCuartel(Cuartel cuartel) {
        //SENTENCIA SQL
        String sql = "INSERT INTO cuartel(nombre_cuartel, direccion, cod_x, cod_y, telefono, correo, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setString(1, cuartel.getNombreCuartel()); //Asignacion de valores
            ps.setString(2, cuartel.getDireccion()); //Asignacion de valores
            ps.setInt(3, cuartel.getCoordX());
            ps.setInt(4, cuartel.getCoordY()); //Asignacion de valores
            ps.setString(5, cuartel.getTelefono()); //Asignacion de valores
            ps.setString(6, cuartel.getCorreo()); //Asignacion de valores
            ps.setBoolean(7, true); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement 
            JOptionPane.showMessageDialog(null, "Cuartel añadido con éxito.", "Información", 1);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar Cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }

    }

    //MODIFICO UN CUARTEL
    public void modificarCuartel(Cuartel cuartel) {
        //SENTENCIA SQL
        String sql = "UPDATE cuartel SET nombre_cuartel=?,direccion=?,cod_x=?,cod_y=?,telefono=?,correo=?,estado=? WHERE cod_cuartel=?";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setString(1, cuartel.getNombreCuartel()); //Asignacion de valores
            ps.setString(2, cuartel.getDireccion()); //Asignacion de valores
            ps.setInt(3, cuartel.getCoordX());
            ps.setInt(4, cuartel.getCoordY()); //Asignacion de valores
            ps.setString(5, cuartel.getTelefono()); //Asignacion de valores
            ps.setString(6, cuartel.getCorreo()); //Asignacion de valores
            ps.setBoolean(7, cuartel.isEstado()); //Asignacion de valores
            ps.setInt(8, cuartel.getCodCuartel());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente", "Información", 1);
            } else {
                JOptionPane.showMessageDialog(null, "El cuartel no pudo modificarse ", "Información", 1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el Cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
    }

    //ELIMINO UN CUARTEL
    public void eliminarCuartel(int id) {
        //SENTENCIA SQL
        String sql = "UPDATE cuartel SET estado=false WHERE cod_cuartel=" + id;
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Cuartel eliminado", "Información", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Imposible eliminar el cuartel", "Información", 1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
    }

    public boolean exiteCuartel(int id) {
        boolean existe = false; //SI EXISTE EL CUARTEL
        String sql = "SELECT * FROM cuartel WHERE cod_cuartel=" + id;  //SENTENCIA SQL
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql); // INICIO LA CONSULTA
            ResultSet rs = ps.executeQuery(); //EJECUTO LA SENTENCIA SQL
            if (rs.next()) { //SI DEVUELVE UNA TABLA EXITE EL ID Y RETORNO TRUE
                existe = true;
            }
            ps.close(); // CIERRO EL PREPARESTATEMENT
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
        return existe;
    }

    //LISTADO DE CUARTELES
    public ArrayList<Cuartel> listarCuarteles() {
        ArrayList<Cuartel> cuarteles = new ArrayList();
        String sql = "SELECT * FROM cuartel";  //SENTENCIA SQL
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql); // INICIO LA CONSULTA
            ResultSet rs = ps.executeQuery(); //EJECUTO LA SENTENCIA SQL
            while (rs.next()) { //SI DEVUELVE UNA TABLA EXITE EL ID Y RETORNO TRUE
                Cuartel unCuartel = new Cuartel();
                unCuartel.setCodCuartel(rs.getInt("cod_cuartel"));
                unCuartel.setNombreCuartel(rs.getString("nombre_cuartel"));
                unCuartel.setDireccion(rs.getString("direccion"));
                unCuartel.setCoordX(rs.getInt("cod_x"));
                unCuartel.setCoordY(rs.getInt("cod_y"));
                unCuartel.setTelefono(rs.getString("telefono"));
                unCuartel.setCorreo(rs.getString("correo"));
                unCuartel.setEstado(rs.getBoolean("estado"));
                cuarteles.add(unCuartel);
            }
            ps.close(); // CIERRO EL PREPARESTATEMENT
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
        return cuarteles;
    }

    //LISTADO DE CUARTELES MAS CERCANOS
    public HashMap<Integer, Cuartel> listarCuartelesCercanos(int x, int y) {
        HashMap<Integer, Cuartel> cuartelesCercanos = new HashMap();

        Coordenada puntoABuscar = new Coordenada(x, y);
        ArrayList<Cuartel> cuartelesList = new ArrayList();
        cuartelesList = listarCuarteles();

        // Ordenar por la coordenada x,y
        Collections.sort(cuartelesList, new Comparator<Cuartel>() {
            public int compare(Cuartel cuartelPri, Cuartel cuartelSeg) {
                Coordenada c1 = new Coordenada(cuartelPri.getCoordX(), cuartelPri.getCoordY());
                Coordenada c2 = new Coordenada(cuartelSeg.getCoordX(), cuartelSeg.getCoordY());
                double distanciaC1 = calcularDistancia(c1, puntoABuscar);
                double distanciaC2 = calcularDistancia(c2, puntoABuscar);
                return Double.compare(distanciaC1, distanciaC2);
            }
        });
        int contador = 0;
        for (Cuartel cuartel : cuartelesList) {
            cuartelesCercanos.put(contador, cuartel);
            contador++;
        }

        return cuartelesCercanos;
    }

    public Cuartel buscarCuartel(int id) {
        String sql = "SELECT * FROM cuartel WHERE cod_cuartel=" + id;  //SENTENCIA SQL
        Cuartel unCuartel = new Cuartel();
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql); // INICIO LA CONSULTA
            ResultSet rs = ps.executeQuery(); //EJECUTO LA SENTENCIA SQL
            if (rs.next()) { //SI DEVUELVE UNA TABLA EXITE EL ID Y RETORNO TRUE
                unCuartel.setCodCuartel(rs.getInt("cod_cuartel"));
                unCuartel.setNombreCuartel(rs.getString("nombre_cuartel"));
                unCuartel.setDireccion(rs.getString("direccion"));
                unCuartel.setCoordX(rs.getInt("cod_x"));
                unCuartel.setCoordY(rs.getInt("cod_y"));
                unCuartel.setTelefono(rs.getString("telefono"));
                unCuartel.setCorreo(rs.getString("correo"));
                unCuartel.setEstado(rs.getBoolean("estado"));
            }
            ps.close(); // CIERRO EL PREPARESTATEMENT
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar cuartel", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
        return unCuartel;
    }

    // Método para calcular la distancia entre dos coordenadas
    public static double calcularDistancia(Coordenada c1, Coordenada c2) {
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
