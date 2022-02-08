package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	
	public static long potencia(int x, int y) {
		long result = 1;
		
		while(y != 0) {
			result *= x;
			--y;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca dos numeros a elevar entre ellos: ");
		int prim = s.nextInt();
		int sec = s.nextInt();
		
		System.out.printf("La potencia de elevar el primero al segundo es: %d", potencia(prim, sec));
	}

}
