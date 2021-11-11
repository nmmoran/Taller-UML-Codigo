
package taller5uml.usuarios;

import java.util.ArrayList;
import taller5uml.CitayMedicamento.Cita;
import taller5uml.CitayMedicamento.Receta;


public class Doctor extends Persona {
    protected int regDoctor;
    protected String especialidad;
    
    protected Secretaria secretaria;
    
    public ArrayList<Receta> recetas = new ArrayList<>();
    
    protected ArrayList<Cita> citasPendientes = new ArrayList<>();
    
    public void recetar(){
    }
    
    public void agregarPlanNut(){
    }
    
    public void imprimirReceta(){
    }
    
    public void registraSecretaria(){
    }
    
}
