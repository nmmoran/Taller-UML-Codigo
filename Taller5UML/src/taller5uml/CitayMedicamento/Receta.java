
package taller5uml.CitayMedicamento;

import java.util.ArrayList;
import java.util.Date;
import taller5uml.usuarios.Doctor;


public class Receta {
    protected Date fecha;
    
    protected ArrayList<PlanNutricional> planesNutricionales;
    
    protected ArrayList<Medicamento> medicamentos;
    
    protected Doctor recetaPor;
    
    public Receta(){
        planesNutricionales = new ArrayList<>();
        medicamentos = new ArrayList<>();
    }
    
}
