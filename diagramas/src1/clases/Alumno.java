package clases;

public class Alumno extends Persona{
	String expediente;
	private String atribPrivado;
	public String atriPublic;
	protected String atriProtected;
	
	protected void metodoProtected() {}
	
	public String getAtribPrivado() {
		return atribPrivado;
	}

	public void setAtribPrivado(String atribPrivado) {
		this.atribPrivado = atribPrivado;
	}

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
