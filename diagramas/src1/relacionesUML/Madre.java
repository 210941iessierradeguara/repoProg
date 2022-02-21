package relacionesUML;

import java.util.List;

public class Madre {
	private String nombre;
	private List<Hijo> hijos;
	
	public Madre(String nombre, List<Hijo> hijos) {
		super();
		this.nombre = nombre;
		this.hijos = hijos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Hijo> getHijos() {
		return hijos;
	}
	public void setHijos(List<Hijo> hijos) {
		this.hijos = hijos;
	}
}
