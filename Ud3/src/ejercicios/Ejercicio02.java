package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void multiplo(int x, int y) {
		if (x % y == 0) {
			System.out.println("Los números son múltiplos. ");
		} else {
			System.out.println("Los números no son múltiplos.");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos números enteros, primero el mayor y luego el menor: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		multiplo(a, b);
	}

}
