package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba un n�mero enteros: ");
		int x, max = 0, cont = 0, suma = 0;
		x = s.nextInt();
		int min = x;

		if (x < 0) {
			System.out.println("Los n�meros han de ser mayores o iguales a 0");
			System.out.println("Terminando el programa");
			System.exit(-1);
		} else {

			while (x >= 0) {
				if (min > x) {
					min = x;
				}
				if (max < x) {
					max = x;
				}
				cont++;
				suma = suma + x;
				System.out.print("Introduzca el siguiente n�mero: ");
				x = s.nextInt();
			}

		}
		System.out.println("El minimo de los n�meros es: " + min + " El mayor de los n�meros es: " + max + " La media de los n�meros es: " + (max/min));
	}

}
