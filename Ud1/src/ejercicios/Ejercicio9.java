package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double farenheit;
		double celsius;
		
		System.out.print("¿Cuantos grados farenheit hace?: ");
		farenheit = s.nextDouble();
		
		celsius = ((farenheit - 32) / 1.8);
		
		System.out.printf("La temperatura en celsius es de: %.2f", celsius);

	}

}
