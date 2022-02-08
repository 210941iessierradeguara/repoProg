package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int uno;
		int dos;
		int tres;
		
		System.out.print("Introduzca tres enteros: ");
		uno = s.nextInt();
		dos = s.nextInt();
		tres = s.nextInt();
		
		System.out.println((uno <= dos && dos <= tres));		
		
	}

}
