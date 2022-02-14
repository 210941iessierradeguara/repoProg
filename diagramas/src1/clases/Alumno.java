package clases;

public class Alumno extends Persona{
	String expediente;

	public Alumno(String nombre, String expediente) {
		super(nombre);
		this.expediente = expediente;
	}

	public Alumno(String expediente) {
		super();
		this.expediente = expediente;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	
}
