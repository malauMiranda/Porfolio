
package Controlador;

import Modelo.Jugador;
import Modelo.RegistroJugadores;
import Modelo.Sonido;
import Vista.GUIRegistro;
import Vista.PanelRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ControladorRegistro implements ActionListener,MouseListener{
    private PanelRegistro panelRegistro;
    private GUIRegistro guiRegistro;
    private Jugador jugador;
    private RegistroJugadores registroJugadores;
    private Sonido sonido;
    private ControladorJuego controladorJuego;
    
public ControladorRegistro(PanelRegistro panelRegistro,GUIRegistro guiRegistro, ControladorJuego controladorJuego)
    {
        this.panelRegistro = panelRegistro;
        this.guiRegistro=guiRegistro;
        this.controladorJuego=controladorJuego;
        registroJugadores=new RegistroJugadores(controladorJuego);
        panelRegistro.setDatosTabla(registroJugadores.getDatosTabla());
        sonido=new Sonido();
    }



    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Listo")) {
            sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
            if (panelRegistro.getTxtNombre().equalsIgnoreCase("")) {
                guiRegistro.mostrarMensaje("El nombre no puede ir vacío");
 
            }else{
               if( registroJugadores.buscar(panelRegistro.getTxtNombre())==null){
                jugador = new Jugador(panelRegistro.getTxtNombre(), "1");//HACER MÉTODO PARA METER EL NIEVL AQUI
                registroJugadores.agregar(jugador);
                 guiRegistro.mostrarMensaje("Se ha registrado un nuevo jugador");
                panelRegistro.setDatosTabla(registroJugadores.getDatosTabla());
                panelRegistro.limpiar();
                
                 //guiRegistro.mostrarMensaje("Jugadores "+ registroJugadores.toString());
               }else{
               guiRegistro.mostrarMensaje("Bienvenido de vuelta");
               registroJugadores.buscar(panelRegistro.getTxtNombre());
               }
            }
        } else {
            if (e.getActionCommand().equalsIgnoreCase("Cerrar")) {
                sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                guiRegistro.dispose();
                
            } else {
                if (e.getActionCommand().equalsIgnoreCase("eliminar")) {
                    sonido.reproducirSonido("./src/main/resources/img/SBOTON.wav");
                     jugador=(Jugador) registroJugadores.buscar(panelRegistro.getTxtNombre());
                     guiRegistro.mostrarMensaje(registroJugadores.eliminar(jugador));
                    //guiRegistro.mostrarMensaje(registroJugadores.eliminar(panelRegistro.getTxtNombre()));
                    registroJugadores.eliminar(panelRegistro.getTxtNombre());
                    panelRegistro.limpiar();

                }

            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        System.out.println(panelRegistro.getFila());
        jugador=(Jugador)registroJugadores.buscar(panelRegistro.getFila());
        panelRegistro.setTxtNombre(jugador.getNombre());
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
