package modelo;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class EmpleadoDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<EmpleadoDTO> listarTodoEmp() {
    String sql = "SELECT * FROM empleados;";
    List<EmpleadoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            EmpleadoDTO emp = new EmpleadoDTO();
            emp.setId(rs.getInt(1));
            emp.setNombre(rs.getString(2));
            emp.setApellido(rs.getString(3));
            emp.setIdusu(rs.getInt(4));
            emp.setIdtienda(rs.getInt(5));
            lista.add(emp);
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
  
    public EmpleadoDTO registrarEmpleado(String nombreEmpleado, String apellidoEmpleado, int idTiendaEmpleado, int idUsuarioEmpleado) {
        EmpleadoDTO nuevoEmpleado = null;
        try {
            String sql = "INSERT INTO empleados (nom_emp, ape_emp, id_tien, id_usu) VALUES (?, ?, ?, ?)";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreEmpleado);
            ps.setString(2, apellidoEmpleado);
            ps.setInt(3, idTiendaEmpleado);
            ps.setInt(4, idUsuarioEmpleado);

            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                nuevoEmpleado = new EmpleadoDTO();
                nuevoEmpleado.setNombre(nombreEmpleado);
                nuevoEmpleado.setApellido(apellidoEmpleado);
                nuevoEmpleado.setIdtienda(idTiendaEmpleado);
                nuevoEmpleado.setIdusu(idUsuarioEmpleado);
            }
        } catch (Exception e) {
            System.out.println("Error al registrar el empleado: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return nuevoEmpleado; 
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
    
  public boolean ActualizarPro(ProductoDTO pro) {
    String sql = "UPDATE productos SET nom_pro = ?, cat_pro = ?, pre_pro = ?, cant_pro= ?, id_tien = ? WHERE id_pro = ? AND est_pro = 'con stock';";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getNombre());
        ps.setString(2, pro.getCategoria());
        ps.setDouble(3, pro.getPrecio());
        ps.setInt(4, pro.getCantidad());
        ps.setInt(5, pro.getIdtienda());
        ps.setInt(6, pro.getId());
        int filas = ps.executeUpdate();
        return filas > 0;
    } catch (Exception e) {
        System.out.println("Error al actualizar: " + e);
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return false;
} 
  
  public boolean sumar(int id, int cantidad) {
    String sql = "UPDATE productos SET cant_pro = cant_pro + ? WHERE id_pro = ? AND est_pro = 'con stock';";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, cantidad);
        ps.setInt(2, id);
        int filas = ps.executeUpdate();
        return filas > 0;
    } catch (Exception e) {
        System.out.println("Error al agregar cantidad: " + e);
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return false;
}

    public boolean restar(int id, int cantidad) {
    String restar = "UPDATE productos SET cant_pro = cant_pro - ? WHERE id_pro = ? AND est_pro = 'con stock' AND cant_pro >= ?;";
    String cantidadbd = "SELECT cant_pro FROM productos WHERE id_pro = ?;";
    String sinstock = "UPDATE productos SET est_pro = 'sin stock' WHERE id_pro = ? AND cant_pro = 0;";

    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(restar);
        ps.setInt(1, cantidad);
        ps.setInt(2, id);
        ps.setInt(3, cantidad);
        int filas = ps.executeUpdate();
        if (filas == 0) {
            return false;
        }
        ps = con.prepareStatement(cantidadbd);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        int cantbd = 0;
        if (rs.next()) {
            cantbd = rs.getInt(1);
        }
        if (cantbd == 0) {
            ps = con.prepareStatement(sinstock);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        return true;
    } catch (Exception e) {
        System.out.println("Error al eliminar cantidad: " + e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return false;
}

 public boolean pedirPro(int idPro, int cantidad, int idProve, int idTienda, int idAdm) {
    String sql = "INSERT INTO pedidos (cant_ped, fec_ped, est_ped, id_prove, id_tien, id_adm, id_pro) VALUES (?, NOW(), 'pendiente', ?, ?, ?, ?);";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, cantidad);
        ps.setInt(2, idProve);
        ps.setInt(3, idTienda);
        ps.setInt(4, idAdm);
        ps.setInt(5, idPro);
        int rowsInserted = ps.executeUpdate();
        return rowsInserted > 0;
    } catch (Exception e) {
        System.out.println("Error al insertar pedido: " + e);
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return false;
}

public List<ProductoDTO> listarProSinStock() {
    String sql = "SELECT p.*, t.nom_tien FROM productos p LEFT JOIN tiendas t ON p.id_tien = t.id_tien WHERE p.est_pro = 'sin stock';";
    
    List<ProductoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            ProductoDTO producto = new ProductoDTO();
            producto.setId(rs.getInt("id_pro"));
            producto.setNombre(rs.getString("nom_pro"));
            producto.setCategoria(rs.getString("cat_pro"));
            producto.setPrecio(rs.getDouble("pre_pro"));
            producto.setCantidad(rs.getInt("cant_pro"));
            producto.setEstado(rs.getString("est_pro"));
            producto.setIdtienda(rs.getInt("id_tien"));
            producto.setNomtienda(rs.getString("nom_tien")); 
            lista.add(producto);
        }
    } catch (Exception e) {
        System.out.println("Error listar productos sin stock: " + e);
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

public List<ProductoDTO> listarProEliminado() {
    String sql = "SELECT * FROM productos WHERE disponibilidad_pro = 0;";
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
        System.out.println("Error listar productos sin stock: " + e);
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

public boolean actualizarPed(int idPedido) {
    String sql = "UPDATE pedidos SET est_ped = 'recibido' WHERE id_ped = ?;";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, idPedido);
        int rowsUpdated = ps.executeUpdate();
        return rowsUpdated > 0;
    } catch (Exception e) {
        System.out.println("Error al actualizar estado del pedido: " + e);
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return false;
}

   public List<PedidoDTO> listarTodoPed() {
    String sql = "SELECT * FROM pedidos;";
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
            ped.setEstado(rs.getString(4));
            ped.setIdprove(rs.getInt(5));
            ped.setIdtienda(rs.getInt(6));
            ped.setIdadm(rs.getInt(7));
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
public int obtenerIdAdministrador(int idUsuario) {
    int idAdmin = -1;
    String sql = "SELECT id_adm FROM administradores WHERE id_usu = ?";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            idAdmin = rs.getInt(1);
        }
    } catch (Exception e) {
        System.out.println("Error al obtener id del administrador: " + e);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.out.println("Error cerrando la conexión: " + ex);
        }
    }
    return idAdmin;
}
}
