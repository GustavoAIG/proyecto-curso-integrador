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
public class PedidoDAO {
       ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<PedidoDTO> listarTodoPed() {
    String sql = "SELECT p.id_ped, p.cant_ped,p.fec_ped,p.id_prove,p.id_tien,p.id_adm, a.nom_adm ,p.id_pro FROM pedidos p JOIN administradores a ON p.id_adm = a.id_adm;";
    List<PedidoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            PedidoDTO ped = new PedidoDTO();
            ped.setId(rs.getInt(1));
            ped.setCantidad(rs.getInt(2));
            ped.setFecha(rs.getString(3));
            ped.setIdprove(rs.getInt(4));
            ped.setIdtienda(rs.getInt(5));
            ped.setIdadm(rs.getInt(6));
            ped.setNombreadm(rs.getString(7));
            ped.setIdpro(rs.getInt(8));
            lista.add(ped);
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
