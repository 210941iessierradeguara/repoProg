package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 0;
		int suma;
		int num;
		
		System.out.print("Introduzca el n�mero positivo a descomponer: ");
		num = s.nextInt();

		if (num < 0) {
			System.out.println("Ha de introducir un n�mero positivo.");
			System.exit(-1);
		}
		
		while (num >= 10) {
			cont = (num % 10) + cont;
			num = num / 10;
		}
		
		
		suma = num+cont;
		
		System.out.printf("La suma de los caracteres del n�mero es: %d \n", suma);

	}

}

/*
 * if (Character.isAlphabetic((char)num)) {
 * System.out.println("Ha de introducir un n�mero."); System.exit(-1); }
 */