package ejercicio09;

import java.util.ArrayList;

public class PruebaListaMultimedia {
	
	public static int cuentaPrestados(ArrayList<Multimedia> l) {
		int preTotal = 0;
		for (Multimedia pre : l) {
			if (pre instanceof DiscoPrestable) {
				if (((DiscoPrestable) pre).prestado()) {
					preTotal++;
				}
			}
		}
		return preTotal;
	}
	
	
	public static void main(String[] args) {
		ListaMultimedia l = new ListaMultimedia();
		DiscoPrestable d1 = new DiscoPrestable("A", "Aautor", "Mp3", 3.6, "Clasic");
		DiscoPrestable d2 = new DiscoPrestable("B", "Bautor", "Mp3", 6.3, "Rock");
		DiscoPrestable d3 = new DiscoPrestable("C", "Cautor", "Mp3", 3.9, "Clasic3");
		l.anyadir(d1);
		l.anyadir(d2);
		l.anyadir(d3);
		
		d1.prestar(d1);
		d2.prestar(d2);
//		Pelicula p1 = new Pelicula("D", "Dautor", "mkv", 128, "Dactor", "Dactriz");
//		Pelicula p2 = new Pelicula("E", "Eautor", "mkv", 128, "Eactor", "Eactriz");
//		Pelicula p3 = new Pelicula("F", "Fautor", "mkv", 128, "Factor", null);
//		l.anyadir(p1);
//		l.anyadir(p2);
//		l.anyadir(p3);
		
		
		l.imprimirL();
//		System.out.println(cuentaPrestados(l));
		System.out.println("*************************************************************************************************");
		System.out.println(l.contarDura());
		System.out.println("*************************************************************************************************");
		System.out.println("Hay: " + l.contarRock() + " cancion/es de Rock");
//		System.out.println("*************************************************************************************************");
//		System.out.println("Hay: " + l.contarActrNo() + " Pelicula/s sin una actriz principal");
	}

}
