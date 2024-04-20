
package Vista;

import Controlador.ControladorGUIPrincipal;


public class GUIPrincipal extends javax.swing.JFrame {

    private GUIJuego guiJuego;

    public GUIPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        ControladorGUIPrincipal controladorGUIPrincipal=new ControladorGUIPrincipal(this);
        escuchar(controladorGUIPrincipal);
        
    }
    
    public void escuchar(ControladorGUIPrincipal controladorGUIPrincipal){
    btnJugar.addActionListener(controladorGUIPrincipal);
    btnInfo.addActionListener(controladorGUIPrincipal);
    btnSalir.addActionListener(controladorGUIPrincipal);
    btnRegistro.addActionListener(controladorGUIPrincipal);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JUGAR.png"))); // NOI18N
        btnJugar.setToolTipText("");
        btnJugar.setActionCommand("Jugar");
        btnJugar.setBorder(null);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, -1, -1));

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTNREGISTRO.png"))); // NOI18N
        btnRegistro.setActionCommand("Registro");
        btnRegistro.setBorder(null);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 650, -1, -1));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/INFO.png"))); // NOI18N
        btnInfo.setActionCommand("Informacion");
        btnInfo.setBorder(null);
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SALIR.png"))); // NOI18N
        btnSalir.setToolTipText("");
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorder(null);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MENU.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1420, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
