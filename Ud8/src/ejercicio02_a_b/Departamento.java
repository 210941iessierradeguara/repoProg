package ejercicio02_a_b;

import java.io.Serializable;

public class Departamento implements Serializable{
	private int numdepartamento;
	private String nombre;
	private String localidad;
	
	public Departamento(int numdepartamento, String nombre, String localidad) {
		super();
		this.numdepartamento = numdepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getNumdepartamento() {
		return numdepartamento;
	}

	public void setNumdepartamento(int numdepartamento) {
		this.numdepartamento = numdepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Departamento [numdepartamento=" + numdepartamento + ", nombre=" + nombre + ", localidad=" + localidad
				+ "]";
	}
	
}
