package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("introduzca 3 n�meros: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = s.nextDouble();
		
		if (x > y &&  x > z) {
			System.out.println("El n�mero " + x + " es el m�s grande");
			System.exit(0);
		}
		
		if (y > x && y > z) {
			System.out.println("El n�mero " + y + " es el m�s grande");
			System.exit(0);
		}
		
		if (z > x && z > y) {
			System.out.println("El n�mero " + z + " es el m�s grande");
			System.exit(0);
		}

	}

}
