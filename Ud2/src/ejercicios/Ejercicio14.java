package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int num = s.nextInt();
		int cont = 0;
		
		for(int i = 1; i<= num; i++) {
			if ((num % i) == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println("El n�mero " + num + " es primo.");
		} else {
			System.out.println("El n�mero " + num + " no es primo.");
		}
		
	}

}
