package ejercicios;

import java.util.Scanner;

public class EjercicioArrays03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = new int[12];
		a[0] = 39;
		a[1] = -2;
		a[4] = 0;
		a[6] = 14;
		a[8] = 5;
		a[9] = 120;
		
		for(int i = 0; i <= 11; i++) {
			System.out.println(a[i]);
		}
		
		// los valores sin inicializar son 0.

	}

}
