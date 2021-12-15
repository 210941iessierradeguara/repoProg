package ejercicioColecciones2Pilas;

import java.util.ArrayList;

public class PilaPalabras {
	ArrayList<String> pila;

	public PilaPalabras() {
		pila = new ArrayList<String>();
	}
	
	public void apilarPalabra(String palabra) {
		pila.add(palabra);
	}
	
	public String desapilarPalabra() {
		return pila.remove(pila.size()-1);
	}
	
	public String obtenerPalabraCima() {
		return pila.get(pila.size()-1);
	}
	
	public boolean pilaPalabrasVacia() {
		return pila.isEmpty();
	}
	
	public String imprimir() {
		String cadena = "";
		for (int i = 0; i < pila.size(); i++) {
			cadena = cadena + pila.get(i) + "\n";
		}
		return cadena;
	}
}