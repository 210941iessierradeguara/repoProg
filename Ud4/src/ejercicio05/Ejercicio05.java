package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner s = new Scanner(System.in);
	
	public static int busqueda (String frase, String palabra) {
		int cantidad = 0;
		
		String palabras [] = frase.split(" ");
		for (String polobro : palabras) {
			if (polobro.equals(palabra)) {
				cantidad = cantidad + 1;
			}
		}
		
		return cantidad;
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce la frase:");
		String frase = s.nextLine();
		System.out.println("Introduce la palabra: ");
		String palabra = s.nextLine();
		System.out.println("la palabra: " + palabra + " Se ha encontrado: " +  busqueda(frase, palabra) + " veces");
	}

}
