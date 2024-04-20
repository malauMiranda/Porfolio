
package ucr.ac.cr.Vista;


public class PanelPerfil extends javax.swing.JPanel {


    public PanelPerfil() {
        initComponents();
    }
    
 public void setTxtCodigo(String codigoPerfil){
        txtCodigo.setText(codigoPerfil);
    
    }
    public String getTxtCodigo(){
        return txtCodigo.getText().trim();
    }
    
    public String getTxtTipoUsuario(){
        return txtTipoUsuario.getText().trim();
    }
    
    public void setTxtTipoUsuario(String tipoUsuario){
        txtTipoUsuario.setText(tipoUsuario);
    }
    
    public String getTxtDescripcion(){
        return txtDescripcion.getText().trim();
    }
    
    public void setTxtDescripcion(String descripcion){
        txtDescripcion.setText(descripcion);
    }
    public void limpiar(){
        txtCodigo.setText("");
        txtTipoUsuario.setText("");
        txtDescripcion.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Módulo de administración y mantenimiento de usuarios");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 726, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Tipo de usuario");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 60));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 90, 100));
        jLabel6.setText("Perfil");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Código");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Descripción");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
