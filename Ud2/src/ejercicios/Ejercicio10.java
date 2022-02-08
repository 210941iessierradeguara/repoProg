package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba un número enteros: ");
		int x, max = 0, cont = 0, suma = 0;
		x = s.nextInt();
		int min = x;

		if (x < 0) {
			System.out.println("Los números han de ser mayores o iguales a 0");
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
				System.out.print("Introduzca el siguiente número: ");
				x = s.nextInt();
			}

		}
		System.out.println("El minimo de los números es: " + min + " El mayor de los números es: " + max + " La media de los números es: " + (max/min));
	}

}
