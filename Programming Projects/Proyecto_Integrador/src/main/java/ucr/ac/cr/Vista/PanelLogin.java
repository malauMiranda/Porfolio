
package ucr.ac.cr.Vista;

import java.awt.event.ActionListener;


public class PanelLogin extends javax.swing.JPanel {


    public PanelLogin() {
        initComponents();
    }
 public void escuchar(ActionListener manejador){
    btnIniciarSesion.addActionListener(manejador);
    }
    
    public void setTxtNombreUsuario(String nombreUsuario){
        txtNombreUsuario.setText(nombreUsuario);
    
    }
    public String getTxtNombreUsuario(){
        return txtNombreUsuario.getText().trim();
    }
    
    public String getTxtContraseña(){
        return txtContraseña.getText().trim();
    }
    
    public void setTxtContraseña(String contraseña){
        txtContraseña.setText(contraseña);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al sistema");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 90, 100));
        jLabel2.setText("Nombre de usuario");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 110, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 90, 100));
        jLabel3.setText("Contraseña");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 115, 92));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setActionCommand("Iniciar sesion");
        btnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, 30));

        jLabel5.setBackground(new java.awt.Color(255, 115, 92));
        jLabel5.setForeground(new java.awt.Color(255, 115, 92));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.png"))); // NOI18N
        jLabel5.setToolTipText("");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5208999.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 230));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
