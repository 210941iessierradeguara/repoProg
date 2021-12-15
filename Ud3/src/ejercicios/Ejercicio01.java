package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void parImp(int n) {
		if(n % 2 == 0) {
			System.out.print("El numero es par");
			System.exit(0);
		}
			System.out.print("El numero es impar");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int num = s.nextInt();
		parImp(num);
	}

}