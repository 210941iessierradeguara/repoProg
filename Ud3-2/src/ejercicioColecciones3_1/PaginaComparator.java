package ejercicioColecciones3_1;

import java.util.Comparator;

public class PaginaComparator implements Comparator {
	public int compare(Object l1, Object l2) {

		Libro li1 = (Libro) l1;
		Libro li2 = (Libro) l2;
		return li1.damePaginas() - li2.damePaginas();
	}

	public boolean equals(Object o) {
		return this == o;
	}
}
