package ejercicio07;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList <Multimedia> ListaMultimedia;

	public ListaMultimedia() {
		ListaMultimedia = new ArrayList<Multimedia>();
	}
	
	public boolean anyadir (Multimedia m) {
		if (ListaMultimedia.contains(m)) {
			return false;
		} else {
			ListaMultimedia.add(m);
			return true;
		}
	}
}
