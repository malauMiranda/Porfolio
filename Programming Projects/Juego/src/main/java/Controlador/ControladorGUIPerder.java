
package Controlador;

import Modelo.Sonido;
import Vista.GUIJuego;
import Vista.GUIPerder;
import Vista.GUIPerder2;
import Vista.GUIPrincipal;
import Vista.PanelJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorGUIPerder implements ActionListener{
    
    private GUIPerder guiPerder;
    private GUIPrincipal guiPrincipal;
    private PanelJuego panelJuego;
    private ControladorJuego controladorJuego;
    private ControladorGUIPrincipal controladorGUIPrincipal;
    private GUIPerder2 guiPerder2;
    private GUIJuego guiJuego2;
    private Sonido sonido;
    
    public ControladorGUIPerder(GUIPerder guiPerder,GUIPrincipal guiPrincipal) {
        guiPrincipal=new GUIPrincipal();
        controladorGUIPrincipal=new ControladorGUIPrincipal(guiPrincipal);
        this.guiPerder = guiPerder;
        this.guiPrincipal = guiPrincipal;
        sonido=new Sonido();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){

           case "Salir":
               sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiPerder.setVisible(false);
                guiPrincipal.setVisible(true);
               break;           
           
            case "Intentar de nuevo":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiJuego2 = new GUIJuego();
                this.panelJuego = guiJuego2.getPanelJuego();
                this.controladorJuego = panelJuego.getControladorJuego();
                 guiJuego2.getControladorJuego().getControlJuego().start();
                 panelJuego.repaint();
                 guiJuego2.setVisible(true);
               break;
               
               
            case "Intentar otra vez":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiJuego2 = new GUIJuego();
                this.panelJuego = guiJuego2.getPanelJuego();
                this.controladorJuego = panelJuego.getControladorJuego();
                controladorJuego.setNivel(2);
                 guiJuego2.getControladorJuego().getControlJuego().start();
                 panelJuego.repaint();
                 guiJuego2.setVisible(true);
               break;
       }
    }
    
    
    
}
