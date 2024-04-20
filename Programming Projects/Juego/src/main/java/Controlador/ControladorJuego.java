               
package Controlador;


import Modelo.AreaJuego;
import Modelo.Fondo;
import Modelo.Jugador;
import Modelo.Protagonista;
import Modelo.RegistroJugadores;
import Modelo.Sonido;
import Vista.GUIGanar;
import Vista.GUIJuego;
import Vista.GUINivel2;
import Vista.GUIPerder;
import Vista.GUIPerder2;
import Vista.GUIPrincipal;
import Vista.GUIVictoria;
import Vista.Panel;
import Vista.PanelJuego;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;


public class ControladorJuego implements KeyListener{
   
    private Fondo fondo;
    private Fondo fondo2;
    private Fondo fondo3;
    private Protagonista protagonista;
    private PanelJuego panelJuego;
    private AreaJuego areaJuego;
    private GUIJuego guiJuego;
    private GUIPrincipal guiPrincipal;
    private GUIVictoria guiVictoria;
    private GUIPerder guiPerder;
    private GUIPerder2 guiPerder2;
    private ControlJuego controlJuego;
    private Jugador jugador;
    private Sonido sonido;
    private RegistroJugadores registroJugadores;
    private GUIGanar guiGanar;
    
    //Ignorar todo nivel2
    private ControlJuego controlJuegoNivel2;
    private Panel panelNivel2;
    private GUINivel2 guiNivel2;
    //
    private int nivel=1;
    private int cantCerezas;

    
    
    boolean colision;
    boolean colisionEnemigo;
    boolean colisionBloque;
    
    ImageIcon gifAtras=new ImageIcon("./src/main/resources/img/ATRAS_2.gif");
    ImageIcon gifDerecha=new ImageIcon("./src/main/resources/img/DERECHA_2.gif");
    ImageIcon gifFrente=new ImageIcon("./src/main/resources/img/FRENTE_2.gif");
    ImageIcon gifIzquierda=new ImageIcon("./src/main/resources/img/IZQUIERDA.gif");
    ImageIcon win=new ImageIcon("./src/main/resources/img/WIN.png");
    ImageIcon curado=new ImageIcon("./src/main/resources/img/CURADO.png");
    ImageIcon lose=new ImageIcon("./src/main/resources/img/LOSE.png");
    
    public ControladorJuego (PanelJuego panelJuego, Panel Nivel2) {
        this.panelJuego=panelJuego;
        this.panelNivel2 = Nivel2;
        this.registroJugadores=registroJugadores;
        areaJuego=new AreaJuego();
        sonido= new Sonido();
        crearFondo1();
        crearFondo2();
        crearFondo3();
        protagonista=new Protagonista(527,240,new ImageIcon("./src/main/resources/img/MAIN.png"));
       
        
////Para el nivel 2(ignorar)
        controlJuego =new ControlJuego(areaJuego,null,null,panelNivel2,guiNivel2,this);

    }
    
    public ControlJuego getControlJuego(){
        return controlJuego;
    }
    
