
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Protagonista extends Elemento {
    
    
    public Protagonista(int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
    }

    public void dibujar(Graphics g){
        Icon pieza= new ImageIcon(imagen.getImage().getScaledInstance(300,300, Image.SCALE_AREA_AVERAGING));
        pieza.paintIcon(null,g,x,y);
    }
    
    
    
}
