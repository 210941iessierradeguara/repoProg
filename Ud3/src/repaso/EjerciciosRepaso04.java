package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosRepaso04 {
	public static Scanner s = new Scanner(System.in);
	public static int longitud;
	public static double media;
	public static int masQueMedia = 0;
	public static int menosQueMedia = 0;
	public static int igualQueMedia = 0;

	public static void totalPer() {
		boolean respondido = false;
		int respuesta;
		while (respondido == false) {
			System.out.println("¿Cuantas personas hay en total?");
			respuesta = s.nextInt();
			if (respuesta <= 0) {
				System.out.println("El número de personas ha de ser mayor que 0");
			} else {
				longitud = respuesta;
				respondido = true;
			}

		}
	}

	public static void pedirAltura(double[] alturas) {
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("¿cuanto mide la persona nº " + (i + 1));
			alturas[i] = s.nextDouble();
		}
	}

	public static void media(double[] alturas) {
		double total = 0;
		int num = 0;
		for (int i = 0; i < alturas.length; i++) {
			media = media + alturas[i];
			total = total + alturas[i];
			num++;
		}
		media = total / num;
		System.out.println("La media de alturas es de: " + media);
	}

	public static void medias(double[] alturas) {
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) {
				masQueMedia++;
			} else if (alturas[i] == media) {
				igualQueMedia++;
			} else if (alturas[i] < media) {
				menosQueMedia++;
			}
		}

		System.out.println("Hay " + masQueMedia + " personas por encima de la media.");
		System.out.println("Hay " + igualQueMedia + " personas iguales a la media.");
		System.out.println("Hay " + menosQueMedia + " personas por debajo de la media.");
	}

	public static void main(String[] args) {
		try {
			totalPer();
			double[] alturas = new double[longitud];
			pedirAltura(alturas);
			media(alturas);
			medias(alturas);
		} catch (InputMismatchException e) {
			System.out.println("NO");
		}
	}

}