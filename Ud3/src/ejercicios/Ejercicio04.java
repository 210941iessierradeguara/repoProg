package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	
	public static double area(double radio) {
		return (3.141592 * (Math.pow(radio, 2)));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca el radio del c�rculo: ");
		double r = s.nextDouble();
		System.out.printf("El �rea del c�rculo es: %.2f", area(r));
	}

}