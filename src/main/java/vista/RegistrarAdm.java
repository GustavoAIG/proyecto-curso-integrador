package vista;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.EmpleadoDAO;
import modelo.EmpleadoDTO;
import modelo.TiendaDAO;
import modelo.UsuarioDAO;
import modelo.UsuarioDTO;

public class RegistrarAdm extends javax.swing.JFrame {
    private static final String EMPTY_FIELDS_MESSAGE = "Por favor, complete todos los campos.";
    private static final String INVALID_OPTION_MESSAGE = "Seleccione una opción válida.";
    private static final int MIN_USERNAME_LENGTH = 4, MIN_PASSWORD_LENGTH = 6, MAX_LENGTH = 10;
    
    

    
    public RegistrarAdm() {
        initComponents();
        cargarComboBox(cbxIdTiendaEmpleado, new TiendaDAO().cargarNombresTiendas());
        cargarComboBox(cbxIdUsuarioEmpleado, new UsuarioDAO().cargarNombresUsuarios());
        this.setLocationRelativeTo(this);
        this.setTitle("Registrar empleados y usuarios");
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
        cbxIdUsuarioEmpleado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbxIdTiendaEmpleado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarInformacionUsuarioEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtContraUsuario = new javax.swing.JPasswordField();
        txtUsuarioEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarUsuarioEmpleado = new javax.swing.JButton();
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

        cbxIdUsuarioEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Elija al usuario");

        cbxIdTiendaEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Elija sede de la tienda");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Ingresa nombre");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Ingresa apellido");

        btnRegistrarInformacionUsuarioEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btnRegistrarInformacionUsuarioEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarInformacionUsuarioEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarInformacionUsuarioEmpleado.setText("Registrar");
        btnRegistrarInformacionUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInformacionUsuarioEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Ingreso de datos de Empleados");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Ingrese contraseña");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Ingrese usuario");

        btnRegistrarUsuarioEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btnRegistrarUsuarioEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarUsuarioEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuarioEmpleado.setText("Registrar");
        btnRegistrarUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioEmpleadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Ingreso de datos de Usuarios Empleados");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Registrar");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Inicio /");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxIdTiendaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoEmpleado)
                    .addComponent(cbxIdUsuarioEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarInformacionUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContraUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarUsuarioEmpleado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnRegistrarInformacionUsuarioEmpleado)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxIdTiendaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxIdUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
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

    private void btnRegistrarInformacionUsuarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInformacionUsuarioEmpleadoActionPerformed
    
     if (!validarCampos(txtNombreEmpleado, txtApellidoEmpleado)) return;
        if (!validarComboBox(cbxIdTiendaEmpleado) || !validarComboBox(cbxIdUsuarioEmpleado)) return;

        int idTienda = new TiendaDAO().obtenerIdTiendaPorNombre((String) cbxIdTiendaEmpleado.getSelectedItem());
        int idUsuario = new UsuarioDAO().obtenerIdUsuarioPorNombre((String) cbxIdUsuarioEmpleado.getSelectedItem());

        EmpleadoDTO nuevoEmpleado = new EmpleadoDAO().registrarEmpleado(
                txtNombreEmpleado.getText().trim(),
                txtApellidoEmpleado.getText().trim(),
                idTienda, idUsuario);

        mostrarMensajeRegistro(nuevoEmpleado != null, "Empleado");
    
    
    }//GEN-LAST:event_btnRegistrarInformacionUsuarioEmpleadoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    InicioAdm objInicio = new InicioAdm();
    objInicio.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnRegistrarUsuarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioEmpleadoActionPerformed
      // Validar que los campos no estén vacíos
    if (!validarCampos(txtUsuarioEmpleado) || !validarPassword(txtContraUsuario)) return;

    String usuario = txtUsuarioEmpleado.getText().trim();
    String contrasena = String.valueOf(txtContraUsuario.getPassword()).trim();

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
    UsuarioDTO nuevoUsuario = usuarioDAO.registrarEmpleado(usuario, contrasena, "emple");
    mostrarMensajeRegistro(nuevoUsuario != null, "Usuario");

    // Actualizar el ComboBox si el registro fue exitoso
    if (nuevoUsuario != null) actualizarComboBoxUsuarios();

    // Limpiar los campos
    txtUsuarioEmpleado.setText("");
    txtContraUsuario.setText("");
    }//GEN-LAST:event_btnRegistrarUsuarioEmpleadoActionPerformed

     private boolean validarPassword(JPasswordField campo) {
        String password = String.valueOf(campo.getPassword()).trim();
        String username = txtUsuarioEmpleado.getText().trim();

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
    List<String> nombresUsuarios = new UsuarioDAO().cargarNombresUsuarios();

    // Crear una nueva lista que incluya el valor "--Seleccionar--" al principio
    List<String> listaUsuariosConSeleccion = new ArrayList<>();
    listaUsuariosConSeleccion.add("--Seleccionar--");  // Agregar la opción de selección

    // Agregar los nombres de los usuarios a la lista
    listaUsuariosConSeleccion.addAll(nombresUsuarios);

    // Crear el modelo para el JComboBox con la nueva lista
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listaUsuariosConSeleccion.toArray(new String[0]));

    // Establecer el modelo actualizado en el JComboBox
    cbxIdUsuarioEmpleado.setModel(model);
}
     private void mostrarMensajeRegistro(boolean exito, String tipo) {
        JOptionPane.showMessageDialog(this,
                exito ? tipo + " registrado exitosamente." : "Error al registrar el " + tipo.toLowerCase() + ".",
                exito ? "Éxito" : "Error",
                exito ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
    }

    
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
            java.util.logging.Logger.getLogger(RegistrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarInformacionUsuarioEmpleado;
    private javax.swing.JButton btnRegistrarUsuarioEmpleado;
    private javax.swing.JComboBox<String> cbxIdTiendaEmpleado;
    private javax.swing.JComboBox<String> cbxIdUsuarioEmpleado;
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
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JPasswordField txtContraUsuario;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
