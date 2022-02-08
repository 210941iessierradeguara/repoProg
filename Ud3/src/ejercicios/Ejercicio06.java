package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static double cuadrado(int c) {
		double raiz = Math.sqrt(c);
		return raiz;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un entero al que buscar su cuadrado: ");
		int num = s.nextInt();
		
		if(num%cuadrado(num) == 0) {
			System.out.println("El número se puede expresar como potencia de: " + cuadrado((int)num));
		} else {
			System.out.print("El número introducido no es cuadrado de ninguno");
		}
	}

}
