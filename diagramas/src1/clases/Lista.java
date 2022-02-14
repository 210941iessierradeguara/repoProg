package clases;

import java.util.ArrayList;

public class Lista {
	ArrayList <Persona> lista;
	String Grupo;
	
	public Lista(ArrayList<Persona> lista, String grupo) {
		
		this.lista = lista;
		Grupo = grupo;
	}
	
	public Lista(String grupo) {
		lista  = new ArrayList<Persona>();
		Grupo = grupo;
	}

	public ArrayList<Persona> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Persona> lista) {
		this.lista = lista;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	
	
	
}
