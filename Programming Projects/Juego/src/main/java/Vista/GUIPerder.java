
package Vista;

import Controlador.ControladorGUIPerder;


public class GUIPerder extends javax.swing.JFrame {

    private ControladorGUIPerder controladorGUIPerder;
    private GUIJuego guiJuego;
    private GUIPrincipal guiPrincipal;
    
    public GUIPerder(GUIJuego guiJuego, GUIPrincipal guiPrincipal) {
        initComponents();
        setLocationRelativeTo(null);
        controladorGUIPerder= new ControladorGUIPerder(this,guiPrincipal); 
        escuchar(controladorGUIPerder);
    }

    private GUIPerder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void escuchar(ControladorGUIPerder controladorGUIPerder) {
        btnReintentar.addActionListener(controladorGUIPerder);
        btnSalir.addActionListener(controladorGUIPerder);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnReintentar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SALIR G_1.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorder(null);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        btnReintentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REINTENTAR.png"))); // NOI18N
        btnReintentar.setActionCommand("Intentar de nuevo");
        btnReintentar.setBorder(null);
        btnReintentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReintentarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReintentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PERDER.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReintentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReintentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReintentarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPerder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPerder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPerder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPerder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPerder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReintentar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
