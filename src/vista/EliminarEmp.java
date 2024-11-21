
package vista;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EliminarEmp extends javax.swing.JFrame {


    public EliminarEmp() {
        initComponents();
        cargarIdProductos();
        cargarDatosTabla(jTable1);
    }

    private void cargarIdProductos() {
        ConexionBD conexionBD = new ConexionBD(); // Crear la instancia de la conexión
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer conexión con la base de datos
            con = conexionBD.ConectarBaseDatos();

            // Consulta para obtener los IDs de los productos
            String sql = "SELECT id_pro FROM productos WHERE est_pro = 'con stock' ORDER BY id_pro ASC";

            // Ejecutar la consulta
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            // Limpiar el JComboBox antes de agregar nuevos elementos
            cbxIdPro.removeAllItems();

            // Poblar el JComboBox con los resultados de la consulta
            while (rs.next()) {
                String idProducto = rs.getString("id_pro");
                cbxIdPro.addItem(idProducto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los productos: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    //CARGAR LOS DATOS DE LA TABLA
        public void cargarDatosTabla(JTable tabla) {
        ConexionBD conexionBD = new ConexionBD(); // Crear la instancia de conexión
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer conexión con la base de datos
            con = conexionBD.ConectarBaseDatos();

            // Consulta SQL para obtener los datos de la tabla productos
            String sql = "SELECT * FROM productos WHERE est_pro = 'con stock'";

            // Ejecutar la consulta
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            // Crear un modelo de tabla para almacenar los datos
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
            modelo.addColumn("Tienda");

            // Poblar el modelo con los datos obtenidos de la base de datos
            while (rs.next()) {
                Object[] fila = new Object[6]; // Ajusta el tamaño según las columnas de tu tabla
                fila[0] = rs.getInt("id_pro");
                fila[1] = rs.getString("nom_pro");
                fila[2] = rs.getString("cat_pro");
                fila[3] = rs.getFloat("pre_pro");
                fila[4] = rs.getInt("cant_pro");
                fila[5] = rs.getInt("id_tien");
                modelo.addRow(fila);
            }

            // Asignar el modelo al JTable
            tabla.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxIdPro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inicio /");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Eliminar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione ID del producto");

        cbxIdPro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxIdPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("ELIMINAR PARCIALMENTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FUNCION PARA ELIMINAR
  /* public void eliminacionFisica(int id) {
    ConexionBD conexionBD = new ConexionBD(); // Crear la instancia de la conexión
    Connection con = null;
    Statement stmt = null;

    try {
        // Establecer conexión con la base de datos
        con = conexionBD.ConectarBaseDatos();

        // Crear la consulta SQL
        String sql = "DELETE FROM productos WHERE id_pro = '" + id + "'";

        // Ejecutar la consulta
        stmt = con.createStatement();
        int filasAfectadas = stmt.executeUpdate(sql);

        // Verificar si se eliminó algún registro
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un producto con el ID especificado.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + e.getMessage());
        System.out.println("Error: " + e.getMessage());
    } finally {
        // Cerrar recursos
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
}*/

    
   //FUNCION PARA INABILITAR
   public void eliminarParcial(int id) {
    ConexionBD conexionBD = new ConexionBD();
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
        // Conexión a la base de datos
        con = conexionBD.ConectarBaseDatos();

        // Consulta SQL de tipo UPDATE
        String sql = "UPDATE productos SET est_pro = 'sin stock' WHERE id_pro = ?";

        // Preparar la consulta
        pstmt = con.prepareStatement(sql);

        // Asignar valores a los parámetros
        pstmt.setInt(1, id); //  parámetro (id)

        // Ejecutar la consulta
        int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("Producto parcialmente eliminado con éxito.");
        } else {
            System.out.println("No se encontró un producto con el ID especificado.");
        }

    } catch (SQLException e) {
        System.out.println("Error al eliminar parcialmente el producto: " + e.getMessage());
    } finally {
        // Cerrar recursos
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        eliminarParcial(Integer.parseInt(cbxIdPro.getSelectedItem().toString()));
        cargarIdProductos();
        cargarDatosTabla(jTable1);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxIdPro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
