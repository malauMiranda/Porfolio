
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Cereza extends Elemento{

    public Cereza(int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
    }

    public void dibujar(Graphics g) {
        Icon pieza = new ImageIcon(imagen.getImage().getScaledInstance(50,56, Image.SCALE_AREA_AVERAGING));
        pieza.paintIcon(null, g, x, y);

        //g.drawString("X: "+x+"Y: "+y, x, y);
        //g.drawRect(x, y, imagen.getIconWidth()-7,imagen.getIconHeight()-10);
    }
    
    public Rectangle getBorde(){
     return new Rectangle(x,y,imagen.getIconWidth()-7,imagen.getIconHeight()-7);
     }
}
