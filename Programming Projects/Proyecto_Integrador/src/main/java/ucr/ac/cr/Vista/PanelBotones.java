
package ucr.ac.cr.Vista;

import java.awt.event.ActionListener;


public class PanelBotones extends javax.swing.JPanel {


    public PanelBotones() {
        initComponents();
    }
    
    public void escuchar (ActionListener manejador){
        btnAgregar.addActionListener(manejador);
        btnEliminar.addActionListener(manejador);
        btnModificar.addActionListener(manejador);
        btnConsultar.addActionListener(manejador);
        btnBuscar.addActionListener(manejador);
        btnSalir.addActionListener(manejador);
    }
    
    
    public void controlarBotones(boolean estado){
           btnAgregar.setEnabled(!estado);
           btnModificar.setEnabled(estado);
           btnEliminar.setEnabled(estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregar.png"))); // NOI18N
        btnAgregar.setActionCommand("Agregar");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnModificar.png"))); // NOI18N
        btnModificar.setToolTipText("");
        btnModificar.setActionCommand("Modificar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.setActionCommand("Eliminar");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnConsultar.png"))); // NOI18N
        btnConsultar.setActionCommand("Consultar");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBuscar.png"))); // NOI18N
        btnBuscar.setActionCommand("Buscar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(btnSalir)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultar)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
