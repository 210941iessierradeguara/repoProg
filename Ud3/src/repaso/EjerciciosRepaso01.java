package repaso;

import java.util.Scanner;

public class EjerciciosRepaso01 {
	public static Scanner s = new Scanner(System.in);
	public static int [] vector = new int [10];
	
	public static void rellenar (int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca el n�mero para ir en la posici�n " + (i+1));
			vector[i] = s.nextInt();
		}
	}
	
	public static void main(String[] args) {
		rellenar (vector);
		ejercicios.EjercicioArrays06.min(vector);
		ejercicios.EjercicioArrays06.max(vector);
		ejercicios.EjercicioArrays06.impr(vector);
	}

}
