
package Vista;

import Modelo.Jugador;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;


public class PanelRegistro extends javax.swing.JPanel {

    private Jugador jugador;

    public PanelRegistro() {
        initComponents();
    }
    
    public void escuchar(ActionListener controladorRegistro){
    btnCerrar.addActionListener(controladorRegistro);
    btnListo.addActionListener(controladorRegistro);
    btnEliminar.addActionListener(controladorRegistro);
    }
    public void setTxtNombre(String nombre){
        txtNombre.setText(nombre);
    
    }
    public String getTxtNombre(){
        return txtNombre.getText().trim();
    }
    
        public void limpiar(){
        txtNombre.setText("");
    }
        
    public void setDatosTabla(String [][] datos){
       tblJugadores.setModel(new DefaultTableModel(datos,Jugador.ETIQUETAS_JUGADOR));
       jScrollPane1.setViewportView(tblJugadores);
    }
    
    public void escucharTabla(MouseListener manejador){
        tblJugadores.addMouseListener(manejador);
    }
    
    public String getFila(){
        int fila=tblJugadores.getSelectedRow();
        return tblJugadores.getModel().getValueAt(fila, 0).toString();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnListo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJugadores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 80));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 420, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR.png"))); // NOI18N
        btnEliminar.setActionCommand("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        btnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LISTO.png"))); // NOI18N
        btnListo.setActionCommand("Listo");
        btnListo.setBorder(null);
        add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CERRAR.png"))); // NOI18N
        btnCerrar.setActionCommand("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REGISTRO.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
