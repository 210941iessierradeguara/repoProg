package examen;

import java.util.Scanner;

public class DanielMartinez2 {

	public static void perfecto(int e) {
		Scanner s = new Scanner(System.in);
		int num, div, cont = 0;
		num = e;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				div = i;
				cont = cont + div;
			}
		}
		if (num != 0) {
			if (num == cont) {
				System.out.println("El número " + num + " es perfecto.");
			}
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5000; i++) {
			perfecto(i);
		}

	}

}