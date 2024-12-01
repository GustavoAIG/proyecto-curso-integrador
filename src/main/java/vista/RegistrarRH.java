 
package vista;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.AdministradorDAO;
import modelo.AdministradorDTO;
import modelo.TiendaDAO;
import modelo.UsuarioDAO;
import modelo.UsuarioDTO;

public class RegistrarRH extends javax.swing.JFrame {
    private static final String EMPTY_FIELDS_MESSAGE = "Por favor, complete todos los campos.";
    private static final String INVALID_OPTION_MESSAGE = "Seleccione una opción válida.";
    private static final int MIN_USERNAME_LENGTH = 4, MIN_PASSWORD_LENGTH = 6, MAX_LENGTH = 10;
    
    
    
    public RegistrarRH() {
        initComponents();
        cargarComboBox(cbxIdTienda, new TiendaDAO().cargarNombresTiendas());
        cargarComboBox(cbxIdAdministrador, new UsuarioDAO().cargarNombresAdmins());
        this.setLocationRelativeTo(this);
        this.setTitle("Registrar administradores y usuarios");
    }

    private void cargarComboBox(JComboBox<String> comboBox, List<String> items) {
        comboBox.setModel(new DefaultComboBoxModel<>(items.toArray(new String[0])));
        comboBox.insertItemAt("--Seleccionar--", 0);
        comboBox.setSelectedIndex(0);
    }
    
