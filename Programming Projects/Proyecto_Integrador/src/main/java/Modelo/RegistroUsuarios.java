
package Modelo;

import java.util.ArrayList;

public class RegistroUsuarios {
    private ArrayList<Usuario> listaUsuarios;

public RegistroUsuarios()
{
    listaUsuarios = new ArrayList<Usuario>();
}

public String[][] getDatosTabla(){
    String [][] datos= new String[listaUsuarios.size()][Usuario.ETIQUETAS_USUARIO.length];
    for(int indice=0;indice<listaUsuarios.size();indice++){
        for(int atributo=0;atributo<datos[indice].length;atributo++){
            datos[indice][atributo]=listaUsuarios.get(indice).getDatos(atributo);       
        }
    }
   return datos; 
}



public String agregar(Usuario usuario)
{
    
    if (listaUsuarios.contains(usuario)) {
        return "El usuario ya se encuentra registrado";
    } else {
        if (listaUsuarios.add(usuario)) {
            return "El usuario se registró correctamente";
        } else {
            return "Error al registrar el usuario";
        }
    }
}


public Usuario buscar(String nombreUsuario)
{
    for (int indice = 0; indice < listaUsuarios.size(); indice++) {
        if (listaUsuarios.get(indice).getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
            return  listaUsuarios.get(indice);
        }
    }
    return null;
}


public String eliminar(String nombreUsuario){
    Usuario usuario=  buscar(nombreUsuario);
    if (listaUsuarios.remove(usuario)){
        return "El usuario fue eliminado exitosamente";
    }else{
return "Error al eliminar el usuario";}
}

public String eliminar (Usuario usuario){
    if(listaUsuarios.remove(usuario)){
        return "El usuario fue eliminado exitosamente";
    } else{   
return "Error al eliminar el usuario";}
}

public String toString()
{
    String salida = "Lista de usuarios\n";
    for (Usuario usuario : listaUsuarios) {
        salida += usuario + "\n";
    }
    return salida;
}
    
}
