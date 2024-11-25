package reportes;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import net.sf.jasperreports.engine.util.JRLoader;
import java.sql.Connection;
import controlador.ConexionBD;

public class ReporteProducto {
    
    public void generarReporteProductos(String categoria) {
        try {
            // Ruta del archivo jrxml y jasper
            String jrxmlPath = "src/main/java/reportes/productos.jrxml"; // Asegúrate de que el archivo se llame 'productos.jrxml'
            String jasperPath = "src/main/java/reportes/productos.jasper";

            // Compilar el archivo jrxml si no existe el .jasper
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);

            // Cargar el archivo .jasper
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(jasperPath);

            // Parámetros para el reporte (esto pasará la categoría al reporte)
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("categoria", categoria);  // Se pasa el parámetro para que se use en el reporte

            // Obtener conexión a la base de datos
            ConexionBD conexionBD = new ConexionBD();
            Connection conexion = conexionBD.ConectarBaseDatos();  // Asegúrate de que este método devuelve un objeto Connection

            // Llenar el reporte con los datos de la base de datos
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, conexion);

            // Mostrar el reporte
            JasperViewer.viewReport(print, false);

        } catch (JRException e) {
            System.out.println("Error al generar el reporte: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la conexión con la base de datos: " + e.getMessage());
        }
    }
}
