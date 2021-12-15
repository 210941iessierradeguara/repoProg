package ejercicios;

import java.util.Scanner;

public class EjercicioArrays14 {
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

	public static void checkSimetry(int[][] matriz) {
		boolean cierto;
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					cont = cont + 1;
				}
			}
		}
		
		if (cont == (filas*columnas)) {
			cierto = true;
			System.out.println(cierto);
		}else {
			cierto = false;
			System.out.println(cierto);
		}
	}

	public static void main(String[] args) {
		int[][] matriz = new int[filas][columnas];
		
		introduction(matriz);
		checkSimetry(matriz);
	}

}