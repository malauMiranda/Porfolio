
package Controlador;

import Modelo.RegistroUsuarios;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Vista.GUILogin;
import ucr.ac.cr.Vista.GUIUsuarios;
import ucr.ac.cr.Vista.PanelLogin;


public class ControladorLogin implements ActionListener {
    
    PanelLogin panelLogin;
    GUILogin guiLogin;
    RegistroUsuarios registroUsuarios;
    Usuario usuario;
    GUIUsuarios guiUsuarios;

    public ControladorLogin(PanelLogin panelLogin, GUILogin guiLogin) {
        this.panelLogin = panelLogin;
        this.guiLogin = guiLogin;

    }
    
 public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Iniciar sesion")) {
            if (panelLogin.getTxtNombreUsuario().equalsIgnoreCase("")) {
                guiLogin.mostrarMensaje("Debe ingresar un nombre de usuario");
            } else {
                usuario = registroUsuarios.buscar(panelLogin.getTxtNombreUsuario());
                if (usuario.getContraseña() == panelLogin.getTxtContraseña()) {
                   guiUsuarios=new GUIUsuarios();
                } else {
                    guiUsuarios.mostrarMensaje("Nombre o contraseña incorrecta, intenta de nuevo");
                }
            }
            System.out.println("Presionó el botón Iniciar sesión");
        
        }
    }
}
