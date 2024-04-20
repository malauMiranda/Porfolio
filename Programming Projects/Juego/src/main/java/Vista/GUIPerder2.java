
package Vista;

import Controlador.ControladorGUIPerder2;


public class GUIPerder2 extends javax.swing.JFrame {

    private ControladorGUIPerder2 controladorGUIPerder2;

    private GUIJuego guiJuego;
    private GUIPrincipal guiPrincipal;
    
    public GUIPerder2(GUIJuego guiJuego, GUIPrincipal guiPrincipal) {
        initComponents();
        setLocationRelativeTo(null);
        controladorGUIPerder2= new ControladorGUIPerder2(this,guiPrincipal); 
        escuchar(controladorGUIPerder2);
    }

    private GUIPerder2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void escuchar(ControladorGUIPerder2 controladorGUIPerder2) {
        btnIntentarDeNuevo.addActionListener(controladorGUIPerder2);
        btnSalir.addActionListener(controladorGUIPerder2);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnIntentarDeNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SALIR G_1.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorder(null);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        btnIntentarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REINTENTAR.png"))); // NOI18N
        btnIntentarDeNuevo.setActionCommand("Intentar otra vez");
        btnIntentarDeNuevo.setBorder(null);
        btnIntentarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntentarDeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntentarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PERDER.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntentarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntentarDeNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntentarDeNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPerder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPerder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPerder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPerder2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPerder2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntentarDeNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
