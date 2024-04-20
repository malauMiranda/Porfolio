
package Controlador;

import Modelo.Sonido;
import Vista.GUIGanar;
import Vista.GUIInformacion;
import Vista.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorGUIGanar implements ActionListener {
    private GUIGanar guiGanar;
    private GUIPrincipal guiPrincipal;
    private Sonido sonido;

    public ControladorGUIGanar(GUIGanar guiGanar) {
        this.guiGanar = guiGanar;
        sonido=new Sonido();
    }
    
      public void actionPerformed(ActionEvent evento) {
        switch(evento.getActionCommand()){
            case "Cerrar":
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiGanar.dispose();
                guiPrincipal=new GUIPrincipal();
                guiPrincipal.setVisible(true);
                
                break;
                
        }
      }
    
}
