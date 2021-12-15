package ejercicioColecciones03_04;

import _01objetos.Persona;
import _02colecciones1.Fecha;
import libros.Libros;

public class MainLibro {

	public static void main(String[] args) {
		Persona p = new Persona(12345678, 20, "Jose", "Josa");
		Persona p2 = new Persona(23456789, 56, "Pepito", "Pepitu");
		Fecha f = new Fecha(1, 5, 2016);
		Fecha f2 = new Fecha(25, 9, 2010);
		Libro l1 = new Libro("Abcd", p, 12345678, 500, 3, "Pinguboys", "Aquí", "Allá", f);
		Libro l2 = new Libro("Efgh", p2, 23456789, 398, 6, "Pinguboys", "Más", "Menos", f2);
		Libro l3 = new Libro();
		
		System.out.println(l1);
		
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("");
		
		l2.mostrarInfo(l2);
		
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("");
		
		System.out.println(l3.toStringVacio());
	}
}
