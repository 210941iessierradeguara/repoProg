package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos n�meros, primero el mayor y despu�s el menor: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		if (x % y == 0) {
			System.out.println("Los n�meros son m�ltiplos. ");
		} else {
			System.out.println("Los n�meros no son m�ltiplos.");
		}

	}

}
