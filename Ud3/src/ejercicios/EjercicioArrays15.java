package ejercicios;

import java.util.Scanner;

public class EjercicioArrays15 {
	static Scanner s = new Scanner(System.in);
	static int filas = 3;
	static int columnas = 3;

	public static void introduction(int[][] matriz) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca el número de la casilla " + (i + 1) + " , " + (j + 1));
				matriz[i][j] = s.nextInt();
			}
		}
	}

	public static void transpon(int[][] matriz) {
		int [][] aux = new int [filas][columnas];
		System.out.println("La matriz antes de transponerla: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\t \n");
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		System.out.println("\n \n La matriz tras transponerla: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < matriz.length; j++) {
				aux[i][j] = matriz[j][i];
				System.out.print(aux[i][j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] matriz = new int[filas][columnas];

		introduction(matriz);
		transpon(matriz);
	}

}
