package defecto;

import java.util.HashSet;
import java.util.Objects;

public class Lista {
	private HashSet<Persona> lista;

	public Lista() {
		lista = new HashSet<Persona>();
	}
	
	public int tamanyo() {
		return lista.size();
	}
	
	public boolean vacia() {
		return lista.isEmpty();
	}
	
	
	public boolean insertar(Persona p) {
		return lista.add(p);
	}
	
	public Persona buscarPorDni(long num) {
		for (Persona p : lista) {
			if (p.dameNif().dameDni() == num) {
				return p;
			}
		}
		return null;
	}
	
	public boolean borrarPersonaPorDni(long num) {
		for (Persona p : lista) {
			if (p.dameNif().dameDni() == num) {
				return lista.remove(p);
			}
		}
		return false;
	}
	
	public String buscarPorApellido(String apellido) {
		String cadena = "";
		for (Persona p : lista) {
			if(p.dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
				cadena = cadena + p;
			}
		}
		return cadena;
	}
	
	public HashSet<Persona> buscarPorApellido2(String apellido) {
		HashSet<Persona> encontrados = new HashSet<Persona>();
		for(Persona p : lista) {
			if(p.dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
				encontrados.add(p);
			}
		}
		return encontrados;
	}
	
	public String toString() {
		String cadena ="";
		for (Persona p : lista) {
			cadena = cadena+p+"\n";
		}
		return cadena;
	}
}
