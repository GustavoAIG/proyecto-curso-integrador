package vista;
import modelo.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarAdm extends javax.swing.JFrame {
  DefaultTableModel tabla = new DefaultTableModel();

    public ListarAdm() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Listado de Datos");
    }
public void mostrarCabecera(String tipo) {
        tabla.setRowCount(0);
        tabla.setColumnCount(0);

        switch (tipo) {
            case "Productos":
                tabla.setColumnIdentifiers(new String[]{"ID", "Nombre", "Precio", "Cantidad", "Tienda"});
                break;
            case "Productos sin Stock":
                tabla.setColumnIdentifiers(new String[]{"ID", "Nombre", "Precio", "Cantidad", "Tienda"});
                break;
            case "Empleados":
                tabla.setColumnIdentifiers(new String[]{"ID", "Nombre", "Apellido", "ID_usuario", "Tienda"});
                break;
            case "Tiendas":
                tabla.setColumnIdentifiers(new String[]{"ID", "Nombre", "Dirección", "Teléfono"});
                break;
            case "Proveedores":
                tabla.setColumnIdentifiers(new String[]{"ID", "Nombre", "Año", "ID_Producto","Nombre_Producto", "ID_Tienda"});
                break;
            case "Pedidos":
                tabla.setColumnIdentifiers(new String[]{"ID", "Cantidad", "Fecha", "ID_Prove", "ID_Tienda", "ID_Admin","Nombre_Adm", "ID_Pro"});
                break;
        }
        tblistas.setModel(tabla);
    }

    private void listarDatos(List<?> lista, String tipo) {
        tabla.setRowCount(0);
        for (Object obj : lista) {
            switch (tipo) {
                case "Productos":
                    ProductoDTO prod = (ProductoDTO) obj;
                    tabla.addRow(new Object[]{prod.getId(), prod.getNombre(), prod.getPrecio(), prod.getCantidad(), prod.getIdtienda()});
                    break;
                case "Productos sin Stock":
                    ProductoDTO produ = (ProductoDTO) obj;
                    tabla.addRow(new Object[]{produ.getId(), produ.getNombre(), produ.getPrecio(), produ.getCantidad(), produ.getIdtienda()});
                    break;
                case "Empleados":
                    EmpleadoDTO emp = (EmpleadoDTO) obj;
                    tabla.addRow(new Object[]{emp.getId(), emp.getNombre(), emp.getApellido(), emp.getIdusu(), emp.getIdtienda()});
                    break;
                case "Tiendas":
                    TiendaDTO tienda = (TiendaDTO) obj;
                    tabla.addRow(new Object[]{tienda.getId(), tienda.getNombre(), tienda.getDireccion(), tienda.getTele()});
                    break;
                case "Proveedores":
                    ProveedorDTO prov = (ProveedorDTO) obj;
                    tabla.addRow(new Object[]{prov.getId(), prov.getNombre(), prov.getAnio(), prov.getIdpro(), prov.getNombrepro(), prov.getIdtienda()});
                    break;
                case "Pedidos":
                    PedidoDTO ped = (PedidoDTO) obj;
                    tabla.addRow(new Object[]{ped.getId(), ped.getCantidad(), ped.getFecha(), ped.getIdprove(), ped.getIdtienda(), ped.getIdadm(), ped.getNombreadm(), ped.getIdpro()});
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbxlist = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblistas = new javax.swing.JTable();
        btnlistar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(575, 440));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Listar");

        cbxlist.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Productos", "Empleados", "Tiendas", "Proveedores", "Pedidos", "Productos sin Stock" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione categoría del producto");

        tblistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Cantidad", "Tienda"
            }
        ));
        jScrollPane1.setViewportView(tblistas);

        btnlistar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inicio /");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxlist, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btnlistar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlistar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
 String lis = cbxlist.getSelectedItem().toString();
        if ("Seleccionar".equals(lis)) {
            JOptionPane.showMessageDialog(null, "Elija una información a listar", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        mostrarCabecera(lis);

        switch (lis) {
            case "Productos":
                List<ProductoDTO> listaProductos = new ProductoDAO().listarTodoPro();
                if (listaProductos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaProductos, lis);
                }
                break;
            case "Productos sin Stock":
                List<ProductoDTO> listaProductosSinStock = new EmpleadoDAO().listarProSinStock();
                if (listaProductosSinStock.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaProductosSinStock, lis);
                }
                break;
            case "Empleados":
                List<EmpleadoDTO> listaEmpleados = new EmpleadoDAO().listarTodoEmp();
                if (listaEmpleados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaEmpleados, lis);
                }
                break;
            case "Tiendas":
                List<TiendaDTO> listaTiendas = new TiendaDAO().listarTodoTie();
                if (listaTiendas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaTiendas, lis);
                }
                break;
            case "Proveedores":
                List<ProveedorDTO> listaProveedores = new ProveedorDAO().listarTodoProvee();
                if (listaProveedores.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaProveedores, lis);
                }
                break;
            case "Pedidos":
                List<PedidoDTO> listaPedidos = new PedidoDAO().listarTodoPed();
                if (listaPedidos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay información", "Sin Datos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    listarDatos(listaPedidos, lis);
                }
                break;
        }

    }//GEN-LAST:event_btnlistarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InicioAdm objInicio = new InicioAdm();
        objInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ListarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlistar;
    private javax.swing.JComboBox<String> cbxlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblistas;
    // End of variables declaration//GEN-END:variables
}
