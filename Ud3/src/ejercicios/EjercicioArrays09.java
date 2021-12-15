package ejercicios;

import java.util.Scanner;

public class EjercicioArrays09 {

	static Scanner s = new Scanner(System.in);
	public static int limite = 0;

	public static void pedir(double[] num) {
		System.out.println("Introduzca las notas, termine con un negativo.");
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca la nota nº " + (i + 1) + ": ");
			num[i] = s.nextInt();
			if (num[i] > 0) {
				limite++;
			}
			if(num[i] < 0) {
				break;
			}
		}
	}

	public static void media(double[] num) {
		double cont = 0;
		for (int j = 0; j < limite; j++) {
			cont = cont + num[j];
		}
		if (limite == 0) {
			System.out.printf("La media del curso es: 0 \n");
		}else {
		System.out.printf("La media del curso es: %.2f \n", cont / limite);
		}
	}

	public static void AprobySuspen(double[] num) {
		int aprobados = 0;
		int suspensos = 0;

		for (int j = 0; j < limite; j++) {
			if (num[j] >= 5) {
				aprobados++;
			} else {
				suspensos++;
			}
		}

		System.out.println("Hay: " + aprobados + " Aprobados.");
		System.out.println("Hay: " + suspensos + " Suspensos.");

	}
	
	public static void notaMax(double[] num) {
		double max = num[0];
		for(int p = 1; p < limite; p++) {
			if (num[p] > max) {
				max = num[p];
			}
		}
		
		if(limite == 0) {
			System.out.println("La nota más alta es: 0");
		}else {
		System.out.println("La nota más alta es: " + max);
		}
	}

	public static void main(String[] args) {
		int cantidad = 30;
		double[] calific = new double[cantidad];

		pedir(calific);

		System.out.print("La notas son: ");
		for (int t = 0; t < limite; t++) {
			System.out.print(calific[t] + " , ");
		}
		System.out.println("");

		media(calific);
		AprobySuspen(calific);
		notaMax(calific);

	}
}
