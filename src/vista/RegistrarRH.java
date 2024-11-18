
package vista;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TiendaDAO;
import modelo.UsuarioDAO;
import modelo.UsuarioDTO;

public class RegistrarRH extends javax.swing.JFrame {

    
    private void cargarIdsTiendas() {
        TiendaDAO tiendaDAO = new TiendaDAO();
    List<String> idsTiendas = tiendaDAO.cargarNombresTiendas();
    
    for (String id : idsTiendas) {
        cbxIdTienda.addItem(id); // Añadir cada nombre de tienda al JComboBox
    }
    }
    
    private void cargarIdsAdministradores() {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<String> idsUsuarios = usuarioDAO.cargarNombresAdmins();

    for (String id : idsUsuarios) {
        cbxIdAdministrador.addItem(id); 
    }
        
}
    
    public RegistrarRH() {
        initComponents();
        cargarIdsTiendas();
        cargarIdsAdministradores();
        this.setLocationRelativeTo(this);
        this.setTitle("Registrar empleados y usuarios");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioAdmin = new javax.swing.JTextField();
        txtContraAdmin = new javax.swing.JTextField();
        registrarUsuarioAdmin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreAdministrador = new javax.swing.JTextField();
        txtApellidoAdministrador = new javax.swing.JTextField();
        registrarDatosAdmin = new javax.swing.JButton();
        cbxIdTienda = new javax.swing.JComboBox<>();
        cbxIdAdministrador = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inicio/");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("Registrar");

        jLabel3.setText("Ingreso de datos de Usuarios Administradores");

        jLabel4.setText("Ingrese usuario");

        jLabel5.setText("Ingrese contraseña");

        jLabel6.setText("Ingreso de datos de Administradores");

        registrarUsuarioAdmin.setText("Registrar");
        registrarUsuarioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioAdminActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingres nombre");

        jLabel8.setText("Ingresa apellido");

        registrarDatosAdmin.setText("Registrar");
        registrarDatosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosAdminActionPerformed(evt);
            }
        });

        cbxIdTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        cbxIdAdministrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        jLabel9.setText("Elige el la sede de la Tienda");

        jLabel10.setText("Elige al usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registrarDatosAdmin)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxIdAdministrador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsuarioAdmin)
                                    .addComponent(txtContraAdmin)
                                    .addComponent(txtApellidoAdministrador)
                                    .addComponent(txtNombreAdministrador)
                                    .addComponent(cbxIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(registrarUsuarioAdmin))))
                    .addComponent(jLabel2))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(registrarUsuarioAdmin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7))
                    .addComponent(txtNombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrarDatosAdmin)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuarioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioAdminActionPerformed
    String usuario_admin = txtUsuarioAdmin.getText().trim();
    String contrasena_admin = new String (txtContraAdmin.getText()).trim();
    
     // Validar que los campos no estén vacíos
    if (usuario_admin.isEmpty() || contrasena_admin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que los campos no estén vacíos
    if (usuario_admin.isEmpty() || contrasena_admin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear instancia del DAO
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    // Llamar al método para registrar al empleado
    UsuarioDTO nuevoEmpleado = usuarioDAO.registrarEmpleado(usuario_admin, contrasena_admin, "emple");

    // Verificar si el registro fue exitoso
    if (nuevoEmpleado != null) {
        JOptionPane.showMessageDialog(this, "Administrador registrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        // Opcional: Limpiar los campos después de un registro exitoso
        txtUsuarioAdmin.setText("");
        txtContraAdmin.setText("");
        
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el administrador. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_registrarUsuarioAdminActionPerformed

    private void registrarDatosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosAdminActionPerformed
      // Obtener los valores de los campos de texto y ComboBox
    String nombreUsuarioAdministrador = txtNombreAdministrador.getText();
    String apellidoUsuarioAdministrador= txtApellidoAdministrador.getText();
    String idTiendaAdministrador = (String) cbxIdTienda.getSelectedItem(); // ID de tienda seleccionado
    String idUsuarioAdministrador = (String) cbxIdAdministrador.getSelectedItem(); // ID de usuario seleccionado

    // Comprobar que los campos no estén vacíos
    if (nombreUsuarioAdministrador.isEmpty() || apellidoUsuarioAdministrador.isEmpty() || idTiendaAdministrador == null || idUsuarioAdministrador == null) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Insertar los datos en la base de datos
    ConexionBD conexionBD = new ConexionBD();
    try (Connection conn = conexionBD.ConectarBaseDatos()) {
        String sql = "INSERT INTO administradores (nom_adm, ape_adm, id_tien, id_usu) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nombreUsuarioAdministrador);
        stmt.setString(2, apellidoUsuarioAdministrador);
        stmt.setString(3, idTiendaAdministrador);
        stmt.setString(4, idUsuarioAdministrador);

        int filasInsertadas = stmt.executeUpdate();
        if (filasInsertadas > 0) {
            JOptionPane.showMessageDialog(this, "Administrador registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el administrador.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al registrar el administrador: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_registrarDatosAdminActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     InicioSesion ini = new InicioSesion();
     ini.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked


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
            java.util.logging.Logger.getLogger(RegistrarRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarRH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxIdAdministrador;
    private javax.swing.JComboBox<String> cbxIdTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton registrarDatosAdmin;
    private javax.swing.JButton registrarUsuarioAdmin;
    private javax.swing.JTextField txtApellidoAdministrador;
    private javax.swing.JTextField txtContraAdmin;
    private javax.swing.JTextField txtNombreAdministrador;
    private javax.swing.JTextField txtUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
