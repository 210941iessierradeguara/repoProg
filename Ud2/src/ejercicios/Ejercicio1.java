package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int entero;
		
		System.out.print("Escriba un entero: ");
		entero = s.nextInt();
		
		if(entero % 2 == 0) {
			System.out.print("El numero es par");
		} else {
			System.out.print("El numero es impar");
		}

	}

}
