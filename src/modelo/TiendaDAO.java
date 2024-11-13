package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
import controlador.ConexionBD;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
public class TiendaDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<TiendaDTO> listarTodoTie() {
    String sql = "SELECT * FROM tiendas;";
    List<TiendaDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            TiendaDTO tie = new TiendaDTO();
            tie.setId(rs.getInt(1));
            tie.setNombre(rs.getString(2));
            tie.setDireccion(rs.getString(3));
            tie.setTele(rs.getInt(4));
            lista.add(tie);
        }
    } catch (Exception e) {
        System.out.println("Error listar: " + e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return lista;
}
}
