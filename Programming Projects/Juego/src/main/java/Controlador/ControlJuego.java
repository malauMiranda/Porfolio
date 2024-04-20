
package Controlador;

import Modelo.AreaJuego;
import Modelo.Protagonista;
import Vista.GUIJuego;
import Vista.GUINivel2;
import Vista.Panel;
import Vista.PanelJuego;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlJuego extends Thread{
    
    private Protagonista protagonista;
    private AreaJuego areaJuego;
    private PanelJuego panelJuego;
    private GUIJuego guiJuego;
    private ControladorJuego controladorJuego;
    
    
    private Panel panelNivel2;
    private GUINivel2 guiNivel2;
   
    int prueba=1;
    
     public ControlJuego()
    {
    }

    
    public ControlJuego(AreaJuego areaJuego, PanelJuego panelJuego,GUIJuego guiJuego,Panel panelNivel2,GUINivel2 guiNivel2, ControladorJuego controladorGUIJuego)
    {
        this.areaJuego = areaJuego;
        this.panelJuego=panelJuego;
        this.guiJuego=guiJuego;
        //PARA EL NIVEL 2
        this.panelNivel2 = panelNivel2;
        this.guiNivel2 = guiNivel2;

        this.controladorJuego=controladorGUIJuego;
    }
    
    
    
    @Override
    public void run() {
        while (prueba == 1) {
            try {
                if (controladorJuego.getNivel() == 1) {
                    for (int posicion = 0; posicion < areaJuego.getCantEnemigos1(); posicion++) {
                        areaJuego.getEnemigos1(posicion).mover();

                    }
                } else {
                    if (controladorJuego.getNivel() == 2) {
                        for (int posicion = 0; posicion < areaJuego.getCantEnemigos2(); posicion++) {
                            areaJuego.getEnemigos2(posicion).mover();

                        }
                    }
                }
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (areaJuego.isGanador()) {
            System.out.println("GANÓ");

        } else {
            System.out.println("PERDIÓ");
        }
        this.interrupt();
    }
}
