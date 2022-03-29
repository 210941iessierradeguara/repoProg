package pregunta2;

import java.util.ArrayList;
import java.util.List;
import clases.Persona;

public class ListaPer {
	List<Persona> listPer = new ArrayList<Persona>();
	public ListaPer() {}
	
	public void add(Persona per){
		listPer.add(per);
	}
	public List<Persona> getListaPersonas() {
		return listPer;
	}
}
