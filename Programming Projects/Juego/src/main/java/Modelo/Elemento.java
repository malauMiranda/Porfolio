
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Elemento {
    
   public int x;
   public int y;
   public ImageIcon imagen;

    public Elemento(int x, int y, ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
     public void show (Graphics g){
        imagen.paintIcon(null,g,x,y);
        
       // g.drawString("X: "+x+"Y: "+y, x, y);
       // g.drawRect(x+70, y+90, imagen.getIconWidth()-145,imagen.getIconHeight()-145);
    }
    
     public Rectangle getBounds(){
     return new Rectangle(x+70,y+90,imagen.getIconWidth()-145,imagen.getIconHeight()-145);
     }
}
