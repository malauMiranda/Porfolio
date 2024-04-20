
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Bloque extends Elemento {

    public Bloque(int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
    }
    
    public void dibujar(Graphics g) {
        Icon pieza = new ImageIcon(imagen.getImage().getScaledInstance(66,78, Image.SCALE_AREA_AVERAGING));
        pieza.paintIcon(null, g, x, y);

       // g.drawString("X: "+x+"Y: "+y, x, y);
        //g.drawRect(x, y, imagen.getIconWidth()-20,imagen.getIconHeight()-30);
    }
    
    public Rectangle getBorde(){
     return new Rectangle(x,y,imagen.getIconWidth()-20,imagen.getIconHeight()-30);
     }
}
