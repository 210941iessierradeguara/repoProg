package ejercicio04;

public class Socio {

	private int socioID;
	private String nombre;
	private int estatura;
	private int edad;
	private String localidad;
	
	public Socio(int socioID, String nombre, int estatura, int edad, String localidad) {
		this.socioID = socioID;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}
	public Socio() {

	}
	public int getSocioID() {
		return socioID;
	}
	public void setSocioID(int socioID) {
		this.socioID = socioID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return "Id:" + socioID + "| Nombre: " + nombre + "| Estatura: " + estatura + "| Edad: " + edad
				+ "| localidad: " + localidad;
	}
	
	
	
	
}
