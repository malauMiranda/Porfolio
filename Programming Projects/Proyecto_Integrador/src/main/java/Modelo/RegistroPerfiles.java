
package Modelo;

import java.util.ArrayList;


public class RegistroPerfiles {
      private ArrayList<Perfil> listaPerfiles;

public RegistroPerfiles()
{
    listaPerfiles= new ArrayList<Perfil>();
}

public String[][] getDatosTabla(){
    String [][] datos= new String[listaPerfiles.size()][Perfil.ETIQUETAS_PERFIL.length];
    for(int indice=0;indice<listaPerfiles.size();indice++){
        for(int atributo=0;atributo<datos[indice].length;atributo++){
            datos[indice][atributo]=listaPerfiles.get(indice).getDatos(atributo);       
        }
    }
   return datos; 
}



public String agregar(Perfil perfil)
{
    
    if (listaPerfiles.contains(perfil)) {
        return "El perfil ya se encuentra registrado";
    } else {
        if (listaPerfiles.add(perfil)) {
            return "El perfil se registró correctamente";
        } else {
            return "Error al registrar el perfil";
        }
    }
}


public Perfil buscar(String codigoPerfil)
{
    for (int indice = 0; indice < listaPerfiles.size(); indice++) {
        if (listaPerfiles.get(indice).getCodigoPerfil().equalsIgnoreCase(codigoPerfil)) {
            return  listaPerfiles.get(indice);
        }
    }
    return null;
}


public String eliminar(String codigoPerfil){
    Perfil perfil=  buscar(codigoPerfil);
    if (listaPerfiles.remove(perfil)){
        return "El perfil fue eliminado exitosamente";
    }
return "Error al eliminar el perfil";
}

public String eliminar (Perfil perfil){
    if(listaPerfiles.remove(perfil)){
        return "El perfil fue eliminado exitosamente";
    }    
return "Error al eliminar el perfil";
}

public String toString()
{
    String salida = "Lista de perfiles\n";
    for (Perfil perfil : listaPerfiles) {
        salida += perfil + "\n";
    }
    return salida;
}
    
}
