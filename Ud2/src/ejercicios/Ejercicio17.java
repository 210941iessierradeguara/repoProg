package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 0;
		System.out.println("Vaya introduciendo números uno a uno seguidos de intro");
		System.out.println("Para terminar introduzca el valor 0");
		int x = s.nextInt();
		int comparador = x;
		int numeromin = 0;

		while (x != 0) {
			numeromin++;
			if (comparador > x) {
				cont++;
			}
			comparador = x;
			System.out.println("Introduzca el siguiente número.");
			x = s.nextInt();
		}

		if (numeromin < 2 || numeromin == 0) {
			System.out.println("No ha introducido números suficientes");
		} else {
			if (cont > 0) {
				System.out.println("Has introducido una secuencia de números decrecientes");
			} else {
				System.out.println("Ha introducido uan secuencia de números crecientes");
			}
		}

	}

}
