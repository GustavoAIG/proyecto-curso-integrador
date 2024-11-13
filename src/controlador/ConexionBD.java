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
       try{
           Class.forName(driver);
           con = (Connection) DriverManager.getConnection(url, usuario, password);
           System.out.println("Coneccion Correcta");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion:" + e);
        }
        return con;
    }
}

class Prueba {
    public static void main(String[] args) {
      Connection con;  
      ConexionBD conexion = new ConexionBD();
      con = conexion.ConectarBaseDatos();
    }
}




