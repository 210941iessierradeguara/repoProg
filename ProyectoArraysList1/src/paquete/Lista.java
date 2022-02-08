package paquete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
	List<Persona> lista;

	public Lista() {
		lista = new ArrayList<Persona>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean vacia() {
//		return lista.size()==0;
		return lista.isEmpty();
	}

	public boolean insertar(Persona p) {
		return lista.add(p);
	}

	public Persona recuperar(int posicion) {
		if (posicion < 1 || posicion > lista.size()) {
			return null;
		} else {
			return lista.get(posicion - 1);
		}
	}

	public Persona borrarPersonaPosicion(int posicion) {
		if (posicion < 1 || posicion > lista.size()) {
			return null;
		} else {
			return lista.remove(posicion-1);
		}
	}

	public int buscarPorDNI(long num) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).dameNif().dameDni()==num);
			return i+1;
		}
		return -1;
	}
	
	public Persona BorrarPersonaPorDNI(long num) {
		int posicion = buscarPorDNI(num);
		if (posicion == -1) {return null;}
		
		else
			return borrarPersonaPosicion(posicion);
	}
	
//	public String buscarPorApellido(String apellido) {
//		String cadena="";
//		
//		for(int i = 0; i < lista.size(); i++) {
//			if(lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
//				cadena = cadena + lista.get(i);
//			}
//		}
//		
//		return cadena;
//	}
	
	public ArrayList<Persona> buscarPorApellido2(String apellido) {
		ArrayList<Persona> encontrados = new ArrayList<Persona>();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				encontrados.add(lista.get(i));
			}
		}
		return encontrados;
	}

	@Override
	public String toString() {
		String cadena = "";

//		for (int i = 0; i<lista.size(); i++) {
//			cadena = cadena + lista.get(i) + "\n";
//		}

//		for (Persona p: lista) {
//			cadena = cadena + p + "\n";
//		}

		Iterator it = lista.iterator();
		while (it.hasNext()) {
			cadena = cadena + it.next() + "\n";
		}

		return cadena;
	}

}
