package ejercicio07;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia l = new ListaMultimedia();
		Disco d1 = new Disco("A", "Aautor", "Mp3", 3.6, "Clasic");
		Disco d2 = new Disco("B", "Bautor", "Mp3", 6.3, "Rock");
		Disco d3 = new Disco("C", "Cautor", "Mp3", 3.9, "Clasic3");
		l.anyadir(d1);
		l.anyadir(d2);
		l.anyadir(d3);
		
		Pelicula p1 = new Pelicula("D", "Dautor", "mkv", 128, "Dactor", "Dactriz");
		Pelicula p2 = new Pelicula("E", "Eautor", "mkv", 128, "Eactor", "Eactriz");
		Pelicula p3 = new Pelicula("F", "Fautor", "mkv", 128, "Factor", null);
		l.anyadir(p1);
		l.anyadir(p2);
		l.anyadir(p3);
		
		l.imprimirL();
		System.out.println("*************************************************************************************************");
		System.out.println(l.contarDura());
		System.out.println("*************************************************************************************************");
		System.out.println("Hay: " + l.contarRock() + " cancion/es de Rock");
		System.out.println("*************************************************************************************************");
		System.out.println("Hay: " + l.contarActrNo() + " Pelicula/s sin una actriz principal");
	}

}
