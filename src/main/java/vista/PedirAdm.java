package vista;
import modelo.EmpleadoDAO;
import modelo.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PedirAdm extends javax.swing.JFrame {
    DefaultTableModel tabla = new DefaultTableModel();
    EmpleadoDAO empdao = new EmpleadoDAO();
    TiendaDAO tiendao = new TiendaDAO();
    ProveedorDAO provedao = new ProveedorDAO();
    public PedirAdm() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Pedir Productos");
        mostrarCabecera();
        listarini();
    }
  public void mostrarCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Fecha");
        tabla.addColumn("Estado");
        tabla.addColumn("Proveedor");
        tabla.addColumn("Tienda");
        tabla.addColumn("IDProducto");
        tblpedidos.setModel(tabla);
        llenarcbx();
    }
    @SuppressWarnings("unchecked")
   public void llenarcbx() {
    cbxid.removeAllItems();
    cbxid.addItem("Seleccionar");
    List<ProductoDTO> lista = empdao.listarProSinStock();
    for (ProductoDTO producto : lista) {
        cbxid.addItem(String.valueOf(producto.getId()));
    }
    cbxidtienda.removeAllItems();
    cbxidtienda.addItem("Seleccionar");
    List<TiendaDTO> listaa = tiendao.listarTodoTie();
    for (TiendaDTO tienda : listaa) {
        cbxidtienda.addItem(String.valueOf(tienda.getId()));
    }
    cbxidproveedor.removeAllItems();
    cbxidproveedor.addItem("Seleccionar");
    List<ProveedorDTO> listaaa = provedao.listarTodoProvee();
    for (ProveedorDTO prove : listaaa) {
        cbxidproveedor.addItem(String.valueOf(prove.getId()));
    }
} 
   
   private boolean validarCampos() {
    if (cbxid.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un ID válido.");
        return false;
    }

    if (cbxidproveedor.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un proveedor válido.");
        return false;
    }

    if (cbxidtienda.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una tienda válida.");
        return false;
    }

    try {
        int cantidad = Integer.parseInt(txtcant.getText());
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero.");
            return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa solo números en la cantidad.");
        return false;
    }

    return true;
}

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnpedir = new javax.swing.JButton();
        btnactuestado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpedidos = new javax.swing.JTable();
        cbxidtienda = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbxidproveedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxid = new javax.swing.JComboBox<>();
        txtnompro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnomprove = new javax.swing.JTextField();
        txtnomtienda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnpedir.setBackground(new java.awt.Color(255, 51, 51));
        btnpedir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnpedir.setForeground(new java.awt.Color(255, 255, 255));
        btnpedir.setText("Pedir");
        btnpedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedirActionPerformed(evt);
            }
        });

        btnactuestado.setBackground(new java.awt.Color(255, 51, 51));
        btnactuestado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnactuestado.setForeground(new java.awt.Color(255, 255, 255));
        btnactuestado.setText("Actualizar");
        btnactuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactuestadoActionPerformed(evt);
            }
        });

        tblpedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Fecha", "Proveedor", "Tienda", "IDProducto"
            }
        ));
        jScrollPane1.setViewportView(tblpedidos);

        cbxidtienda.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxidtienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxidtiendaItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setText("Seleccione ID de la tienda");

        cbxidproveedor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxidproveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxidproveedorItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Seleccione ID del proveedor");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese cantidad a pedir");

        txtcant.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione ID del producto");

        cbxid.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxidItemStateChanged(evt);
            }
        });

        txtnompro.setEditable(false);
        txtnompro.setBackground(new java.awt.Color(255, 255, 255));
        txtnompro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Pedir");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
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

        txtnomprove.setEditable(false);
        txtnomprove.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtnomtienda.setEditable(false);
        txtnomtienda.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpedir)
                .addGap(159, 159, 159)
                .addComponent(btnactuestado)
                .addGap(258, 258, 258))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxid, 0, 125, Short.MAX_VALUE)
                            .addComponent(txtcant, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(cbxidproveedor, 0, 125, Short.MAX_VALUE)
                            .addComponent(txtnomprove))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxidtienda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnompro)
                            .addComponent(txtnomtienda, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnompro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxidtienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnomprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 95, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnpedir)
                                    .addComponent(btnactuestado))
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnomtienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        InicioAdm objInicio = new InicioAdm();
        objInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnpedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedirActionPerformed
    if (!validarCampos()) {
        return; 
    }
        
    int id = Integer.parseInt(cbxid.getSelectedItem().toString());
    int cantidad = Integer.parseInt(txtcant.getText());
    int idProve = Integer.parseInt(cbxidproveedor.getSelectedItem().toString());
    int idTienda = Integer.parseInt(cbxidtienda.getSelectedItem().toString());
    int idAdm = empdao.obtenerIdAdministrador(InicioSesion.idusu);
    if (idAdm != -1) {
        boolean pedidoRealizado = empdao.pedirPro(id, cantidad, idProve, idTienda, idAdm);
   
        if (pedidoRealizado) {
            JOptionPane.showMessageDialog(this, "Pedido realizado con éxito");
        List<PedidoDTO> listaa = empdao.listarTodoPed();
        listar(listaa);
        } else {
            JOptionPane.showMessageDialog(this, "Error al realizar el pedido");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo obtener el ID del administrador");
    }
    }//GEN-LAST:event_btnpedirActionPerformed

    private void btnactuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactuestadoActionPerformed
    int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del pedido recibido"));
    boolean actualizado = empdao.actualizarPed(idPedido);

    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Estado del pedido actualizado a 'recibido'");
        List<PedidoDTO> lista = empdao.listarTodoPed();
        listar(lista);
    } else {
        JOptionPane.showMessageDialog(this, "Error al actualizar el estado del pedido");
    }
    }//GEN-LAST:event_btnactuestadoActionPerformed

    private void cbxidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxidItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        if (cbxid.getSelectedIndex() > 0) {
            int id = Integer.parseInt(cbxid.getSelectedItem().toString());
            List<ProductoDTO> lista = empdao.listarProSinStock();
            for (ProductoDTO pro : lista) {
                if (pro.getId() == id) {
                    txtnompro.setText(pro.getNombre());
                }
            }
        }
    }
    }//GEN-LAST:event_cbxidItemStateChanged

    private void cbxidproveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxidproveedorItemStateChanged
       if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        if (cbxidproveedor.getSelectedIndex() > 0) {
            int id = Integer.parseInt(cbxidproveedor.getSelectedItem().toString());
            cargarprove(id);
        }
    }
    }//GEN-LAST:event_cbxidproveedorItemStateChanged

    private void cbxidtiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxidtiendaItemStateChanged
          if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        if (cbxidtienda.getSelectedIndex() > 0) {
            int id = Integer.parseInt(cbxidtienda.getSelectedItem().toString());
            cargartienda(id);
        }
    }
    }//GEN-LAST:event_cbxidtiendaItemStateChanged
