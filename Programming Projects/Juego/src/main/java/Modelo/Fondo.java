package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Fondo extends Elemento {
    
    private ArrayList<Rectangle> bordes;

    public Fondo(int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
        bordes = new ArrayList<Rectangle>();
        crearBordes();
    }

    public void dibujar(Graphics g) {
        Icon pieza = new ImageIcon(imagen.getImage().getScaledInstance(1374, 706, Image.SCALE_AREA_AVERAGING));
        pieza.paintIcon(null, g, x, y);
        //g.drawRect(x, y, 80, 700);
        //g.drawRect(x, y, 1350, 90);
        //g.drawRect(x+1293, y, 86, 700);
        //g.drawRect(x, y+635, 1350, 75);
    }

    public void crearBordes() {
        Rectangle borde1 = new Rectangle(x, y, 80, 700);
        bordes.add(borde1);
        Rectangle borde2 = new Rectangle(x, y, 1350, 90);
        bordes.add(borde2);
        Rectangle borde3 = new Rectangle(x+1293, y, 86, 700);
        bordes.add(borde3);
        Rectangle borde4 = new Rectangle(x, y+635, 1350, 975);
        bordes.add(borde4);
    }
    
    public Rectangle getBorde(int posicion){
        
            return bordes.get(posicion);
       
    }
    
    public int getSize(){
        return bordes.size();
    }
}
