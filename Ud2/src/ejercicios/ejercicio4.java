package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int x = s.nextInt();
		double raiz;
		
		raiz = Math.sqrt(x);
		
		
		if (x%raiz == 0) {
			System.out.println("Se puede expresar como cuadrado de un entero.");
			System.out.println("El cuadrado de: " + (int)raiz);
		} else {
			System.out.print("No se puede expresar como cuadrado de un entero.");
		}	
		
		
		
		/*
		 * La raiz cuadrada de 9 es 3
		 * y el resto de 9 entre 3 es 0
		 * -------------------------------
		 * Raiz cuadrada entera 9-->3
		 * elevas 3 al cuadrado y se compara con 9.
		 * 
		 * */

	}

}
