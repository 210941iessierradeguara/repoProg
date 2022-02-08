package repaso;

import java.util.Scanner;

public class EjerciciosRepaso05 {
	public static Scanner s = new Scanner(System.in);
	public static int [] resultados = new int [2];

	public static void rellenar(String[] nombres, int[] sueldos) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Persona: " + (i + 1));
			nombres[i] = s.next();
			System.out.println("sueldo: ");
			sueldos[i] = s.nextInt();
		}
	}

	public static void visualizar(String[] nombres, int[] sueldos) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + "-->" + sueldos[i]);
		}
	}

	public static void max(int[] sueldos) {
		int max = sueldos[0];
		int j = 0;
		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i] > max) {
				max = sueldos[i];
				j++;
			}
		}
		resultados[0] = max;
		resultados[1] = j;
	}

	public static void main(String[] args) {
		int p=5;
		String[] nombres = new String[p];
		int[] sueldos = new int[p];
		rellenar(nombres, sueldos);
		visualizar(nombres, sueldos);
		int j = resultados[1];
		System.out.println("El sueldo más alto es: " + resultados[0] + " Que se corresponde con " + nombres[j]);
	}

}
