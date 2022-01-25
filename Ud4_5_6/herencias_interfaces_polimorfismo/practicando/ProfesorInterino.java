package practicando;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

    private Calendar fechaComienzoInterinidad;


    public ProfesorInterino (Calendar fechaInicioInterinidad) {
        super();     
        fechaComienzoInterinidad = fechaInicioInterinidad; 
    }

    public ProfesorInterino (String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad) {
        super(nombre, apellidos, edad, id);
        fechaComienzoInterinidad = fechaInicioInterinidad; 
       }

    public Calendar getFechaComienzoInterinidad () { 
    	return fechaComienzoInterinidad; 
    }

    public void setFechaComienzoInterinidad(Calendar fechaComienzoInterinidad) {
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

    public void mostrarDatos() {
    	super.mostrarDatos();
    	System.out.println("Fecha de comienzo: " + fechaComienzoInterinidad);
		
	}
    
	public String toString () { 

  return super.toString().concat (" Fecha comienzo interinidad: ").concat (fechaComienzoInterinidad.getTime().toString()); 
  }

    public float importeNomina () { 
    	return 30f * 35.60f ; 
    } 

} 