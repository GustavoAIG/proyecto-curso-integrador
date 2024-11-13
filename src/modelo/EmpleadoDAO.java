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
}
