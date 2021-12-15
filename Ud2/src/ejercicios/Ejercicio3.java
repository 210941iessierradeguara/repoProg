package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos números, primero el mayor y después el menor: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		if (x % y == 0) {
			System.out.println("Los números son múltiplos. ");
		} else {
			System.out.println("Los números no son múltiplos.");
		}

	}

}
