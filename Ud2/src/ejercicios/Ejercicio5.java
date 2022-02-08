package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un caracter: ");
		char caracter = (char) s.nextLine().charAt(0);

		if ((caracter >= 48 && caracter <= 57) || (caracter >= 65 && caracter <= 90)
				|| (caracter >= 97 && caracter <= 122)) {
			System.out.println("Es un caracter alfanumerico");

			if (Character.isLetter(caracter)) {
				System.out.println("El valor es una letra.");
				if (Character.isUpperCase(caracter)) {
					System.out.println("Es una mayuscula.");
				} else {
					System.out.println("Es una minuscula.");
				}
			} else {
				System.out.println("El valor es un número.");
			}
		} else {
			System.out.println("El caracter no es alfanumerico.");
		}

	}

}
