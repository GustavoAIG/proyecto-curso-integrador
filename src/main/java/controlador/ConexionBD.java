package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
   Connection con;
   String driver = "com.mysql.cj.jdbc.Driver"; 
   String dbName = "inventario_xiaomi";
   String url = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&serverTimezone=UTC";
   String usuario = "root";
   String password = "";

   public Connection ConectarBaseDatos() {
       try {
           Class.forName(driver);
           con = DriverManager.getConnection(url, usuario, password);
           System.out.println("Conexión Correcta");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error en la conexión: " + e);
       }
       return con;
   }

   public static void main(String[] args) {
       ConexionBD conexion = new ConexionBD();
       Connection con = conexion.ConectarBaseDatos();
       if (con != null) {
           System.out.println("Prueba de conexión exitosa.");
       }
   }
}
