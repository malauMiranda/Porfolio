
package Modelo;

import Controlador.ControladorJuego;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class AreaJuego {
    
ControladorJuego controladorJuego; 


    private ArrayList<Bloque>bloquesChoco;
    private ArrayList<Bloque>bloquesVainilla;
    private ArrayList<Bloque>bloquesFresa;
    private ArrayList<Enemigo> enemigos1;
    private ArrayList<Enemigo> enemigos2;
    private ArrayList<Enemigo> enemigos3;
    private ArrayList<Cereza> cerezas1;
    private ArrayList<Cereza> cerezas2;
    private ArrayList<Cereza> cerezas3;
    
    ImageIcon bloqueChoco=new ImageIcon("./src/main/resources/img/BLOQUE1.png");
    ImageIcon bloqueVaini=new ImageIcon("./src/main/resources/img/BLOQUE2.png");
    ImageIcon bloqueFresa=new ImageIcon("./src/main/resources/img/BLOQUE3.png");
    ImageIcon cerezaImg=new ImageIcon("./src/main/resources/img/CEREZA.png");
    
    public AreaJuego() {
        bloquesChoco= new ArrayList<Bloque>();
        bloquesVainilla= new ArrayList<Bloque>();
        bloquesFresa= new ArrayList<Bloque>();
        enemigos1= new ArrayList<Enemigo>();
        enemigos2= new ArrayList<Enemigo>();
        enemigos3= new ArrayList<Enemigo>();
        cerezas1=new ArrayList<Cereza>();
        cerezas2=new ArrayList<Cereza>();
        cerezas3=new ArrayList<Cereza>();
        crearCerezas1();
        crearCerezas2();
        crearCerezas3();
        crearEnemigos1();
        crearEnemigos2();
        crearEnemigos3();
        crearBloques1();
        crearBloques2();
        crearBloques3();
    }
     public void crearBloques1(){
        Bloque bloque1 = new Bloque(121,184,bloqueChoco);
        bloquesChoco.add(bloque1);
        Bloque bloque2 = new Bloque(500,115,bloqueChoco);
        bloquesChoco.add(bloque2);
        Bloque bloque3 = new Bloque(395,300,bloqueChoco);
        bloquesChoco.add(bloque3);
        Bloque bloque4 = new Bloque(795,300,bloqueChoco);
        bloquesChoco.add(bloque4);
        Bloque bloque5 = new Bloque(534,436,bloqueChoco);
        bloquesChoco.add(bloque5);
        Bloque bloque6 = new Bloque(835,480,bloqueChoco);
        bloquesChoco.add(bloque6);
        Bloque bloque7 = new Bloque(1100,305,bloqueChoco);
        bloquesChoco.add(bloque7);
        Bloque bloque8 = new Bloque(1010,162,bloqueChoco);
        bloquesChoco.add(bloque8);
        Bloque bloque9 = new Bloque(170,422,bloqueChoco);
        bloquesChoco.add(bloque9);
        Bloque bloque10 = new Bloque(1017,468,bloqueChoco);
        bloquesChoco.add(bloque10);
    }
    
    public Bloque getBloques1(int elemento){
         return bloquesChoco.get(elemento);
       
    }
    
    public int getSize1(){
        return bloquesChoco.size();
    }

    public void dibujar1(Graphics g){
            for (int posicion = 0; posicion < getSize1(); posicion++) {
             getBloques1(posicion).dibujar(g);
        }
    }
    
    
    public void crearBloques2(){
        Bloque bloque1 = new Bloque(121,184,bloqueVaini);
        bloquesVainilla.add(bloque1);
        Bloque bloque2 = new Bloque(500,115,bloqueVaini);
        bloquesVainilla.add(bloque2);
        Bloque bloque3 = new Bloque(395,300,bloqueVaini);
        bloquesVainilla.add(bloque3);
        Bloque bloque4 = new Bloque(795,300,bloqueVaini);
        bloquesVainilla.add(bloque4);
        Bloque bloque5 = new Bloque(534,436,bloqueVaini);
        bloquesVainilla.add(bloque5);
        Bloque bloque6 = new Bloque(835,480,bloqueVaini);
        bloquesVainilla.add(bloque6);
        Bloque bloque7 = new Bloque(1100,305,bloqueVaini);
        bloquesVainilla.add(bloque7);
        Bloque bloque8 = new Bloque(1010,162,bloqueVaini);
        bloquesVainilla.add(bloque8);
        Bloque bloque9 = new Bloque(170,422,bloqueVaini);
        bloquesVainilla.add(bloque9);
        Bloque bloque10 = new Bloque(1017,468,bloqueVaini);
        bloquesVainilla.add(bloque10);
    }
    
    public Bloque getBloques2(int elemento){
         return bloquesVainilla.get(elemento);
       
    }
    
    public int getSize2(){
        return bloquesVainilla.size();
    }

    public void dibujar2(Graphics g){
            for (int posicion = 0; posicion < getSize1(); posicion++) {
             getBloques2(posicion).dibujar(g);
        }
    }
    

    public void crearBloques3(){
        Bloque bloque1 = new Bloque(121,184,bloqueFresa);
        bloquesFresa.add(bloque1);
        Bloque bloque2 = new Bloque(500,115,bloqueFresa);
        bloquesFresa.add(bloque2);
        Bloque bloque3 = new Bloque(395,300,bloqueFresa);
        bloquesFresa.add(bloque3);
        Bloque bloque4 = new Bloque(795,300,bloqueFresa);
        bloquesFresa.add(bloque4);
        Bloque bloque5 = new Bloque(534,436,bloqueFresa);
        bloquesFresa.add(bloque5);
        Bloque bloque6 = new Bloque(835,480,bloqueFresa);
        bloquesFresa.add(bloque6);
        Bloque bloque7 = new Bloque(1100,305,bloqueFresa);
        bloquesFresa.add(bloque7);
        Bloque bloque8 = new Bloque(1010,162,bloqueFresa);
        bloquesFresa.add(bloque8);
        Bloque bloque9 = new Bloque(170,422,bloqueFresa);
        bloquesFresa.add(bloque9);
        Bloque bloque10 = new Bloque(1017,468,bloqueFresa);
        bloquesFresa.add(bloque10);
    }
    
    public Bloque getBloques3(int elemento){
         return bloquesFresa.get(elemento);
       
    }
    
    public int getSize3(){
        return bloquesFresa.size();
    }

    public void dibujar3(Graphics g){
            for (int posicion = 0; posicion < getSize3(); posicion++) {
             getBloques3(posicion).dibujar(g);
        }
    }

     public void crearEnemigos1(){

        Enemigo enemigo1=new Enemigo(3,205,320,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos1.add(enemigo1);
        Enemigo enemigo2=new Enemigo(1,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos1.add(enemigo2);
        Enemigo enemigo3=new Enemigo(2,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos1.add(enemigo3);
    }
     
    
    public Enemigo getEnemigos1(int posicion){
        return enemigos1.get(posicion);
    }
    
    public int getCantEnemigos1(){
        return enemigos1.size();
    }    
    
    public void dibujarEnemigos1(Graphics g){
            for (int posicion = 0; posicion < getCantEnemigos1(); posicion++) {
             getEnemigos1(posicion).show(g);
        }
    }
    
    public void crearEnemigos2(){

        Enemigo enemigo1=new Enemigo(3,205,320,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos2.add(enemigo1);
        Enemigo enemigo2=new Enemigo(1,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos2.add(enemigo2);
        Enemigo enemigo3=new Enemigo(2,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos2.add(enemigo3);
        Enemigo enemigo4=new Enemigo(0,850,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos2.add(enemigo4);
    }
     
    
    public Enemigo getEnemigos2(int posicion){
        return enemigos2.get(posicion);
    }
    
    public int getCantEnemigos2(){
        return enemigos2.size();
    }
    
    public void dibujarEnemigos2(Graphics g){
            for (int posicion = 0; posicion < getCantEnemigos2(); posicion++) {
             getEnemigos2(posicion).show(g);
        }
    }
    
    public void crearEnemigos3(){

        Enemigo enemigo1=new Enemigo(3,205,320,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos3.add(enemigo1);
        Enemigo enemigo2=new Enemigo(1,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos3.add(enemigo2);
        Enemigo enemigo3=new Enemigo(2,1000,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos3.add(enemigo3);
        Enemigo enemigo4=new Enemigo(0,850,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos3.add(enemigo4);
        Enemigo enemigo5=new Enemigo(0,150,300,new ImageIcon("./src/main/resources/img/ENEMIGO..gif"));
        enemigos3.add(enemigo5);
    }
     
    
    public Enemigo getEnemigos3(int posicion){
        return enemigos3.get(posicion);
    }
    public int getCantEnemigos3(){
        return enemigos3.size();
    }

    public void dibujarEnemigos3(Graphics g){
            for (int posicion = 0; posicion < getCantEnemigos3(); posicion++) {
             getEnemigos3(posicion).show(g);
        }
    }
        
    public void crearCerezas1(){
        Cereza cereza1 = new Cereza(200, 200, cerezaImg);
        cerezas1.add(cereza1);
        Cereza cereza2 = new Cereza(1100, 142, cerezaImg);
        cerezas1.add(cereza2);
        Cereza cereza3 = new Cereza(700, 500, cerezaImg);
        cerezas1.add(cereza3);

    }   

    public Cereza getCerezas1(int posicion){
        return cerezas1.get(posicion);
    }
    
    public int getSizeCerezas1(){
        return cerezas1.size();
    }
        
    public void recogerCereza1(Cereza cereza){
 
        cerezas1.remove(cereza);
    }
    
    public void dibujarCerezas1(Graphics g){
            for (int posicion = 0; posicion < getSizeCerezas1(); posicion++) {
             getCerezas1(posicion).dibujar(g);
        }
    }
    
     public void crearCerezas2(){
        Cereza cereza1 = new Cereza(200, 200, cerezaImg);
        cerezas2.add(cereza1);
        Cereza cereza2 = new Cereza(1100, 142, cerezaImg);
        cerezas2.add(cereza2);
        Cereza cereza3 = new Cereza(700, 500, cerezaImg);
        cerezas2.add(cereza3);
        Cereza cereza4 = new Cereza(723, 150, cerezaImg);
        cerezas2.add(cereza4);

    }   

    public Cereza getCerezas2(int posicion){
        return cerezas2.get(posicion);
    }
    
    public int getSizeCerezas2(){
        return cerezas2.size();
    }

    public void dibujarCerezas2(Graphics g){
            for (int posicion = 0; posicion < getSizeCerezas2(); posicion++) {
             getCerezas2(posicion).dibujar(g);
        }
    }
    
    public void recogerCereza2(Cereza cereza){
 
        cerezas2.remove(cereza);
    }
    

    
     public void crearCerezas3(){
        Cereza cereza1 = new Cereza(200, 200, cerezaImg);
        cerezas3.add(cereza1);
        Cereza cereza2 = new Cereza(1100, 142, cerezaImg);
        cerezas3.add(cereza2);
        Cereza cereza3 = new Cereza(700, 500, cerezaImg);
        cerezas3.add(cereza3);
        Cereza cereza4 = new Cereza(3723, 150, cerezaImg);
        cerezas3.add(cereza4);
        Cereza cereza5 = new Cereza(303, 570, cerezaImg);
        cerezas3.add(cereza5);
        Cereza cereza6 = new Cereza(1116, 514, cerezaImg);
        cerezas3.add(cereza6);

    }   

    public Cereza getCerezas3(int posicion){
        return cerezas3.get(posicion);
    }
    
    public int getSizeCerezas3(){
        return cerezas3.size();
    }
    public void dibujarCerezas3(Graphics g){
            for (int posicion = 0; posicion < getSizeCerezas3(); posicion++) {
             getCerezas3(posicion).dibujar(g);
        }
    }
    
   public void recogerCereza3(Cereza cereza){
 
        cerezas3.remove(cereza);
    }
      
  
    public boolean isGanador(){
       if(controladorJuego.isColision()==false && controladorJuego.getCantCerezas()==3){
            return true;
       }
       return false;
    } 
}