    private boolean validarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, EMPTY_FIELDS_MESSAGE, "Error", JOptionPane.WARNING_MESSAGE);
                campo.requestFocus();
                return false;
            }
        }
        return true;
    }
    
    private boolean validarComboBox(JComboBox<String> comboBox) {
        if (comboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, INVALID_OPTION_MESSAGE, "Error", JOptionPane.WARNING_MESSAGE);
            comboBox.requestFocus();
            return false;
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registrarDatosAdmin = new javax.swing.JButton();
        cbxIdTienda = new javax.swing.JComboBox<>();
        cbxIdAdministrador = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoAdministrador = new javax.swing.JTextField();
        txtNombreAdministrador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContraAdmin = new javax.swing.JPasswordField();
        txtUsuarioAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrarUsuarioAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        registrarDatosAdmin.setBackground(new java.awt.Color(255, 51, 51));
        registrarDatosAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrarDatosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        registrarDatosAdmin.setText("Registrar");
        registrarDatosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDatosAdminActionPerformed(evt);
            }
        });

        cbxIdTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        cbxIdAdministrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Elige el la sede de la Tienda");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Elige al usuario");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Ingresa apellido");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Ingres nombre");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Ingreso de datos de Administradores");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Ingrese usuario");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese contraseña");

        registrarUsuarioAdmin.setBackground(new java.awt.Color(255, 51, 51));
        registrarUsuarioAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrarUsuarioAdmin.setForeground(new java.awt.Color(255, 255, 255));
        registrarUsuarioAdmin.setText("Registrar");
        registrarUsuarioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioAdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Ingreso de datos de Usuarios Administradores");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Registrar");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Inicio/");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Coolbox");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tecnología & Electrónica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarDatosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(142, 142, 142)
                                    .addComponent(txtUsuarioAdmin))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(120, 120, 120)
                                    .addComponent(txtContraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(cbxIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtApellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel6)))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarUsuarioAdmin)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarDatosAdmin)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUsuarioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioAdminActionPerformed
     // Validar que los campos no estén vacíos
    if (!validarCampos(txtUsuarioAdmin) || !validarPassword(txtContraAdmin)) return;

    String usuario = txtUsuarioAdmin.getText().trim();
    String contrasena = String.valueOf(txtContraAdmin.getPassword()).trim();

    // Validar que el usuario solo contenga letras, números y guiones bajos
    if (!usuario.matches("^[a-zA-Z0-9_]+$")) {
        JOptionPane.showMessageDialog(this, "El nombre de usuario solo puede contener letras, números y guiones bajos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar si el nombre de usuario ya existe
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    if (usuarioDAO.existeUsuario(usuario)) {
        JOptionPane.showMessageDialog(this, "El nombre de usuario ya está en uso.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Registrar el nuevo usuario
    UsuarioDTO nuevoUsuario = usuarioDAO.registrarAdmin(usuario, contrasena, "admin");
    mostrarMensajeRegistro(nuevoUsuario != null, "Usuario");

    // Actualizar el ComboBox si el registro fue exitoso
    if (nuevoUsuario != null) actualizarComboBoxUsuarios();

    // Limpiar los campos
    txtUsuarioAdmin.setText("");
    txtContraAdmin.setText("");
    }//GEN-LAST:event_registrarUsuarioAdminActionPerformed
    
    private boolean validarPassword(JPasswordField campo) {
        String password = String.valueOf(campo.getPassword()).trim();
        String username = txtUsuarioAdmin.getText().trim();

    // Validar que la contraseña no esté vacía
    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "La contraseña no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar longitud mínima
    if (password.length() < 6) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar complejidad (mayúsculas, minúsculas, números y caracteres especiales)
    if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{6,}$")) {
        JOptionPane.showMessageDialog(this, "La contraseña debe incluir al menos una letra mayúscula, una letra minúscula, un número y un carácter especial.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar que no sea una contraseña débil
    List<String> contrasenasDebiles = Arrays.asList("123456", "password", "qwerty", "12345678", "admin");
    if (contrasenasDebiles.contains(password)) {
        JOptionPane.showMessageDialog(this, "La contraseña es demasiado débil.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validar que no contenga información personal como el nombre de usuario
    if (password.toLowerCase().contains(username.toLowerCase())) {
        JOptionPane.showMessageDialog(this, "La contraseña no puede contener partes del nombre de usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Si pasa todas las validaciones, es válida
    return true;
    }
    
    private void actualizarComboBoxUsuarios() {
      // Cargar los nombres de los usuarios desde la base de datos
    List<String> nombresUsuarios = new UsuarioDAO().cargarNombresAdmins();

    // Crear una nueva lista que incluya el valor "--Seleccionar--" al principio
    List<String> listaUsuariosConSeleccion = new ArrayList<>();
    listaUsuariosConSeleccion.add("--Seleccionar--");  // Agregar la opción de selección

    // Agregar los nombres de los usuarios a la lista
    listaUsuariosConSeleccion.addAll(nombresUsuarios);

    // Crear el modelo para el JComboBox con la nueva lista
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listaUsuariosConSeleccion.toArray(new String[0]));

    // Establecer el modelo actualizado en el JComboBox
    cbxIdAdministrador.setModel(model);
}
     private void mostrarMensajeRegistro(boolean exito, String tipo) {
        JOptionPane.showMessageDialog(this,
                exito ? tipo + " registrado exitosamente." : "Error al registrar el " + tipo.toLowerCase() + ".",
                exito ? "Éxito" : "Error",
                exito ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
    }
     
    private void registrarDatosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDatosAdminActionPerformed
    if (!validarCampos(txtNombreAdministrador, txtApellidoAdministrador)) return;
        if (!validarComboBox(cbxIdTienda) || !validarComboBox(cbxIdAdministrador)) return;

        int idTienda = new TiendaDAO().obtenerIdTiendaPorNombre((String) cbxIdTienda.getSelectedItem());
        int idUsuario = new UsuarioDAO().obtenerIdUsuarioPorNombre((String) cbxIdAdministrador.getSelectedItem());

        AdministradorDTO nuevoAdministrador = new AdministradorDAO().registrarAdmin(
                txtNombreAdministrador.getText().trim(),
                txtApellidoAdministrador.getText().trim(),
                idTienda, idUsuario);

        mostrarMensajeRegistro(nuevoAdministrador != null, "Administrador");
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton registrarDatosAdmin;
    private javax.swing.JButton registrarUsuarioAdmin;
    private javax.swing.JTextField txtApellidoAdministrador;
    private javax.swing.JPasswordField txtContraAdmin;
    private javax.swing.JTextField txtNombreAdministrador;
    private javax.swing.JTextField txtUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
