
package Modelo;

import Controlador.ControladorJuego;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class RegistroJugadores {

    private ArrayList<Jugador>listaJugadores;
    private File archivo;
    private JSONObject baseJSONJugadores;
     private ControladorJuego controladorJuego;
    
    public RegistroJugadores(ControladorJuego controladorJuego) {
      listaJugadores = new ArrayList<Jugador>();
    archivo = new File("jugadores.json");
    leerJSON();
    }
    
public void escribirJSON() {
        JSONArray arregloJugadores = new JSONArray();
        baseJSONJugadores = new JSONObject();
        for (Jugador jugador : listaJugadores) {
            JSONObject objJSONJugador = new JSONObject();
            objJSONJugador.put("nombre", jugador.getNombre());
            objJSONJugador.put("nivel", jugador.getNivel());

            arregloJugadores.add(objJSONJugador);
        }
        baseJSONJugadores.put("listaJugadores", arregloJugadores);

        try {
            FileWriter archivoEscribe = new FileWriter(archivo);
            archivoEscribe.write(baseJSONJugadores.toJSONString());
            archivoEscribe.flush();
            archivoEscribe.close();
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

public void leerJSON() { 
        listaJugadores = new ArrayList<>(); 
        JSONParser convierte = new JSONParser(); 
        try { 
            FileReader archivoLee = new FileReader(archivo); 
            Object obj = convierte.parse(archivoLee); 
            baseJSONJugadores = (JSONObject) obj; 
 
            JSONArray arregloJSON = (JSONArray) baseJSONJugadores.get("listaJugadores"); 
            for (Object object : arregloJSON) { 
                JSONObject objJugador = (JSONObject) object; 
                Jugador jugador = new Jugador(); 
                jugador.setNombre(objJugador.get("nombre").toString()); 
                jugador.setNivel(objJugador.get("nivel").toString()); 
                listaJugadores.add(jugador); 
            } 
 
        } catch (FileNotFoundException ex) { 
            System.err.println("Error al leer"); 
        } catch (IOException ex) { 
            System.err.println("Error al leer"); 
        }catch (org.json.simple.parser.ParseException ex) { 
            ex.printStackTrace(); 
        } 
    }
    
    
    
public String[][] getDatosTabla(){
    String [][] datos= new String[listaJugadores.size()][Jugador.ETIQUETAS_JUGADOR.length];
    for(int indice=0;indice<listaJugadores.size();indice++){
        for(int atributo=0;atributo<datos[indice].length;atributo++){
            datos[indice][atributo]=listaJugadores.get(indice).getDatos(atributo);       
        }
    }
   return datos; 
}



public String agregar(Jugador jugador)
{
    
//    if (listaJugadores.contains(jugador)) {
//        return "El jugador ya estaba registrado";
//    } else {
        if (listaJugadores.add(jugador)) {
            escribirJSON();
            return "El jugador se registró correctamente";
        } else {
            return "Error al registrar jugador";
        }
    //}
}


/*public String agregar(Object objeto)
{
    if (objeto != null) {
        Estudio estudio = (Estudio) objeto;
        if (buscar(estudio.getId()) == null) {
            if (listaEstudios.add(estudio)) {
                return "El estudio ha sido registrado";
            }
        } else {
            return "El estudio ya ha sido registrado";
        }

    }

    return "Error al ingresar el estudio";
}
 */

public void editarNivel(){
    for (int indice = 0; indice < listaJugadores.size(); indice++) {    
    if(listaJugadores.contains(listaJugadores.get(indice)) && controladorJuego.getNivel()==2){
       listaJugadores.get(indice).setNivel("2");
    }
    }
}
public Jugador buscar(String nombre)
{
    for (int indice = 0; indice < listaJugadores.size(); indice++) {
        if (listaJugadores.get(indice).getNombre().equalsIgnoreCase(nombre)) {
            return  listaJugadores.get(indice);
        }
    }
    return null;
}


public String eliminar(String nombre){
    Jugador jugador=  buscar(nombre);
    if (listaJugadores.remove(nombre)){
        escribirJSON();
        return "El jugador fue eliminado exitosamente";
    }
return null;
}

public String eliminar (Jugador jugador){
    if(listaJugadores.remove(jugador)){
        escribirJSON();
        return "El jugador fue eliminado exitosamente";
    }    
return null;
}

public String toString()
{
    String salida = "Lista de jugadores\n";
    //for(int indice=0;indice<listaEstudios.size();indice++){
    for (Jugador jugador : listaJugadores) {
        //salida+=listaEstudios.get(indice)+"\n";
        salida += jugador + "\n";
    }
    return salida;
}


    
}
