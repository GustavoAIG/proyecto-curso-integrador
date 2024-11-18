package vista;

import vista.InicioSesion;
import vista.ListarEmp;
import vista.RegistrarEmp;

public class InicioEmp extends javax.swing.JFrame {


    public InicioEmp() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Inicio");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btngestion = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnbusqueda = new javax.swing.JButton();
        btncerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnregistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btngestion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btngestion.setText("Gestion");
        btngestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestionActionPerformed(evt);
            }
        });

        btnlistar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnbusqueda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnbusqueda.setText("Busqueda");
        btnbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusquedaActionPerformed(evt);
            }
        });

        btncerrarsesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncerrarsesion.setText("Cerrar Sesión");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnregistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlistar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(btngestion)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnbusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnlistar))
                .addGap(18, 18, 18)
                .addComponent(btnbusqueda)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btngestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        RegistrarEmp objRegistrar = new RegistrarEmp();
        objRegistrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusquedaActionPerformed
        BuscarEmp objBuscar = new BuscarEmp();
        objBuscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbusquedaActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        ActualizarEmp objActualizar = new ActualizarEmp();
        objActualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        ListarEmp objListar = new ListarEmp();
        objListar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btngestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestionActionPerformed
        GestionEmp objGestion = new GestionEmp();
        objGestion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btngestionActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
      InicioSesion ini = new InicioSesion();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btncerrarsesionActionPerformed

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
            java.util.logging.Logger.getLogger(InicioEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbusqueda;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btngestion;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnregistrar;
    // End of variables declaration//GEN-END:variables
}
