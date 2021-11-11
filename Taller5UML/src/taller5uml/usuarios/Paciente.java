
package taller5uml.usuarios;

import java.util.ArrayList;
import taller5uml.CitayMedicamento.Cita;
import taller5uml.CitayMedicamento.HistoriaClinica;
import taller5uml.CitayMedicamento.Receta;


public class Paciente extends Persona {
    protected String email;
    
    protected ArrayList<Cita> citas = new ArrayList<>();
    
    protected ArrayList<HistoriaClinica> historialesClinicos;
    
    protected ArrayList<Receta> recetas;
    
    public Paciente(){
        historialesClinicos = new ArrayList<>();
        recetas = new ArrayList<>();
    }
    
    public boolean solicitarCita(){
        return true;
    }
}
