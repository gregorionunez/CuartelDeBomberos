/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Emergencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Natasha
 */
public class BrigadaData {

    // se creo la variable de tipo conexion
    private Connection con = null;
    Emergencia emergencia = new Emergencia();

    public void agregarBrigada(Brigada brigada) {
        // sentencia sql
        String sql = "INSERT INTO brigada(nombre_br,especialidad,libre,nro_cuartel,estado) VALUE (?,?,?,?,?)";
        // creo una conexion con mi base de dato
        try {
            con = Conexion.getConexion();
            // consulta sql
            PreparedStatement ps = con.prepareStatement(sql);
            // le asigno los valores
            ps.setString(1, brigada.getNombreBrigada());
            ps.setInt(2, brigada.getEspecialidad().getId());
            ps.setBoolean(3, true);
            ps.setInt(4, brigada.getNumeroCuartel());
            ps.setBoolean(5, true);
            ps.executeUpdate(); // Ejecutar PreparedStatement
            JOptionPane.showMessageDialog(null, "brigada agregada exitosamente.", "Información", 1);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar brigada ", "Error", 0);
        } finally {
            // cierro mi conexion
            Conexion.cerrarConexion(con);
        }
    }

    // modificar brigada
    public void modificarBrigada(Brigada brigada) {
        String sql = "UPDATE brigada SET nombre_br=?,especialidad=?,libre=?,nro_cuartel=?,estado=? WHERE cod_brigada=brigada.getId";
        try {
            //creo una conexion con mi base de datos
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            // le asigno los valores 
            ps.setString(1, brigada.getNombreBrigada());
            ps.setInt(2, brigada.getEspecialidad().getId());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNumeroCuartel());
            ps.setBoolean(5, brigada.isEstado());
            ps.executeUpdate(); // Ejecutar PreparedStatement
            JOptionPane.showMessageDialog(null, "brigada modificada con éxito", "Información", 1);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el brigada ", "Error", 0);
        }
        //cierro mi conexion 
        Conexion.cerrarConexion(con);
    }

    public void dispBrigada(int idBrigada, boolean libre) {
        String sql = "UPDATE brigada SET libre=? WHERE cod_brigada=" + idBrigada;
        try {
            //creo una conexion con mi base de datos
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            // le asigno los valores 
            ps.setBoolean(1, libre);
            ps.executeUpdate(); // Ejecutar PreparedStatement
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el brigada ", "Error", 0);
        }
        //cierro mi conexion 
        Conexion.cerrarConexion(con);
    }

    // elimino brigada
    public void eliminarBrigada(int id) {
        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "UPDATE brigada SET estado=false WHERE cod_brigada=" + id;
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Brigada eliminada", "Información", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Imposible eliminar la Brigada", "Información", 1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar ", "Error", 0);
        }
        //cierro conexion 
        Conexion.cerrarConexion(con);
    }

    //RETORNO UNA LISTA DE BRIGADAS
    public ArrayList<Brigada> listarBrigadasSegunEstado(boolean estado) {
        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada WHERE estado =" + estado; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Brigada brigada = new Brigada();
                brigada.setCodigoBrigada(rs.getInt("cod_brigada"));
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                emergencia = emergenciaData.buscarEmergencia(rs.getInt("especialidad"));
                brigada.setEspecialidad(emergencia);
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(rs.getBoolean("estado"));
                //AGREGO LA BRIGADA A LA LISTA
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada ", "Error", 0);
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
        return brigadas;
    }

    public ArrayList<Brigada> listarBrigadas() {
        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada "; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Brigada brigada = new Brigada();
                brigada.setCodigoBrigada(rs.getInt("cod_brigada"));
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                emergencia = emergenciaData.buscarEmergencia(rs.getInt("especialidad"));
                brigada.setEspecialidad(emergencia);
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                //AGREGO EL BOMBERO A LA LISTA
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada ", "Error", 0);
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
        return brigadas;
    }

    // listar brigadas por  
    public ArrayList<Brigada> listarBrigadasPorCuartel(int idCuartel) {

        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada WHERE nro_cuartel= " + idCuartel; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //creo una brigada Y lo voy cargando
                Brigada brigada = new Brigada();
                brigada.setCodigoBrigada(rs.getInt("cod_brigada"));
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                emergencia = emergenciaData.buscarEmergencia(rs.getInt("especialidad"));
                brigada.setEspecialidad(emergencia);
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(rs.getBoolean("estado"));
                //agrego brigada a la lista 
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Brigada ", "Error", 0);
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
        return brigadas;
    }

    public ArrayList<Bombero> listarBomerosPorBrigadas(int idBrigada) {
        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Bombero> bomberos = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM bombero WHERE cod_brigada = " + idBrigada; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //creo una brigada Y lo voy cargando
                Bombero bombero = new Bombero();
                bombero.setId(rs.getInt("id_bombero"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setFechaNacimiento(rs.getDate("fecha_nac").toLocalDate());
                bombero.setCelular(rs.getString("celular"));
                bombero.setCodigoBrigada(rs.getInt("cod_brigada"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bombero.setEstado(rs.getBoolean("estado"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        } //CUANDO TERMINA TODO CIERRO MI CONEXION
        finally {
            Conexion.cerrarConexion(con);
        }
        return bomberos;
    }

    //RETORNO UNA LISTA DE BRIGADAS
    public ArrayList<Brigada> listarBrigadasSegunDisponibilidad(boolean estado) {
        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada WHERE libre =" + estado; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Brigada brigada = new Brigada();
                brigada.setCodigoBrigada(rs.getInt("cod_brigada"));
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                emergencia = emergenciaData.buscarEmergencia(rs.getInt("especialidad"));
                brigada.setEspecialidad(emergencia);
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(rs.getBoolean("estado"));
                //AGREGO LA BRIGADA A LA LISTA
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada ", "Error", 0);
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
        return brigadas;
    }

    public ArrayList<Brigada> brigadasPorEstadoYDisponibilidad(boolean estado, boolean disponibilidad) {
        //CREO MI LISTA DE BRIGADAS
        EmergenciaData emergenciaData = new EmergenciaData();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada WHERE estado =" + estado + " AND libre =" + disponibilidad; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //CREO UN BOMBERO Y LO VOY CARGANDO
                Brigada brigada = new Brigada();
                brigada.setCodigoBrigada(rs.getInt("cod_brigada"));
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                emergencia = emergenciaData.buscarEmergencia(rs.getInt("especialidad"));
                brigada.setEspecialidad(emergencia);
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(rs.getBoolean("estado"));
                //AGREGO EL BOMBERO A LA LISTA
                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada ", "Error", 0);
        } finally {
            //CUANDO TERMINA TODO CIERRO MI CONEXION
            Conexion.cerrarConexion(con);
        }
        return brigadas;
    }

    public Brigada brigadaPorId(int id) {

        Brigada brigada = new Brigada();
        EmergenciaData emergenciaData = new EmergenciaData();

        try {
            //CREO LA CONEXION
            con = Conexion.getConexion();
            String sql = "SELECT * FROM brigada WHERE cod_brigada = " + id; //EJECUTO EL SELECT
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                brigada.setCodigoBrigada(id);
                brigada.setNombreBrigada(rs.getString("nombre_br"));
                brigada.setEspecialidad(emergenciaData.buscarEmergencia(rs.getInt("especialidad")));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(rs.getInt("nro_cuartel"));
                brigada.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero ", "Error", 0);
        } //CUANDO TERMINA TODO CIERRO MI CONEXION
        finally {
            Conexion.cerrarConexion(con);
        }
        return brigada;
    }
}
