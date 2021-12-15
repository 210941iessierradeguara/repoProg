package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 0;
		int suma;
		int num;
		
		System.out.print("Introduzca el número positivo a descomponer: ");
		num = s.nextInt();

		if (num < 0) {
			System.out.println("Ha de introducir un número positivo.");
			System.exit(-1);
		}
		
		while (num >= 10) {
			cont = (num % 10) + cont;
			num = num / 10;
		}
		
		
		suma = num+cont;
		
		System.out.printf("La suma de los caracteres del número es: %d \n", suma);

	}

}

/*
 * if (Character.isAlphabetic((char)num)) {
 * System.out.println("Ha de introducir un número."); System.exit(-1); }
 */