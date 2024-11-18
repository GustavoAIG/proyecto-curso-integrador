package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
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
                // Si la inserción es exitosa, se crea un nuevo objeto EmpleadoDTO con los datos
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
        return nuevoEmpleado; // Retorna el objeto con los datos del nuevo empleado o null en caso de error
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
