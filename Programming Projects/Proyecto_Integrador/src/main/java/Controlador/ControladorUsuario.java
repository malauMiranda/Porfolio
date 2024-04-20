
package Controlador;

import Modelo.RegistroUsuarios;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ucr.ac.cr.Vista.GUILogin;
import ucr.ac.cr.Vista.GUIPerfil;
import ucr.ac.cr.Vista.GUIReporte;
import ucr.ac.cr.Vista.GUIUsuarios;
import ucr.ac.cr.Vista.PanelBotones;
import ucr.ac.cr.Vista.PanelUsuarios;

public class ControladorUsuario implements ActionListener{

    private PanelUsuarios panelUsuarios;
    private GUIUsuarios guiUsuarios;
    private GUIPerfil guiPerfil;
    private RegistroUsuarios registroUsuarios;
    private PanelBotones panelBotones;
    private Usuario usuario;
    private GUIReporte guiReporte;

    public ControladorUsuario(PanelUsuarios panelUsuarios, PanelBotones panelBotones, GUIUsuarios guiUsuarios) {
        this.panelUsuarios = panelUsuarios;
        this.guiUsuarios = guiUsuarios;
        this.panelBotones = panelBotones;
        registroUsuarios = new RegistroUsuarios();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Buscar")) {
            if (panelUsuarios.getTxtNombreUsuario().equalsIgnoreCase("")) {
                guiUsuarios.mostrarMensaje("Debe ingresar un nombre de usuario");
            } else {
                usuario = registroUsuarios.buscar(panelUsuarios.getTxtNombreUsuario());
                if (usuario != null) {
                    panelUsuarios.setTxtContraseña(usuario.getContraseña());
                    panelBotones.controlarBotones(true);
                } else {
                    guiUsuarios.mostrarMensaje("Ese usuario no se encuentra registrado");
                }
            }
            System.out.println("Presionó el botón buscar");
        } else {
            if (e.getActionCommand().equalsIgnoreCase("agregar")) {
                if (panelUsuarios.getTxtNombreUsuario().equalsIgnoreCase("")) {
                    guiUsuarios.mostrarMensaje("El nombre de usuario debe contener un dato");
                } else {
                    if (panelUsuarios.getTxtContraseña().equalsIgnoreCase("")) {
                        guiUsuarios.mostrarMensaje("La contraseña debe contener un dato");
                    } else {
                        usuario = new Usuario(panelUsuarios.getTxtNombreUsuario(), panelUsuarios.getTxtContraseña());
                        guiUsuarios.mostrarMensaje(registroUsuarios.agregar(usuario));
                        //panelUsuarios.setDatosTabla(registroUsuarios.getDatosTabla());
                        panelUsuarios.limpiar();
                        panelBotones.controlarBotones(false);
                    }

                }
                //Comprobar cual es la información que necesitamos agregar
                System.out.println("Nombre de usuario " + panelUsuarios.getTxtNombreUsuario() + " Contraseña " + panelUsuarios.getTxtContraseña());
                System.out.println("Presionó el botón agregar");
            } else {
                if (e.getActionCommand().equalsIgnoreCase("Eliminar")) {
                    // estudio=(Estudio) registroEstudio.buscar(panelDatosEstudio.getTxtId());
                    if (panelUsuarios.getTxtNombreUsuario().equalsIgnoreCase("")) {
                        guiUsuarios.mostrarMensaje("El nombre de usuario no puede estar en blanco");
                    } else {
                        if (panelUsuarios.getTxtContraseña().equalsIgnoreCase("")) {
                            guiUsuarios.mostrarMensaje("La contraseña debe contener un dato");
                        }
                        {
                            // guiUsuarios.mostrarMensaje(registroUsuarios.eliminar(usuario));
                            guiUsuarios.mostrarMensaje(registroUsuarios.eliminar(panelUsuarios.getTxtNombreUsuario()));
                            panelUsuarios.limpiar();
                            panelBotones.controlarBotones(false);
                        }
                    }
                } else {
                    if (e.getActionCommand().equalsIgnoreCase("Modificar")) {
                        if (panelUsuarios.getTxtContraseña().equalsIgnoreCase("")) {
                            guiUsuarios.mostrarMensaje("La contraseña no puede estar en blanco");
                        } else {
                            usuario.setNombreUsuario(panelUsuarios.getTxtNombreUsuario());//MODIFICAR PRIMARY KEY
                            usuario.setContraseña(panelUsuarios.getTxtContraseña());
                            guiUsuarios.mostrarMensaje("Cambios realizados con éxito");
                            panelUsuarios.limpiar();
                            panelBotones.controlarBotones(false);
                        }
                    } else {
                        if (e.getActionCommand().equalsIgnoreCase("Consultar")) {
                            // guiUsuarios.mostrarMensaje(registroUsuarios.toString());
                            GUIReporte guiReporte = new GUIReporte();
                            guiReporte.setDatosTabla(registroUsuarios.getDatosTabla(), Usuario.ETIQUETAS_USUARIO, "Reporte Usuarios");
                            guiReporte.setVisible(true);

                        } else {
                            if (e.getActionCommand().equalsIgnoreCase("Salir")) {
                                guiUsuarios.dispose();
                                //guiEstudio.setVisible(false);
                            }else{
                            if (e.getActionCommand().equalsIgnoreCase("Editar perfil")) {
                                guiPerfil=new GUIPerfil();
                                guiPerfil.setVisible(true);
                                }
                            }

                        }
                    }

                }
            }

        }
    }

}
