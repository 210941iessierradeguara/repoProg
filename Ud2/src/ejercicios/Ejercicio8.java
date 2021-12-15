package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int n = s.nextInt();
		
		if (n <= 0) {
			System.out.println("No se puede introducir un número menor o igual a 0.");
			System.exit(-1);
		} else {
			for (int i = 1; i <= n; ++i) {
			      for (int j = 1; j <= i; ++j) {
			        System.out.print(j + " ");
			      }
			System.out.println();
			
			}

		}
	
	}
}


//https://www.programiz.com/java-programming/examples/pyramid-pattern