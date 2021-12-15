package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca el número entero del que quiera un factorial: ");
		int num = s.nextInt();
		
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *=i;
		}
		
		System.out.println("El factorial de su número es: " + factorial);

	}

}
