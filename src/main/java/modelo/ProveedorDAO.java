package modelo;
import modelo.ProveedorDTO;
import java.sql.Connection;
import controlador.ConexionBD;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class ProveedorDAO {
  ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<ProveedorDTO> listarTodoProvee() {
    String sql = "SELECT p.id_prove, p.nom_prove, p.anio_prove, p.id_pro, pr.nom_pro, p.id_tien  FROM proveedores p JOIN productos pr ON p.id_pro = pr.id_pro;";
    List<ProveedorDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            ProveedorDTO pro = new ProveedorDTO();
            pro.setId(rs.getInt(1));
            pro.setNombre(rs.getString(2));
            pro.setAnio(rs.getInt(3));
            pro.setIdpro(rs.getInt(4));
            pro.setNombrepro(rs.getString(5));
            pro.setIdtienda(rs.getInt(6));
            lista.add(pro);
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
