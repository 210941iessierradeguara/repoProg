package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double var1;
		double var2;
		double aux;
		
		System.out.print("Escriba la variable 1: ");
		var1 = s.nextDouble();
		
		System.out.print("Escriba la variable 2: ");
		var2 = s.nextDouble();
		
		aux = var1;
		var1 = var2;
		var2 = aux;
		
		System.out.printf("La variable 1 es: %.2f La variable 2 es: %.2f", var1, var2);

	}

}
