package ejercicio08;

import java.util.ArrayList;

import ejercicio07.Multimedia;

public class MainBiblioteca {
	
	public static int cuentaPrestados(ArrayList<Comun> l) {
		int preTotal = 0;
		for (Comun pre : l) {
			if (pre instanceof Libro) {
				if (((Libro) pre).prestado()) {
					preTotal++;
				}
			}
		}
		return preTotal;
	}
	
	public static int publicacionesAnterioresA(ArrayList<Comun> l, int anyo) {
		int num = 0;
		for (Comun com : l) {
			if (com.getAnyoPub() < anyo) {
				num++;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		ArrayList <Comun> ListBibli = new ArrayList<Comun>();
		Libro l1 = new Libro(001, "A", 1668, false);
		Libro l2 = new Libro(002, "B", 2001, false);
		Revista r1 = new Revista(001, "C", 1980, 15);
		Revista r2 = new Revista(002, "D", 1970, 60);
		l1.prestar(l1);

		ListBibli.add(l1);
		ListBibli.add(l2);
		ListBibli.add(r1);
		ListBibli.add(r2);
		
		System.out.println(ListBibli);
		System.out.println(cuentaPrestados(ListBibli));
		System.out.println(publicacionesAnterioresA(ListBibli, 1980));
	}

}
