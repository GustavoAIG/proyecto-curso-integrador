package vista;
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxid = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        cbxidproveedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpedidos = new javax.swing.JTable();
        btnpedir = new javax.swing.JButton();
        txtnompro = new javax.swing.JTextField();
        btnactuestado = new javax.swing.JButton();
        cbxidtienda = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Pedir");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inicio /");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        cbxid.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxidItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione ID del producto");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese cantidad a pedir");

        txtcant.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbxidproveedor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Seleccione ID del proveedor");

        tblpedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Fecha", "Proveedor", "Tienda"
            }
        ));
        jScrollPane1.setViewportView(tblpedidos);

        btnpedir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnpedir.setText("Pedir");
        btnpedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedirActionPerformed(evt);
            }
        });

        txtnompro.setEditable(false);
        txtnompro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnactuestado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnactuestado.setText("Actualizar");
        btnactuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactuestadoActionPerformed(evt);
            }
        });

        cbxidtienda.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Seleccione ID de la tienda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnompro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(cbxidtienda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnpedir)
                        .addGap(120, 120, 120)
                        .addComponent(btnactuestado)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnompro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxidtienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpedir)
                    .addComponent(btnactuestado))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InicioAdm objInicio = new InicioAdm();
        objInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnpedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedirActionPerformed
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
private void listar(List<PedidoDTO> lista) {
    tabla.getDataVector().removeAllElements();
    for (PedidoDTO pedido : lista) {
        Object[] data = {pedido.getId(), pedido.getCantidad(), pedido.getFecha(), pedido.getEstado(),
                         pedido.getIdprove(), pedido.getIdtienda()};
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpedidos;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnompro;
    // End of variables declaration//GEN-END:variables
}
