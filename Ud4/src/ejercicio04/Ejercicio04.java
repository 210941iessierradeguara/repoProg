package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner s = new Scanner(System.in);
	static String frase = "Aquesta es la frase";
	
	public static void main(String[] args) {
		System.out.println(frase);
		System.out.println("Palabra a reemplazar en la frase: ");
		String Areemplazar = s.next();
		System.out.println("Palabra por la que remplazar: ");
		String reemplazo = s.next();
		
		String cambio = frase.replaceAll(Areemplazar, reemplazo);
		System.out.println(cambio);
	}

}
