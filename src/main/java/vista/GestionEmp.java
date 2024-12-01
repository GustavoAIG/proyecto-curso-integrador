package vista;
import modelo.EmpleadoDAO;
import modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionEmp extends javax.swing.JFrame {
ProductoDAO prodao = new ProductoDAO();
EmpleadoDAO empdao = new EmpleadoDAO();
RegistroDAO regdao = new RegistroDAO();

    public GestionEmp() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Gestión de Productos");
        llenarcbx();
    }
public void llenarcbx() {
    cbxid.removeAllItems(); 
    cbxid.addItem("Seleccionar");
    List<ProductoDTO> lista = prodao.listarTodoPro();
    for (ProductoDTO pro : lista) {
        if (pro.getCantidad() > 0) { // Solo incluir productos con cantidad mayor a 0.
            cbxid.addItem(pro.getId() + "");
        }
    }
}

private boolean validarCampos() {
    if (cbxid.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Seleccione un ID de producto válido");
        return false;
    }

    try {
        int cantidad = Integer.parseInt(txtcant.getText());
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero");
            txtcant.setText("");
            txtcant.requestFocus();
            return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en el campo de cantidad");
        txtcant.setText("");
        txtcant.requestFocus();
        return false;
    }

    return true;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnelim = new javax.swing.JButton();
        btnania = new javax.swing.JButton();
        txtcant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtantcant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        cbxid = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnelim.setBackground(new java.awt.Color(51, 51, 51));
        btnelim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnelim.setForeground(new java.awt.Color(255, 255, 255));
        btnelim.setText("Eliminar");
        btnelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimActionPerformed(evt);
            }
        });

        btnania.setBackground(new java.awt.Color(51, 51, 51));
        btnania.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnania.setForeground(new java.awt.Color(255, 255, 255));
        btnania.setText("Añadir");
        btnania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaniaActionPerformed(evt);
            }
        });

        txtcant.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Ingrese cantidad del producto");

        txtantcant.setEditable(false);
        txtantcant.setBackground(new java.awt.Color(255, 255, 255));
        txtantcant.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad del Producto");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Nombre del Producto");

        txtnom.setEditable(false);
        txtnom.setBackground(new java.awt.Color(255, 255, 255));
        txtnom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cbxid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxidItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione ID del producto");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Gestion");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Inicio /");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Coolbox");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tecnología & Electrónica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(833, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtantcant, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnania))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnelim)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom)
                            .addComponent(txtcant))))
                .addGap(22, 22, 22))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtantcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnelim)
                            .addComponent(btnania))
                        .addGap(59, 59, 59))))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InicioEmp objInicio = new InicioEmp();
        objInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaniaActionPerformed
   if (!validarCampos()) {
        return;
    }

    int id = Integer.parseInt(cbxid.getSelectedItem().toString());
    int cantidad = Integer.parseInt(txtcant.getText());
    boolean actualizado = empdao.sumar(id, cantidad);

    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Cantidad agregada correctamente");
        txtcant.setText("");
        txtcant.requestFocus();
        cargar(id);

        RegistroDTO registro = new RegistroDTO();
        registro.setNombrepro(txtnom.getText());
        registro.setCantidad(cantidad);
        registro.setOperacion("entrada");
        registro.setId_pro(id);

        boolean registrado = regdao.registrarOperacion(registro);
        if (!registrado) {
            JOptionPane.showMessageDialog(this, "Error al registrar el ingreso en la tabla de registros");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error al agregar cantidad");
    }
    }//GEN-LAST:event_btnaniaActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
if (!validarCampos()) {
    return;
}

int id = Integer.parseInt(cbxid.getSelectedItem().toString());
int cantidad = Integer.parseInt(txtcant.getText());

if (cantidad == Integer.parseInt(txtantcant.getText())) { 
    boolean actualizado = empdao.restar(id, cantidad);
    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Producto eliminado completamente del inventario");
        
        // Limpiar los campos y resetear el combobox.
        txtnom.setText("");
        txtantcant.setText("");
        txtcant.setText("");
        cbxid.setSelectedIndex(0); // Regresa a "Seleccionar".
        llenarcbx();
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar la cantidad del inventario");
    }
} else {
    boolean actualizado = empdao.restar(id, cantidad);
    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Cantidad eliminada correctamente");
        txtcant.setText("");
        txtcant.requestFocus();
        cargar(id); 

        // Registrar la operación.
        RegistroDTO registro = new RegistroDTO();
        registro.setNombrepro(txtnom.getText());
        registro.setCantidad(cantidad);
        registro.setOperacion("salida");
        registro.setId_pro(id);

        boolean registrado = regdao.registrarOperacion(registro);
        if (!registrado) {
            JOptionPane.showMessageDialog(this, "Error al registrar la salida en la tabla de registros");
        }
    } else {
        JOptionPane.showMessageDialog(this, "La cantidad a eliminar no puede ser mayor al inventario");
    }
}
    }//GEN-LAST:event_btnelimActionPerformed

    private void cbxidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxidItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        if (cbxid.getSelectedIndex() > 0) {
            int id = Integer.parseInt(cbxid.getSelectedItem().toString());
            cargar(id);
        }
    }
    }//GEN-LAST:event_cbxidItemStateChanged

    public void cargar(int id) {
    List<ProductoDTO> lista = prodao.BuscarPro(id);
    if (!lista.isEmpty()) {
        ProductoDTO emp = lista.get(0);
        txtnom.setText(emp.getNombre());
        txtantcant.setText(String.valueOf(emp.getCantidad()));
    }
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
            java.util.logging.Logger.getLogger(GestionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnania;
    private javax.swing.JButton btnelim;
    private javax.swing.JComboBox<String> cbxid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtantcant;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
