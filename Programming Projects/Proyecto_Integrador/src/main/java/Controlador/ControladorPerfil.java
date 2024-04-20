package Controlador;

import Modelo.Perfil;
import Modelo.RegistroPerfiles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Vista.GUIPerfil;
import ucr.ac.cr.Vista.GUIReporte;
import ucr.ac.cr.Vista.PanelBotones;
import ucr.ac.cr.Vista.PanelPerfil;

public class ControladorPerfil implements ActionListener {

    private PanelPerfil panelPerfil;
    private GUIPerfil guiPerfil;
    private RegistroPerfiles registroPerfiles;
    private PanelBotones panelBotones;
    private Perfil perfil;
    private GUIReporte guiReporte;

    public ControladorPerfil(PanelPerfil panelPerfil, GUIPerfil guiPerfil, PanelBotones panelBotones) {
        this.panelPerfil = panelPerfil;
        this.guiPerfil = guiPerfil;
        this.panelBotones = panelBotones;
        registroPerfiles = new RegistroPerfiles();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Buscar")) {
            if (panelPerfil.getTxtCodigo().equalsIgnoreCase("")) {
                guiPerfil.mostrarMensaje("Debe ingresar un código");
            } else {
                perfil = registroPerfiles.buscar(panelPerfil.getTxtCodigo());
                if (perfil != null) {
                    panelPerfil.setTxtTipoUsuario(perfil.getTipoUsuario());
                    panelPerfil.setTxtDescripcion(perfil.getDescripcionPerfil());
                    panelBotones.controlarBotones(true);
                } else {
                    guiPerfil.mostrarMensaje("Ese perfil no se encuentra registrado");
                }
            }
            System.out.println("Presionó el botón buscar");
        } else {
            if (e.getActionCommand().equalsIgnoreCase("agregar")) {
                if (panelPerfil.getTxtCodigo().equalsIgnoreCase("")) {
                    guiPerfil.mostrarMensaje("El código debe contener un dato");
                } else {
                    if (panelPerfil.getTxtTipoUsuario().equalsIgnoreCase("")) {
                        guiPerfil.mostrarMensaje("El tipo de usuario debe contener un dato");
                    } else {
                        if (panelPerfil.getTxtDescripcion().equalsIgnoreCase("")) {
                            guiPerfil.mostrarMensaje("La descripción debe contener un dato");
                        } else {
                            perfil = new Perfil(panelPerfil.getTxtCodigo(), panelPerfil.getTxtTipoUsuario(), panelPerfil.getTxtDescripcion());
                            guiPerfil.mostrarMensaje(registroPerfiles.agregar(perfil));
                            //panelUsuarios.setDatosTabla(registroUsuarios.getDatosTabla());
                            panelPerfil.limpiar();
                            panelBotones.controlarBotones(false);
                        }
                    }
                }
                //Comprobar cual es la información que necesitamos agregar
                //System.out.println("Nombre de usuario "+panelUsuarios.getTxtNombreUsuario()+" Contraseña "+panelUsuarios.getTxtContraseña());
                // System.out.println("Presionó el botón agregar");
            } else {
                if (e.getActionCommand().equalsIgnoreCase("Eliminar")) {
                    // estudio=(Estudio) registroEstudio.buscar(panelDatosEstudio.getTxtId());
                    if (panelPerfil.getTxtCodigo().equalsIgnoreCase("")) {
                        guiPerfil.mostrarMensaje("El código debe contener un dato");
                    } else {
                        if (panelPerfil.getTxtTipoUsuario().equalsIgnoreCase("")) {
                            guiPerfil.mostrarMensaje("El tipo de usuario debe contener un dato");
                        } else {
                            if (panelPerfil.getTxtDescripcion().equalsIgnoreCase("")) {
                                guiPerfil.mostrarMensaje("La descripción debe contener un dato");
                            } else 
                            {
                                guiPerfil.mostrarMensaje(registroPerfiles.eliminar(panelPerfil.getTxtCodigo()));
                            }
                            panelPerfil.limpiar();
                            panelBotones.controlarBotones(false);
                        }
                    }
                } else {
                    if (e.getActionCommand().equalsIgnoreCase("Modificar")) {
                        if (panelPerfil.getTxtTipoUsuario().equalsIgnoreCase("")) {
                            guiPerfil.mostrarMensaje("El tipo de usuario no puede estar en blanco");
                        } else {if (panelPerfil.getTxtDescripcion().equalsIgnoreCase("")) {
                            guiPerfil.mostrarMensaje("La descripcion no puede estar en blanco");
                        }else{
                            perfil.setCodigoPerfil(panelPerfil.getTxtCodigo());
                            perfil.setTipoUsuario(panelPerfil.getTxtTipoUsuario());
                            perfil.setDescripcionPerfil(panelPerfil.getTxtDescripcion());
                            guiPerfil.mostrarMensaje("Cambios realizados con éxito");
                            panelPerfil.limpiar();
                            panelBotones.controlarBotones(false);}
                        }
                    } else {
                        if (e.getActionCommand().equalsIgnoreCase("Consultar")) {
                            // guiUsuarios.mostrarMensaje(registroUsuarios.toString());
                            GUIReporte guiReporte = new GUIReporte();
                            guiReporte.setDatosTabla(registroPerfiles.getDatosTabla(), Perfil.ETIQUETAS_PERFIL, "Reporte Perfiles");
                            guiReporte.setVisible(true);

                        } else {
                            if (e.getActionCommand().equalsIgnoreCase("Salir")) {
                                guiPerfil.dispose();
                                //guiEstudio.setVisible(false);
                            }

                        }
                    }

                }
            }

        }

    }

}
