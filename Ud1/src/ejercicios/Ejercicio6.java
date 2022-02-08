package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final double equivalente = 1.1774;
		double cantidad;
		double conversion;
		
		System.out.print("Introduce la cantidad de € a convertir: ");
		cantidad = s.nextDouble();
		
		conversion = (cantidad * equivalente);
		
		System.out.printf("La conversión a $ es de: %.2f" + " $", conversion);

	}

}
