package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void multiplo(int x, int y) {
		if (x % y == 0) {
			System.out.println("Los n�meros son m�ltiplos. ");
		} else {
			System.out.println("Los n�meros no son m�ltiplos.");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos n�meros enteros, primero el mayor y luego el menor: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		multiplo(a, b);
	}

}
