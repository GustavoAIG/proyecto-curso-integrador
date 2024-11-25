package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.UsuarioDTO;


public class UsuarioDAO {
    ConexionBD conexion = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    UsuarioDTO u;

    public UsuarioDTO iniciarSesion(String usu, String pas) {
        UsuarioDTO u = null;
        try {
            String sql = "SELECT * FROM usuarios WHERE nom_usu = ? AND cont_usu = ?";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, usu);
            ps.setString(2, pas);
            rs = ps.executeQuery();

            if (rs.next()) {
                u = new UsuarioDTO();
                u.setId(rs.getInt(1)); 
                u.setUsuario(rs.getString(2));
                u.setContra(rs.getString(3));
                u.setRol(rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar sesión: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                System.out.println("Error cerrando la conexión: " + ex);
            }
        }
        return u;
    }

    
    public UsuarioDTO registrarEmpleado(String usu, String pas, String rol) {
        UsuarioDTO u = null;
        try {
            String sql = "INSERT INTO usuarios (nom_usu, cont_usu, rol_usu) VALUES (?, ?, ?)";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, usu);
            ps.setString(2, pas);
            ps.setString(3, rol);

            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    u = new UsuarioDTO();
                    u.setUsuario(usu);
                    u.setContra(pas);
                    u.setRol("emple");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al registrar empleado: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return u;
    }
    
    public UsuarioDTO registrarAdmin(String usu, String pas, String rol) {
        UsuarioDTO u = null;
        try {
            String sql = "INSERT INTO usuarios (nom_usu, cont_usu, rol_usu) VALUES (?, ?, ?)";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, usu);
            ps.setString(2, pas);
            ps.setString(3, rol);

            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    u = new UsuarioDTO();
                    u.setUsuario(usu);
                    u.setContra(pas);
                    u.setRol(rol);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al registrar administrador: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return u;
    }
    
    public List<String> cargarNombresUsuarios() {
        List<String> idsUsuarios = new ArrayList<>();
        try {
            String sql = "SELECT nom_usu FROM usuarios WHERE rol_usu = 'emple'";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                idsUsuarios.add(rs.getString("nom_usu"));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return idsUsuarios;
    }
    
    public List<String> cargarNombresAdmins() {
        List<String> idsUsuarios = new ArrayList<>();
        try {
            String sql = "SELECT nom_usu FROM usuarios WHERE rol_usu = 'admin'";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                idsUsuarios.add(rs.getString("nom_usu"));
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        } finally {
            cerrarRecursos();
        }
        return idsUsuarios;
    }
    
    public int obtenerIdUsuarioPorNombre(String nombreUsuario) {
    int idUsuario = -1; // Usamos -1 como valor por defecto si no se encuentra el usuario
    try {
        String sql = "SELECT id_usu FROM usuarios WHERE nom_usu = ?";
        con = conexion.ConectarBaseDatos();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombreUsuario);
        rs = ps.executeQuery();
        if (rs.next()) {
            idUsuario = rs.getInt("id_usu");
        }
    } catch (Exception e) {
        System.out.println("Error al obtener el ID del usuario: " + e.getMessage());
    } finally {
        cerrarRecursos();
    }
    return idUsuario; // Devuelve el ID o -1 si no se encontró
}
    
    public boolean existeUsuario(String usuario) {
    try (Connection con = conexion.ConectarBaseDatos();
        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM usuarios WHERE nom_usu = ?")) {
        stmt.setString(1, usuario);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Si el conteo es mayor a 0, el usuario ya existe
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}


    private void cerrarRecursos() {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
    
    
}
