package treesetPersonaPrueba;

import java.util.Comparator;

public class ApellidosComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		int resta = o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos());
		if (resta <= 0) {
			return -1;
		} else {
			return 1;
		}
	}
	// apellidos iguales devuelve 0 y los descarta
	// return o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos());
}
