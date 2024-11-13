package modelo;
import java.sql.Connection;
import controlador.ConexionBD;
import controlador.ConexionBD;
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
         try {
            String sql = "select * from usuarios where nom_usu = '" + usu + "' and cont_usu = '" + pas + "'";
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                u = new UsuarioDTO();
                u.setUsuario(rs.getString(2));
                u.setContra(rs.getString(3));
                u.setRol(rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println("Error listar:"+e);
        }
        return u;
    }
}
