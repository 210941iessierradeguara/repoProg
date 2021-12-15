package ejercicios;

import java.util.Scanner;

public class EjercicioArrays07 {
	static Scanner s = new Scanner(System.in);
	
	public static void pedir(int [] num) {
		for(int j = 0; j < num.length; j++) {
			System.out.println("Introduzca el valor nº " + (j + 1) + ": ");
			num[j] = s.nextInt();
		}
	}
	
	public static void rotar(int [] num) {
		int aux = num[num.length-1];
		
		for(int i = num.length - 1; i > 0; i--) {
			num[i]=num[i-1];
		}
		num[0] = aux;
		
		for(int l = 0; l < num.length; l++) {
			System.out.print(num[l] + " , ");
		}
	}
	
	public static void main(String[] args) {
		int tamanyo=15;
		int[] num = new int[tamanyo];
		pedir(num);
		rotar(num);
	}
	
}
