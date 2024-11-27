package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistroDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     
public boolean registrarOperacion(RegistroDTO registro) {
    boolean registrado = false;
    try {
        String sql = "INSERT INTO registros (nom_reg, fec_reg, cant_reg, oper_reg, id_pro) VALUES (?, CURDATE(), ?, ?, ?)";
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, registro.getNombrepro());
        ps.setInt(2, registro.getCantidad());
        ps.setString(3, registro.getOperacion());
        ps.setInt(4, registro.getId_pro());

        int filasInsertadas = ps.executeUpdate();
        registrado = filasInsertadas > 0;
    } catch (Exception e) {
        System.out.println("Error al registrar la operación: " + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return registrado;
}

}
