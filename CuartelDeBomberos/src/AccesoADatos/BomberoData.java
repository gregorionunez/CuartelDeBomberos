package AccesoADatos;

import Entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BomberoData {

    private Connection con = null; //CREO UNA VARIABLE DE TIPO CONEXION

    public BomberoData() {
    }

    //AGREGO UN BOMBERO
    public void agregarBombero(Bombero bombero) {
        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "INSERT INTO bombero(dni, nombre, apellido, fecha_nac, celular, cod_brigada, estado, grupoSanguineo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            if (!existeBomberoPorDni(bombero.getDni())) {
                //CREO UNA CONEXION CON MI BASE DE DATOS
                con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
                ps.setInt(1, bombero.getDni()); //Asignacion de valores
                ps.setString(2, bombero.getNombre()); //Asignacion de valores
                ps.setString(3, bombero.getApellido()); //Asignacion de valores
                ps.setDate(4, Date.valueOf(bombero.getFechaNacimiento()));
                ps.setString(5, bombero.getCelular()); //Asignacion de valores
                ps.setInt(6, bombero.getCodigoBrigada()); //Asignacion de valores
                ps.setBoolean(7, true); //Asignacion de valores
                ps.setString(8, bombero.getGrupoSanguineo()); //Asignacion de valores
                ps.executeUpdate(); // Ejecutar PreparedStatement 
                JOptionPane.showMessageDialog(null, "Bombero añadido con éxito.", "Información", 1);
                ps.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "El Bombero ya existe en la base de datos", "Error", 0);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar Bombero " + ex.getMessage() , "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
        return;        
    }

    // MODIFICO UN BOMBERO
    public void modificarBombero(Bombero bombero) {
        String sql = "UPDATE bombero SET dni=?,nombre=?,apellido=?,fecha_nac=?,celular=?,cod_brigada=?,estado=?,grupoSanguineo=? WHERE id_bombero=?";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni()); //Asignacion de valores
            ps.setString(2, bombero.getNombre()); //Asignacion de valores
            ps.setString(3, bombero.getApellido()); //Asignacion de valores
            ps.setDate(4, Date.valueOf(bombero.getFechaNacimiento()));
            ps.setString(5, bombero.getCelular()); //Asignacion de valores
            ps.setInt(6, bombero.getCodigoBrigada()); //Asignacion de valores
            ps.setBoolean(7, bombero.isEstado()); //Asignacion de valores
            ps.setString(8, bombero.getGrupoSanguineo()); //Asignacion de valores
            ps.setInt(9, bombero.getId());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Bombero modificado con éxito", "Información", 1);
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no pudo modificarse ", "Información", 1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el Bombero", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
    }

    // ELIMINO UN BOMBERO
    public void eliminarBombero(int id) {
        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "UPDATE bombero SET estado=false WHERE id_bombero=" + id;
        try {
            if(existeBomberoPorId(id)){
                //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Bombero eliminado", "Información", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Imposible eliminar el Bombero", "Información", 1);
            }
            ps.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "El Bombero no existe en la Base de datos", "Error", 0);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
    }

    //RETORNO UNA LISTA DE BOMBEROS  
    public ArrayList<Bombero> listarBomberosSegunEstado(boolean estado) {
        //CREO MI LISTA DE BOMBEROS
        ArrayList<Bombero> bomberos = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero WHERE estado =" + estado; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Bombero bombero = new Bombero();
                bombero.setId(rs.getInt("id_bombero"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setFechaNacimiento(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoBrigada(rs.getInt("cod_brigada"));
                bombero.setEstado(rs.getBoolean("estado"));
                //AGREGO EL BOMBERO A LA LISTA
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
        //RETORNO LA LISTA DE BOMBEROS 
        return bomberos;
    }
    
    public boolean existeBomberoPorDni(int dni) {
        boolean existe = false;
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero WHERE dni =" + dni; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
        //RETORNO LA LISTA DE BOMBEROS 
        return existe;
    }
    
    public boolean existeBomberoPorId(int id) {
        boolean existe = false;
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero WHERE id_bombero =" + id; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
        //RETORNO LA LISTA DE BOMBEROS 
        return existe;
    }
    
    public ArrayList<Bombero> listarTodosLosBomberos() {
        //CREO MI LISTA DE BOMBEROS
        ArrayList<Bombero> bomberos = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Bombero bombero = new Bombero();
                bombero.setId(rs.getInt("id_bombero"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setFechaNacimiento(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoBrigada(rs.getInt("cod_brigada"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                //AGREGO EL BOMBERO A LA LISTA
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
        //RETORNO LA LISTA DE BOMBEROS 
        return bomberos;
    }
    
    public Bombero getBomberoPorId(int id) {
        Bombero bombero = null;
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero WHERE id_bombero =" + id; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bombero = new Bombero();
                bombero.setId(id);
                bombero.setDni(rs.getInt("dni"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setFechaNacimiento(rs.getDate("fecha_nac").toLocalDate());
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoBrigada(rs.getInt("cod_brigada"));
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        }
        finally{
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        } 
        //RETORNO BOMBEROS
        return bombero;
    }
}
