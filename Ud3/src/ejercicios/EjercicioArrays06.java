package ejercicios;

import java.util.Scanner;

public class EjercicioArrays06 {

	public static void pedir(int[] num) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor nº " + (i + 1) + ": ");
			num[i] = s.nextInt();
		}
	}

	public static int min(int[] num) {
		int min = num[0];
		
		for (int j = 1; j < num.length; j++) {
			if (num[j] < min) {
				min = num[j];
			}
		}
		return min;
	}
	
	public static int max(int[] num) {
		int max = num[0];
		
		for (int l = 1; l<num.length; l++) {
			if (num[l] > max) {
				max = num[l];
			}
		}
		return max;
	}
	
	public static void impr(int[] num) {
		
		for (int t = 0; t<num.length; t++) {
			if (num[t] == max(num) && num[t] == min(num)) {
			System.out.println(num[t] + " máximo y mínimo");
			}
			else if (num[t] == max(num)) {
				System.out.println(num[t] + " máximo");
			}
			else if (num[t] == min(num)) {
				System.out.println(num [t] + " mínimo");
			}
			else {
				System.out.println(num[t]);
			}
		}
		
	}

	public static void main(String[] args) {
		int[] num = new int[10];
		pedir(num);
		impr(num);
	}

}
