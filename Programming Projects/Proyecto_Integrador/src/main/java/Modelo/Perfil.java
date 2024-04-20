
package Modelo;


public class Perfil {
    private String codigoPerfil;
    private String tipoUsuario;
    private String descripcionPerfil;
    
    public static final String[] ETIQUETAS_PERFIL={"CODIGO","TIPO DE USUARIO","DESCRIPCIÓN"};

    public Perfil(String codigoPerfil, String tipoUsuario, String descripcionPerfil) {
        this.codigoPerfil = codigoPerfil;
        this.tipoUsuario = tipoUsuario;
        this.descripcionPerfil = descripcionPerfil;
    }
    
    public String getDatos(int indice) {
        switch (indice) {
            case 0:
                return codigoPerfil;
            case 1:
                return tipoUsuario;
                
             case 2:
                return descripcionPerfil;
        }
        return null;
    }


    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }

    @Override
    public String toString() {
        return "Perfil{" + "codigoPerfil=" + codigoPerfil + ", tipoUsuario=" + tipoUsuario + ", descripcionPerfil=" + descripcionPerfil + '}';
    }
    
    
    
}
