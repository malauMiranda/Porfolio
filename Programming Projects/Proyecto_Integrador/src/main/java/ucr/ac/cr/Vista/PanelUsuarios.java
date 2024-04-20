
package ucr.ac.cr.Vista;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;


public class PanelUsuarios extends javax.swing.JPanel {

    
    public PanelUsuarios() {
        initComponents();
    }
    
    public void escuchar(ActionListener manejador){
    btnPerfil.addActionListener(manejador);
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
    public void limpiar(){
        txtNombreUsuario.setText("");
        txtContraseña.setText("");
    }
    
//    public void setDatosTabla(String [][] datos){
//       tblGenero.setModel(new DefaultTableModel(datos,new String [] {"Id","Descripción"}));
//       jScrollPane2.setViewportView(tblGenero);
//    }
//    
//    public void escucharTabla(MouseListener manejador){
//        tblGenero.addMouseListener(manejador);
//    }
    
//    public String getFila(){
//        int fila=tblGenero.getSelectedRow();
//        return tblGenero.getModel().getValueAt(fila, 0).toString();
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Módulo de administración y mantenimiento de usuarios");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 726, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre de usuario");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 127, -1, -1));
        add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 123, 80, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contraseña");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 127, -1, -1));
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 123, 80, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 90, 100));
        jLabel5.setText("Usuario");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 92, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 90, 100));
        jLabel6.setText("Perfil");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 165, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        btnPerfil.setText("Editar perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
