package examen;

import java.util.Scanner;

public class DanielMartinez1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, div, cont = 0;
		System.out.println("Introduzca el n�mero a comprobar: ");
		num = s.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				div = i;
				cont = cont + div;
			}
		}

		if (num == cont) {
			System.out.println("El n�mero " + num + " es perfecto.");
		} else {
			System.out.println("El n�mero " + num + " no es perfecto.");
		}
	}

}