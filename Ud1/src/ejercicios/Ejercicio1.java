package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1;
		int x2;
		System.out.print("Introduce 2 números enteros: ");
		x1 = s.nextInt();
		x2 = s.nextInt();
		
		System.out.println("Sumando el 1º con el 2º da: " + (x1+x2));
		System.out.println("Restando el 1º con el 2º da: " + (x1-x2));
		System.out.println("El producto del 1º con el 2º da: " + (x1*x2));
		System.out.println("Dividir el 1º con el 2º da: " + (x1/x2));
		System.out.println("dividir el 1º con el 2º da de resto: " + (x1%x2));
		System.out.println("El postincremento del 1º número es: "+ (++x1));
		System.out.println("El postdecremento del 1º número es: "+ (--x1));
		System.out.println("El postincremento del 2º número es: "+ (++x2));
		System.out.println("El postdecremento del 2º número es: "+ (--x2));

	}

}
