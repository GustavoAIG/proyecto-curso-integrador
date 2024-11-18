package modelo;

import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class ProductoDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<ProductoDTO> listarPorCategoria(String categoria) {
    String sql = "SELECT * FROM productos WHERE cat_pro = ? AND est_pro = 'con stock';";
    List<ProductoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, categoria);
        rs = ps.executeQuery();
        while (rs.next()) {
            ProductoDTO producto = new ProductoDTO();
            producto.setId(rs.getInt(1));
            producto.setNombre(rs.getString(2));
            producto.setCategoria(rs.getString(3));
            producto.setPrecio(rs.getDouble(4));
            producto.setCantidad(rs.getInt(5));
            producto.setEstado(rs.getString(6));
            producto.setIdtienda(rs.getInt(7));
            lista.add(producto);
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

public List<ProductoDTO> listarTodoPro() {
    String sql = "SELECT * FROM productos WHERE est_pro = 'con stock';";
    List<ProductoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            ProductoDTO producto = new ProductoDTO();
            producto.setId(rs.getInt(1));
            producto.setNombre(rs.getString(2));
            producto.setCategoria(rs.getString(3));
            producto.setPrecio(rs.getDouble(4));
            producto.setCantidad(rs.getInt(5));
            producto.setEstado(rs.getString(6));
            producto.setIdtienda(rs.getInt(7));
            lista.add(producto);
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

public List<ProductoDTO> BuscarPro(int id) {
    String sql = "SELECT * FROM productos WHERE id_pro = ? AND est_pro = 'con stock';";
    List<ProductoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            ProductoDTO producto = new ProductoDTO();
            producto.setId(rs.getInt(1));
            producto.setNombre(rs.getString(2));
            producto.setCategoria(rs.getString(3));
            producto.setPrecio(rs.getDouble(4));
            producto.setCantidad(rs.getInt(5));
            producto.setEstado(rs.getString(6));
            producto.setIdtienda(rs.getInt(7));
            lista.add(producto);
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
