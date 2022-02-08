package ejercicios;

import java.util.Scanner;

public class EjercicioArrays16 {
	static Scanner s = new Scanner(System.in);
	public static int filas = 3;
	public static int columnas = 3;
	public static int[][] matriz = new int[filas][columnas];
	public static int[][] aux = new int[filas][columnas];
	public static boolean magica = true;
	public static int sumaF = 0;
	public static int sumaC = 0;
	public static int sumaDTLtoBR = 0;
	public static int sumaTRtoBL = 0;

	public static void introduction(int[][] matriz) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduzca el número de la casilla " + (i + 1) + " , " + (j + 1));
				matriz[i][j] = s.nextInt();
			}
		}
	}

	public static boolean existeNum(int[][] m, int numero) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (numero == m[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void filas(int[][] matriz) {
		int suma1 = 0;
		int suma2 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				suma1 = suma1 + matriz[i][j];
			}
			if (i == 0) {
				suma2 = suma1;
				suma1 = 0;
			} else {
				if (suma1 != suma2) {
					System.out.println("La matriz no es mágica.");
					System.exit(0);
				}
				suma2 = suma1;
				suma1 = 0;
			}
		}
		sumaF = suma1;
	}

	public static void columnas(int[][] matriz) {
		int suma1 = 0;
		int suma2 = 0;
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {

				suma1 = suma1 + matriz[i][j];
			}
			if (j == 0) {
				suma2 = suma1;
				suma1 = 0;
			} else {
				if (suma1 != suma2) {
					System.out.println("La matriz no es mágica.");
					System.exit(0);
				}
				suma2 = suma1;
				suma1 = 0;
			}
		}
		sumaF = suma1;
	}

	public static void diagonalTLtoBR(int[][] matriz) {
		int suma1 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					suma1 = suma1 + matriz[i][j];
				}
				
				if (i == matriz.length && j == matriz[i].length) {
					sumaDTLtoBR = suma1;
				}
			}
		}
	}
	
	public static void diagonalTRtoBL(int[][] matriz) {
		int suma1 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i + j == matriz.length - 1) {
					suma1 = suma1 + matriz[i][j];
				}
				
				if (i == filas && j == 0) {
					sumaTRtoBL = suma1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		introduction(matriz);

		for (int i = 1; i <= matriz.length * matriz.length; i++) {
			if (existeNum(matriz, i) == false) {
				magica = false;
				System.out.println("La matriz no es mágica.");
				System.exit(0);
			}
			
			filas(matriz);
			columnas(matriz);
			diagonalTLtoBR(matriz);
			diagonalTRtoBL(matriz);
		}
		
		if (sumaF == sumaC && sumaF == sumaDTLtoBR && sumaF == sumaTRtoBL && sumaC == sumaDTLtoBR && sumaC == sumaTRtoBL && sumaDTLtoBR == sumaTRtoBL) {
			System.out.println("La matriz es mágica.");
		} else {
			System.out.println("La matriz no es mágica.");
		}
	}

}
