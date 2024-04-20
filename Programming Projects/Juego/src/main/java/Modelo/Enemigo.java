
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Enemigo extends Elemento {
    
    private int direccion;
    private boolean colision;


    public Enemigo(int direccion, int x, int y, ImageIcon imagen) {
        super(x, y, imagen);
        this.direccion = direccion;
        this.colision=colision;
        
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public boolean isColision() {
        return colision;
    }

    public void setColision(boolean colision) {
        this.colision = colision;
    }
    
    public void mover(){
        
     switch (direccion) {
        case 0:
             if (getX() < 1150) {
                 setX(getX() + 20);
             } else {
                 if (getX() >=1150) {
                     direccion=1;
                 
                 }
             }
             break;

        case 1:
            if (getX() > 33) {
                setX(getX() - 20);
            } else {
                direccion=0;
                
            }
            break;
            
        case 2:
            if (getY() < 464) {
                setY(getY() + 20);
            } else {
            direccion=3;               
            
            }
            break;
            
        case 3:
            if (getY() > 23) {
                setY(getY() - 20);
            } else {
                direccion=2;
                
            }
            break;
    }


}
    
    
    
}
