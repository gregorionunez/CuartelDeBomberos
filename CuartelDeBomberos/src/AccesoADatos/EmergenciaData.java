package AccesoADatos;

import Entidades.Emergencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmergenciaData {

    private Connection con = null;
    

    public EmergenciaData() {
    }
    
    public Emergencia buscarEmergencia(int id){
        
        Emergencia emergencia = new Emergencia();
        
        String sql = "SELECT * FROM emergencia WHERE idEmergencia = ?";

        try {
            con = Conexion.getConexion();

            PreparedStatement ps;
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                emergencia.setId(id);
                emergencia.setEmergencia(rs.getString("emergencia"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro.", "ERROR", 0);
        } finally {
            Conexion.cerrarConexion(con);
        }
        
        return emergencia;
    }
    
    public ArrayList<Emergencia> listarEmergencia(){
        
        Emergencia emergencia = new Emergencia();
        
        ArrayList<Emergencia> emergencias = new ArrayList<>();
        
         String sql = "SELECT * FROM emergencia";

        try {
            con = Conexion.getConexion();

            PreparedStatement ps;
            ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                emergencias.add(new Emergencia(rs.getInt("idEmergencia"), rs.getString("emergencia")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Emergencia.", "ERROR", 0);
        } finally {
            Conexion.cerrarConexion(con);
        }
        
        return emergencias;
        
    }

}
