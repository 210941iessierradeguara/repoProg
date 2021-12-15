package ejercicios;

import java.util.Scanner;

public class EjercicioArrays08 {
	static Scanner s = new Scanner(System.in);
	
	public static void pedir(double[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca la nota nº " + (i + 1) + ": ");
			num[i] = s.nextInt();
		}
	}
	
	public static void media(double[] num) {
		double cont = 0;
		for(int j = 0; j < num.length; j++) {
			cont = cont + num[j];
		}
		
		System.out.printf("La media del curso es: %.2f \n", cont/num.length);
	}
	
	public static void AprobySuspen(double[] num) {
		int aprobados = 0;
		int suspensos = 0;
		
		for(int j = 0; j < num.length; j++) {
			if (num[j] >= 5) {
				aprobados++;
			}
			else {
				suspensos++;
			}
		}
		
		System.out.println("Hay: " + aprobados + " Aprobados.");
		System.out.println("Hay: " + suspensos + " Suspensos.");
		
	}
	
	public static void main(String[] args) {
		int cantidad = 10;
		double [] calific = new double [cantidad];
		
		pedir(calific);
		
		System.out.print("La notas son: ");
		for(int t = 0; t < calific.length; t++) {
			System.out.print(calific[t] + " , ");
		}
		System.out.println("");
		
		media(calific);
		AprobySuspen(calific);
		
		
	}

}
