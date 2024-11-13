package vista;
import modelo.ProductoDTO;
import modelo.ProductoDAO;
import controlador.*;
import modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarEmp extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();
 
    public ListarEmp() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Listado de Productos");
        mostrarCabecera();
    }
  public void mostrarCabecera(){
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Precio");
        tabla.addColumn("Cantidad");
        tabla.addColumn("Tienda");
        tblista.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxcat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblista = new javax.swing.JTable();
        btnlistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inicio /");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Listar");

        cbxcat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alta", "Media", "Baja" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione categoría del producto");

        tblista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblista);

        btnlistar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlistar)
                .addGap(247, 247, 247))
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
                        .addComponent(cbxcat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
                    .addComponent(cbxcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlistar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InicioEmp objInicio = new InicioEmp();
        objInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked
private void listar(List<ProductoDTO> lista) {
    tabla.getDataVector().removeAllElements();
    for (ProductoDTO producto : lista) {
        Object[] data = {producto.getId(), producto.getNombre(), producto.getCategoria(), 
                         producto.getPrecio(), producto.getCantidad(), producto.getIdtienda()};
        tabla.addRow(data);
    }
}

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed

        ProductoDAO pdao = new ProductoDAO();
        ArrayList<ProductoDTO> lista = new ArrayList<>();
        String categoria = cbxcat.getSelectedItem().toString();
        if ("Seleccionar".equals(categoria)) {
        JOptionPane.showMessageDialog(null, "Elija una categoría", "Campo Vacío", HEIGHT);
        } else {
        switch (categoria) {
                case "Alta":
                    lista = (ArrayList<ProductoDTO>)pdao.listarPorCategoria(categoria);
                    if (lista.size() != 0) {
                     tabla.getDataVector().removeAllElements();
                    listar(lista);
                    } else
                        JOptionPane.showMessageDialog(null, "No hay productos con esa categoría,"
                               , "Sin existencias", 1);
                    break;
                case "Media":
                    lista = (ArrayList<ProductoDTO>)pdao.listarPorCategoria(categoria);
                    if (lista.size() != 0) {
                     tabla.getDataVector().removeAllElements();
                    listar(lista);
                    } else
                        JOptionPane.showMessageDialog(null, "No hay productos con esa categoría,"
                               , "Sin existencias", 1);
                    break;
                case "Baja":
                    lista = (ArrayList<ProductoDTO>)pdao.listarPorCategoria(categoria);
                    if (lista.size() != 0) {
                     tabla.getDataVector().removeAllElements();
                    listar(lista);
                    } else
                        JOptionPane.showMessageDialog(null, "No hay productos con esa categoría,"
                               , "Sin existencias", 1);
                    break;          
                default:
                    throw new AssertionError();
            }
        } 
        
    }//GEN-LAST:event_btnlistarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlistar;
    private javax.swing.JComboBox<String> cbxcat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblista;
    // End of variables declaration//GEN-END:variables
}
