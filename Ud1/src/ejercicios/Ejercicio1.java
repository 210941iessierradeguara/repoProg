package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1;
		int x2;
		System.out.print("Introduce 2 n�meros enteros: ");
		x1 = s.nextInt();
		x2 = s.nextInt();
		
		System.out.println("Sumando el 1� con el 2� da: " + (x1+x2));
		System.out.println("Restando el 1� con el 2� da: " + (x1-x2));
		System.out.println("El producto del 1� con el 2� da: " + (x1*x2));
		System.out.println("Dividir el 1� con el 2� da: " + (x1/x2));
		System.out.println("dividir el 1� con el 2� da de resto: " + (x1%x2));
		System.out.println("El postincremento del 1� n�mero es: "+ (++x1));
		System.out.println("El postdecremento del 1� n�mero es: "+ (--x1));
		System.out.println("El postincremento del 2� n�mero es: "+ (++x2));
		System.out.println("El postdecremento del 2� n�mero es: "+ (--x2));

	}

}
