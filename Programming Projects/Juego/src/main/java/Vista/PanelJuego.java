
package Vista;

import Controlador.ControladorJuego;
import java.awt.Graphics;


public class PanelJuego extends javax.swing.JPanel {

private ControladorJuego controladorJuego;

    public PanelJuego() {
        initComponents();
         controladorJuego=new ControladorJuego(this,null);
       
    }
    
    public ControladorJuego getControladorJuego() {
        return controladorJuego;
    }
    
    public void repaint(Graphics g){
    controladorJuego.dibujar(g);
    }

    public void paint(Graphics g){// paint Icon para gifs
        super.paintComponent(g); 
        controladorJuego.dibujar(g);

       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1923, 1083));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
