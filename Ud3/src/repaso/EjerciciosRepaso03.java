package repaso;

import java.util.Scanner;

public class EjerciciosRepaso03 {
	public static Scanner s = new Scanner(System.in);
	public static int longitud = 10;
	public static int [] vector = new int [longitud];
	public static int totalPositivos = 0;
	public static int positivos = 0;
	public static int totalNegativos = 0;
	public static int negativos = 0;
	public static int mediaP;
	public static int mediaN;
	
	public static void positivos(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] >= 0) {
				totalPositivos = totalPositivos + vector[i];
				positivos++;
			}
		}
	}
	
	public static void negativos(int [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				totalNegativos = totalNegativos + vector[i];
				negativos++;
			}
		}
	}
	
	public static void medias() {
		mediaP = totalPositivos/positivos;
		mediaN = totalNegativos/negativos;
	}
	
	public static void impr() {
		System.out.println("En este array: ");
		System.out.println("Hay una media de: " + mediaP + " en los números positivos");
		System.out.println("Hay una media de: " + mediaN + " en los números negativos");
	}
	
	public static void main(String[] args) {
		repaso.EjerciciosRepaso01.rellenar(vector);
		positivos(vector);
		negativos(vector);
		medias();
		impr();
	}

}
