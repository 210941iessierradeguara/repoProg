package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca el número límite: ");
		int numlim = s.nextInt();
		int cont = 1;
		int num = 3;

		if (numlim >= 1) {
			System.out.println("Los primeros " + numlim + " números primos son: ");
			System.out.println("2");
		}

		for (int i = 2; i <= numlim;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					cont = 0;
					break;
				}
			}
			if (cont != 0) {
				System.out.println(num);
				i++;
			}
			cont = 1;
			num++;
		}

	}

}

// https://beginnersbook.com/2014/01/java-program-to-display-first-n-or-first-100-prime-numbers/
