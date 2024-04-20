
package Modelo;

public class Usuario {
    
    private String nombreUsuario;
    private String contraseña;
    
    public static final String[] ETIQUETAS_USUARIO={"NOMBRE","CONTRASEÑA"};

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    public String getDatos(int indice) {
        switch (indice) {
            case 0:
                return nombreUsuario;
            case 1:
                return contraseña;
        }
        return null;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
