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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioEmpleado = new javax.swing.JTextField();
        btnRegistrarUsuarioEmpleado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmpleado = new javax.swing.JTextField();
        cbxIdTiendaEmpleado = new javax.swing.JComboBox<>();
        cbxIdUsuarioEmpleado = new javax.swing.JComboBox<>();
        btnRegistrarInformacionUsuarioEmpleado = new javax.swing.JButton();
        txtContraUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inicio/");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("Registrar");

        jLabel3.setText("Ingreso de datos de Usuarios Empleados");

        jLabel4.setText("Ingrese usuario");

        jLabel5.setText("Ingrese contraseña");

        btnRegistrarUsuarioEmpleado.setText("Registrar");
        btnRegistrarUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioEmpleadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingresa nombre");

        jLabel7.setText("Ingresa apellido");

        jLabel8.setText("Elija sede de la tienda");

        jLabel9.setText("Elija al usuario");

        jLabel10.setText("Ingreso de datos de Empleados");

        cbxIdTiendaEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        cbxIdUsuarioEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        btnRegistrarInformacionUsuarioEmpleado.setText("Registrar");
        btnRegistrarInformacionUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInformacionUsuarioEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRegistrarInformacionUsuarioEmpleado)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel5))
                                            .addGap(98, 98, 98)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbxIdUsuarioEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbxIdTiendaEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtApellidoEmpleado)
                                                .addComponent(txtNombreEmpleado)
                                                .addComponent(txtContraUsuario)
                                                .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel3))
                                    .addGap(38, 38, 38)
                                    .addComponent(btnRegistrarUsuarioEmpleado)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel10)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegistrarUsuarioEmpleado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtContraUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addComponent(btnRegistrarInformacionUsuarioEmpleado)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxIdTiendaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxIdUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JPasswordField txtContraUsuario;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
