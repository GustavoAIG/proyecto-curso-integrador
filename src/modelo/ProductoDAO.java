package modelo;

import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            producto.setDisponibilidad(rs.getInt(7));
            producto.setIdtienda(rs.getInt(8));
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
            producto.setDisponibilidad(rs.getInt(7));
            producto.setIdtienda(rs.getInt(8));
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
            producto.setDisponibilidad(rs.getInt(7));
            producto.setIdtienda(rs.getInt(8));
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

public ProductoDTO registrarProducto(String nombreProducto, double precioProducto, int cantidadProducto, String categoriaProducto, int sedeProducto) {
    ProductoDTO nuevoProducto = null;
    try {
        String sql = "INSERT INTO productos (nom_pro, pre_pro, cant_pro, cat_pro, id_tien, est_pro, disponibilidad_pro) VALUES (?, ?, ?, ?, ?, ?, ?)";
        con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
        ps.setString(1, nombreProducto);
        ps.setDouble(2, precioProducto);
        ps.setInt(3, cantidadProducto);
        ps.setString(4, categoriaProducto);
        ps.setInt(5, sedeProducto);
        ps.setString(6, "con stock");
        ps.setInt(7, 1);

        int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                nuevoProducto = new ProductoDTO();
                nuevoProducto.setNombre(nombreProducto);
                nuevoProducto.setPrecio(precioProducto);
                nuevoProducto.setCantidad(cantidadProducto);
                nuevoProducto.setIdtienda(sedeProducto);
                nuevoProducto.setEstado("con stock");
                nuevoProducto.setDisponibilidad(1);
            }
        } catch (Exception e) {
            System.out.println("Error al registrar el producto: " + e.getMessage());
        }  finally {
            cerrarRecursos();
        }
        return nuevoProducto; 
    }

    private void cerrarRecursos() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
}


