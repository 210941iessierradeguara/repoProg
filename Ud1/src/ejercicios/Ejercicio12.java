package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int uno;
		int dos;
		
		System.out.print("Escribe dos números entero separados por un espacio: ");
		uno = s.nextInt();
		dos = s.nextInt();
		
		System.out.println((uno < dos));
	
		/*
		if(uno < dos) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
		*/

	}

}
