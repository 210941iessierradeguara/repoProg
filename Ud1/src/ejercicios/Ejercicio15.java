package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char x1 = (char) s.nextLine().charAt(0);
		System.out.println("El codigo ASCII de " + x1 + " es " + (int)(x1));
		System.out.print("Los tres siguientes caracteres son: ");
		System.out.print((char)(x1+1) + " - ");
		System.out.print((char)(x1+2) + " - ");
		System.out.print((char)(x1+3));

	}

}
