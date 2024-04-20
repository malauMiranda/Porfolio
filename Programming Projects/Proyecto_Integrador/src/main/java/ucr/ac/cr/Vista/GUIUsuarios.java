
package ucr.ac.cr.Vista;

import Controlador.ControladorUsuario;
import javax.swing.JOptionPane;


public class GUIUsuarios extends javax.swing.JFrame {


    public GUIUsuarios() {
        initComponents();
        ControladorUsuario controladorUsuario = new ControladorUsuario(panelUsuarios1,panelBotones1,this);
        panelUsuarios1.escuchar(controladorUsuario);
        panelBotones1.escuchar(controladorUsuario);
        
    }

     public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelUsuarios1 = new ucr.ac.cr.Vista.PanelUsuarios();
        panelBotones1 = new ucr.ac.cr.Vista.PanelBotones();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 0, -1, 277));
        getContentPane().add(panelBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 890, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private ucr.ac.cr.Vista.PanelBotones panelBotones1;
    private ucr.ac.cr.Vista.PanelUsuarios panelUsuarios1;
    // End of variables declaration//GEN-END:variables
}
