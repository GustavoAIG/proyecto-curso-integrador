package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class AdministradorDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
public boolean ActualizarEmp(EmpleadoDTO emp) {
    String sql = "UPDATE empleados SET nom_emp = ?, ape_emp = ?, id_tien = ? WHERE id_emp = ?";
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setInt(3, emp.getIdtienda());
        ps.setInt(4, emp.getId());
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

   public List<EmpleadoDTO> BuscarEmp(int id) {
    String sql = "SELECT * FROM empleados WHERE id_emp = ?;";
    List<EmpleadoDTO> lista = new ArrayList<>();
    try {
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);
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
}
