
package taller5uml.usuarios;

import java.util.Date;


public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;        
    protected String cedula;        
    protected String direccion;        
    protected Date fechaNac;
    
    protected Administrador registradoPor;
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return true;
    }
            
}
