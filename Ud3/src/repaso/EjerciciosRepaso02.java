package repaso;

import java.util.Scanner;

public class EjerciciosRepaso02 {
	public static Scanner s = new Scanner(System.in);
	public static int longitud = 10;
	public static int [] vector = new int [longitud];
	public static int positivos = 0;
	public static int negativos = 0;
	public static int ceros = 0;
	
	public static void positivos(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > 0) {
				positivos++;
			}
		}
	}
	
	public static void negativos(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				negativos++;
			}
		}
	}
	
	public static void ceros(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				ceros++;
			}
		}
	}
	
	
	public static void imprimir() {
		System.out.println("En el array hay un total de: ");
		System.out.println(positivos + " positivos");
		System.out.println(negativos + " negativos");
		System.out.println(ceros + " ceros");
	}
	
	public static void main(String[] args) {
		repaso.EjerciciosRepaso01.rellenar(vector);
		positivos(vector);
		negativos(vector);
		ceros(vector);
		imprimir();
	}

}