public void cargarprove(int id) {
    List<ProveedorDTO> lista = provedao.listarTodoProvee();
    for (ProveedorDTO emp : lista) {
        if (emp.getId() == id) { // Supongo que tienes un método getId() en ProveedorDTO
            txtnomprove.setText(emp.getNombre());
            return; // Termina el método una vez encontrado
        }
    }
    // Si no se encuentra el ID
    txtnomprove.setText("No encontrado");
}

public void cargartienda(int id) {
    List<TiendaDTO> lista = tiendao.listarTodoTie();
    for (TiendaDTO emp : lista) {
        if (emp.getId() == id) { 
            txtnomtienda.setText(emp.getNombre());
            return; // Termina el método una vez encontrado
        }
    }
    // Si no se encuentra el ID
    txtnomtienda.setText("No encontrado");
}

    
    private void listar(List<PedidoDTO> lista) {
    tabla.getDataVector().removeAllElements();
    for (PedidoDTO pedido : lista) {
        Object[] data = {pedido.getId(), pedido.getCantidad(), pedido.getFecha(), pedido.getEstado(),
                         pedido.getIdprove(), pedido.getIdtienda(), pedido.getIdpro()};
        tabla.addRow(data);
    }
    tabla.fireTableDataChanged();
}

public void listarini(){
    List<PedidoDTO> lista = empdao.listarTodoPed();
        listar(lista);
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
            java.util.logging.Logger.getLogger(PedirAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedirAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedirAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedirAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedirAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactuestado;
    private javax.swing.JButton btnpedir;
    private javax.swing.JComboBox<String> cbxid;
    private javax.swing.JComboBox<String> cbxidproveedor;
    private javax.swing.JComboBox<String> cbxidtienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpedidos;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnompro;
    private javax.swing.JTextField txtnomprove;
    private javax.swing.JTextField txtnomtienda;
    // End of variables declaration//GEN-END:variables
}
