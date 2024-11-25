package modelo;
import java.sql.Connection;
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
    public List<String> cargarNombresTiendas() {
        List<String> idsTiendas = new ArrayList<>();
        try {
            String sql = "SELECT nom_tien FROM tiendas";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                idsTiendas.add(rs.getString("nom_tien"));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los nombre de las tiendas: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return idsTiendas;
    }
    
    public int obtenerIdTiendaPorNombre(String nombreTienda) {
    int idTienda = -1; 
    try {
        String sql = "SELECT id_tien FROM tiendas WHERE nom_tien = ?";
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreTienda);
        rs = ps.executeQuery();
        if (rs.next()) {
            idTienda = rs.getInt("id_tien");
        }
    } catch (Exception e) {
        System.out.println("Error al obtener el ID de la tienda: " + e.getMessage());
    } finally {
        cerrarRecursos();
    }
    return idTienda; // Devuelve el ID o -1 si no se encontró
}
    
    
    private void cerrarRecursos() {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
    
    
}
