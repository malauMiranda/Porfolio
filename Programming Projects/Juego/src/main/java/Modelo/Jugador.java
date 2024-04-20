
package Modelo;


public class Jugador {
    
    
private String nombre;
private String nivel;

public static final String[] ETIQUETAS_JUGADOR = {"NOMBRE", "NIVEL"};

public Jugador(String nombre, String nivel)
{
    this.nombre = nombre;
    this.nivel = nivel;
}

    Jugador() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


public String getDatos(int indice)
{
    switch (indice) {
        case 0:
            return nombre;
        case 1:
            return nivel;
    }
    return null;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nivel=" + nivel + '}';
    }


    
}
