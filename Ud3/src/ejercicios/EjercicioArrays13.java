package ejercicios;

import java.util.Scanner;

public class EjercicioArrays13 {

	static Scanner s = new Scanner(System.in);

	public static void alumno(double[][] notas) {

		for (int i = 0; i < notas.length; i++) {
			double max = notas[i][0];
			double min = notas[i][0];
			double media = 0;

			for (int j = 0; j < notas.length; j++) {
				if (notas[i][j] < min) {
					min = notas[i][j];
				}
				if (notas[i][j] > max) {
					max = notas[i][j];
				}
				media = media + notas[i][j];
			}
			System.out.printf("La nota mínima del alumno %d es: %.2f \n", i + 1, min);
			System.out.printf("La nota máxima del alumno %d es: %.2f \n", i + 1, max);
			System.out.printf("La nota media del alumno %d es: %.2f \n", i + 1, media / notas.length);
			System.out.println("");

		}
	}

	public static void asignatura(double[][] notas) {
		for (int j = 0; j < notas[0].length; j++) {
			double max = notas[0][j];
			double min = notas[0][j];
			double media = 0;

			for (int i = 0; i < notas.length; i++) {
				if (notas[i][j] < min) {
					min = notas[i][j];
				}
				if (notas[i][j] > max) {
					max = notas[i][j];
				}
				media = media + notas[i][j];
			}
			System.out.printf("La nota mínima de la asignatura %d es: %.2f \n", j + 1, min);
			System.out.printf("La nota máxima de la asignatura %d es: %.2f \n", j + 1, max);
			System.out.printf("La nota media de la asignatura %d es: %.2f \n", j + 1, media / notas.length);
			System.out.println("");

		}
	}

	public static void curso(double[][] notas) {
		double max = notas[0][0];
		double min = notas[0][0];
		double media = 0;

		for (int i = 0; i < notas.length; i++) {

			for (int j = 0; j < notas.length; j++) {
				if (notas[i][j] < min) {
					min = notas[i][j];
				}
				if (notas[i][j] > max) {
					max = notas[i][j];
				}
				media = media + notas[i][j];
			}
		}

		System.out.printf("La nota mínima del curso es: %.2f \n", min);
		System.out.printf("La nota máxima del curso es: %.2f \n", max);
		System.out.printf("La nota media del curso es: %.2f \n", media / (notas.length * 3));
		System.out.println("");

	}

	public static void buscar(double[][] notas) {
		double busqueda;
		int cont = 0;
		System.out.println("Introduca la nota a buscar: ");
		busqueda = s.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				if (busqueda == notas[i][j]) {
					System.out.println("El alumno: " + (i + 1) + " coincide con esa nota en la asignatura: " + (j + 1));
					cont++;
				}
			}
		}
		if (cont > 0) {
			System.exit(0);
		} else {
			System.out.println("Ningún alumno posee tal nota.");
		}
	}

	public static void main(String[] args) {
		/*
		 * fila = notas de alumno columna = notas asignatura
		 */

		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 } };
		alumno(notas);
		asignatura(notas);
		curso(notas);
		buscar(notas);
	}

}
