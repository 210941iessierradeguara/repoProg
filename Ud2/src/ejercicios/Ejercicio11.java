package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean banderin = true;
		int contador = 0, contadorMay = 0, contadorMin = 0;

		do {
			System.out.print("Introduzca un caracter, para finalizar use *: ");
			char caracter = (char) s.nextLine().charAt(0);
			if (Character.isAlphabetic(caracter)) {
				contador++;
				if (Character.isUpperCase(caracter)) {
					contadorMay++;
				} else {
					contadorMin++;
				} // fin el Min-May
			} else {
				if (caracter == ' ') {
					System.out.println("Espacio no es un caracter válido");
				} // end space check
				if (caracter == '*') { // char con comillas simples
					banderin = false;
				} else {
					System.out.println("Ha introducido un caracter no alfabetico que no es *");
				}
			} // end of else on if alphabetic
		} while (banderin); // End of do while

		System.out.println("Ha introducido: " + contador + " caracteres totales, con: " + contadorMin + " minúsculas y "
				+ contadorMay + " mayúsculas");

	}

}
