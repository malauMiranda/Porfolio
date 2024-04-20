
package Controlador;

import Vista.GUIJuego;
import Vista.GUIPrincipal;
import Vista.GUIVictoria;
import Vista.PanelJuego;
import Controlador.ControladorJuego;
import Modelo.Sonido;
import Vista.GUINivel2;
import Vista.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorGUIVictoria implements ActionListener {
    
    
    private GUIJuego guiJuego;
    private GUIJuego guiNivel2;
    private Panel panelNivel2;
    private GUIVictoria guiVictoria;
    private GUIPrincipal guiPrincipal;
    private PanelJuego panel2;
    private PanelJuego panel;
    private ControladorJuego controladorJuego;
    private ControladorJuego controladorJuego2;
    private Sonido sonido;

    public ControladorGUIVictoria(GUIVictoria guiVictoria,GUIJuego guiJuego) {
        this.guiVictoria = guiVictoria;
        sonido= new Sonido();
        
    }
    


    @Override
    public void actionPerformed(ActionEvent evento) {
        
        switch(evento.getActionCommand()){

                
            case "Siguiente Nivel":
                guiVictoria.setVisible(false);
                 guiNivel2=new GUIJuego();    
                 this.panel2=guiNivel2.getPanelJuego();
                 this.controladorJuego2=panel2.getControladorJuego();
                 controladorJuego2.pasarDeNivel();
                 sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                 guiNivel2.getControladorJuego().getControlJuego().start();
                 panel2.repaint();
                 guiNivel2.setVisible(true);

                break;
                
            case "Salir":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiVictoria.setVisible(false);
                guiPrincipal=new GUIPrincipal();
                guiPrincipal.setVisible(true);
                break;
        
        }
    }
    
    
    
}
