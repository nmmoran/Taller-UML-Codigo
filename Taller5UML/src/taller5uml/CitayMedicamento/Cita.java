
package taller5uml.CitayMedicamento;

import java.util.Date;
import taller5uml.usuarios.Doctor;
import taller5uml.usuarios.Paciente;
import taller5uml.util.Pago;


public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    
    protected Paciente paciente;
    
    protected Doctor doctorDeCita;
    
    public void realizarPago(Pago pago){
    }
    
    
    
}
