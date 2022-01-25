package ejercicio07;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> ListaMultimedia;

	public ListaMultimedia() {
		ListaMultimedia = new ArrayList<Multimedia>();
	}

	public boolean anyadir(Multimedia m) {
		if (ListaMultimedia.contains(m)) {
			return false;
		} else {
			ListaMultimedia.add(m);
			return true;
		}
	}

	public void imprimirL() {
		String tempStr1 = "";

		for (Multimedia tmp : ListaMultimedia) {
			System.out.println(tmp.toString());
			if (tmp instanceof Disco) {
				tempStr1 = "Disco";
			} else {
				tempStr1 = "Pelicula";
			}
			System.out.println("Tipo de multimedia: " + tempStr1);
		}
	}

	public double contarDura() {
		double durTotal = 0;
		for (Multimedia tmp : ListaMultimedia) {
			durTotal = durTotal + tmp.getDuracion();
		}
		return durTotal;
	}

	public int contarRock() {
		int r = 0;

		for (Multimedia tmp : ListaMultimedia) {
			if (tmp instanceof Disco) {
				if (((Disco) tmp).getGenero().equals("Rock")) {
					r++;
				}
			}
		}
		return r;
	}

	public int contarActrNo() {
		int a = 0;
		for (Multimedia tmp : ListaMultimedia) {
			if (tmp instanceof Pelicula) {
				if (((Pelicula) tmp).getActrizPrincipal() == null) {
					a++;
				}
			}
		}

		return a;
	}

	@Override
	public String toString() {
		return "ListaMultimedia [ListaMultimedia=" + ListaMultimedia + "]";
	}
}
