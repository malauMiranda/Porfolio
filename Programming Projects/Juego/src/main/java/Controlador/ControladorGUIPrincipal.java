
package Controlador;

import Modelo.Elemento;
import Modelo.Sonido;
import Vista.GUIInformacion;
import Vista.GUIJuego;
import Vista.GUINivel2;
import Vista.GUIPrincipal;
import Vista.GUIRegistro;
import Vista.Panel;
import Vista.PanelJuego;
import Vista.PanelRegistro;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class ControladorGUIPrincipal implements ActionListener {
    
private PanelJuego panelJuego;
private GUIJuego guiJuego;
private GUIPrincipal guiPrincipal;
private ControladorJuego controladorJ;
private GUIInformacion guiInformacion;
private Sonido sonido;

private GUIRegistro guiRegistro;
private PanelRegistro panelRegisreo;

public ControladorGUIPrincipal(GUIPrincipal guiPrincipal) {
        this.guiPrincipal = guiPrincipal;
        guiJuego=new GUIJuego();
        this.panelJuego=guiJuego.getPanelJuego();
        guiRegistro=new GUIRegistro();
        sonido=new Sonido();
        
    }



    @Override
    public void actionPerformed(ActionEvent evento) {
        switch(evento.getActionCommand()){
            case "Informacion":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiInformacion=new GUIInformacion();
                guiInformacion.setVisible(true);
                break;
                
            case "Jugar":
                     sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                    guiPrincipal.dispose(); 
                    guiJuego.setVisible(true);
                    guiJuego.getControladorJuego().getControlJuego().start();
                    panelJuego.repaint();
                               
                break;
                
            case "Salir":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                System.exit(0);
                break;
                
            case "Registro":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiRegistro.setVisible(true); 
                break;
        
        }
    }
    
    
public void cerrarGUIJuego(){
    guiJuego.dispose();
}

public GUIJuego getGUIJuego(){
    return guiJuego;
}
}