    public Protagonista getProtagonista(){
        return protagonista;
    }
    

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }
    
    public int pasarDeNivel(){
        nivel=getNivel()+1;
        
        return nivel;
    }
 
    public int getCantCerezas() {
        return cantCerezas;
    }
    
    public Fondo crearFondo1(){
         ImageIcon fondoIcon=new ImageIcon("./src/main/resources/img/FONDO CHOCOLATE VECTOR.png");
         fondo=new Fondo(0,0,fondoIcon);
         return fondo;
    }
    
    public Fondo crearFondo2(){
         ImageIcon fondoIcon=new ImageIcon("./src/main/resources/img/FONDO VAINILLA VECTOR.png");
         fondo2=new Fondo(0,0,fondoIcon);
         return fondo2;
    }
    
    public Fondo crearFondo3(){
         ImageIcon fondoIcon=new ImageIcon("./src/main/resources/img/FONDO FRESA VECTOR_1.png");
         fondo3=new Fondo(0,0,fondoIcon);
         return fondo3;
    }
    
    public void dibujar(Graphics g){
  
        if (nivel == 1) {
            fondo.dibujar(g);
            areaJuego.dibujar1(g);
            areaJuego.dibujarCerezas1(g);
            areaJuego.dibujarEnemigos1(g);
        } else {
            if (nivel == 2) {
                fondo2.dibujar(g);
                areaJuego.dibujar2(g);
                areaJuego.dibujarCerezas2(g);
                areaJuego.dibujarEnemigos2(g);
    
            } else {
                if (nivel == 3) {
                    fondo3.dibujar(g);
                    areaJuego.dibujar3(g);
                    areaJuego.dibujarCerezas3(g);            
                    areaJuego.dibujarEnemigos3(g);
                }
            }
        }
        protagonista.show(g);
    }


       
    
    public void actualizar(){
        panelJuego.repaint();
    }
    
    

    
    public boolean getColisionBordes(){
        
        colision=false;
        for(int posicion=0;posicion<fondo.getSize();posicion++){  
        if((protagonista.getBounds().intersects(fondo.getBorde(posicion)))){
            colision=true;
            System.out.println("COLISIÓN");
             }
        }
        return colision;
    }
 
    public boolean getColisionEnemigo1(){
        
        colisionEnemigo=false;
        for(int posicion=0;posicion<areaJuego.getCantEnemigos1();posicion++){  
        if(protagonista.getBounds().intersects(areaJuego.getEnemigos1(posicion).getBounds())){
            sonido.reproducirSonido("./src/main/resources/img/SPERDER.wav");
            colisionEnemigo=true;
             protagonista.setImagen(lose);
            guiPerder=new GUIPerder(guiJuego,guiPrincipal);
            guiPerder.setVisible(true);
            System.out.println("COLISIÓN ENEMIGO");
             }
        }
        return colisionEnemigo;
    }
    
    
    public boolean getColisionEnemigo2(){
        
        colisionEnemigo=false;
        for(int posicion=0;posicion<areaJuego.getCantEnemigos2();posicion++){  
        if(protagonista.getBounds().intersects(areaJuego.getEnemigos2(posicion).getBounds())){
            sonido.reproducirSonido("./src/main/resources/img/SPERDER.wav");
            colisionEnemigo=true;
             protagonista.setImagen(lose);
            guiPerder2=new GUIPerder2(guiJuego,guiPrincipal);
            guiPerder2.setVisible(true);
            System.out.println("COLISIÓN ENEMIGO");
             }
        }
        return colisionEnemigo;
    }
    
    public boolean getColisionBloques(){
        
        switch(nivel){
            case 1:
                for(int elemento=0;elemento<areaJuego.getSize1();elemento++){
                    if(protagonista.getBounds().intersects(areaJuego.getBloques1(elemento).getBorde())){
                        colisionBloque=true;
                         System.out.println("COLISIÓN BLOQUE");
                }
            }
        
            break;
            
            case 2:
               for(int elemento=0;elemento<areaJuego.getSize2();elemento++){
                    if(protagonista.getBounds().intersects(areaJuego.getBloques2(elemento).getBorde())){
                         colisionBloque=true;
                         System.out.println("COLISIÓN");
                    }
                }
             
                   
            break;
                    
            case 3:
                   for(int elemento=0;elemento<areaJuego.getSize3();elemento++){
                       if(protagonista.getBounds().intersects(areaJuego.getBloques3(elemento).getBorde())){
                         colision=true;
                         System.out.println("COLISIÓN");
                       }
                   }
            break;
        }
        return colision;
    }
    
   
    public boolean getColisionCerezas(){
        switch (nivel){
            
            case 1:
                for(int elemento=0;elemento<areaJuego.getSizeCerezas1();elemento++){
                    if(protagonista.getBounds().intersects(areaJuego.getCerezas1(elemento).getBorde())){
                        sonido.reproducirSonido("./src/main/resources/img/POP.wav");
                        colision=true;
                        areaJuego.recogerCereza1(areaJuego.getCerezas1(elemento));
                        cantCerezas++;
                         System.out.println("COLISIÓN");
                         System.out.println("CEREZAS: "+cantCerezas);
                    }
             }
                break;
                
            case 2:
               for(int elemento=0;elemento<areaJuego.getSizeCerezas2();elemento++){
                    if(protagonista.getBounds().intersects(areaJuego.getCerezas2(elemento).getBorde())){
                        sonido.reproducirSonido("./src/main/resources/img/POP.wav");
                        colision=true;
                        areaJuego.recogerCereza2(areaJuego.getCerezas2(elemento));
                        cantCerezas++;
                         System.out.println("COLISIÓN");
                         System.out.println("CEREZAS: "+cantCerezas);
                }
            }
    
            }
                  
         return colision;
        
    }
    
    public boolean isColision(){
        if(colisionEnemigo==true){
            
            return true;
        }
        return false;
    }
    
    public boolean isColisionBloque(){
        if(colisionBloque==true){
            
            return true;
        }
        return false;
    }

    
    public void pasarNivel() {
        if (nivel == 1) {
            if (cantCerezas == 3) {
                protagonista.setImagen(win);
                for (int elemento = 0; elemento < areaJuego.getCantEnemigos1(); elemento++) {
                    areaJuego.getEnemigos1(elemento).setImagen(curado);
                }
                sonido.reproducirSonido("./src/main/resources/img/SGANAR.wav");
                guiVictoria = new GUIVictoria(guiJuego);
                guiVictoria.setVisible(true);
                
            }
        } else {
            if (nivel == 2) {
                if (cantCerezas == 4) {
                    protagonista.setImagen(win);
                    for (int elemento = 0; elemento < areaJuego.getCantEnemigos2(); elemento++) {
                        areaJuego.getEnemigos2(elemento).setImagen(curado);
                    }
                    sonido.reproducirSonido("./src/main/resources/img/SGANAR.wav");
                    guiGanar=new GUIGanar();
                    guiGanar.setVisible(true);
                }
            }

        }
    }
    
         
    public void finalizarJuego(){
        System.out.println("GANÓ");
}
    

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
        if(e.getKeyCode()==KeyEvent.VK_UP){
             if(protagonista.getY()>23){
                 
                System.out.println("ENTRÉ A MOVER ARRIBA");
                 protagonista.setImagen(gifAtras);
                 protagonista.setY(protagonista.getY()-7);}
             
                 if(colisionBloque==true){
                  protagonista.setY(protagonista.getY()+26);
                  colisionBloque=false;
                 }
        }else{
             if(e.getKeyCode()==KeyEvent.VK_DOWN){
                 if(protagonista.getY()<464){
                 
                     protagonista.setImagen(gifFrente);
                     protagonista.setY(protagonista.getY()+7);}
                 
                   if(colisionBloque==true){
                  protagonista.setY(protagonista.getY()-26);
                  colisionBloque=false;
                 }
                 
             }else{
                   if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                       if(protagonista.getX()<1150){
                           
                         protagonista.setImagen(gifDerecha);
                         protagonista.setX(protagonista.getX()+7);}
                       
                        if(colisionBloque==true){
                  protagonista.setX(protagonista.getX()-10);
                  colisionBloque=false;
                 }
                   }else{
                         if(e.getKeyCode()==KeyEvent.VK_LEFT){
                             if(protagonista.getX()>33){
                             
                                protagonista.setImagen(gifIzquierda);
                                protagonista.setX(protagonista.getX()-7);}
                             
                                if(colisionBloque==true){
                                     protagonista.setX(protagonista.getX()+10);
                                     colisionBloque=false; }
                
                           }
                        }
                     }
                 }
        getColisionBordes();
        getColisionEnemigo1();
        getColisionEnemigo2();
        getColisionBloques();
        getColisionCerezas();
        
        
            panelJuego.repaint();
         pasarNivel();
        
     
    }

    /**
     *
     * @param arg0
     */
    @Override
    public void keyReleased(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
