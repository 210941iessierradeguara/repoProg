package ejercicios;

import java.util.Scanner;

public class EjercicioArrays12 {
	static Scanner s = new Scanner(System.in);

	public static void contarVoc(char[] caracteres) {
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

		for (int j = 0; j < caracteres.length; j++) {
			if (caracteres[j] == 'a' || caracteres[j] == 'A' || caracteres[j] == 'Á' || caracteres[j] == 'á') {
				contA++;
			}
			if (caracteres[j] == 'e' || caracteres[j] == 'E' || caracteres[j] == 'É' || caracteres[j] == 'é') {
				contE++;
			}
			if (caracteres[j] == 'i' || caracteres[j] == 'I' || caracteres[j] == 'Í' || caracteres[j] == 'í') {
				contI++;
			}
			if (caracteres[j] == 'o' || caracteres[j] == 'O' || caracteres[j] == 'Ó' || caracteres[j] == 'ó') {
				contO++;
			}
			if (caracteres[j] == 'u' || caracteres[j] == 'U' || caracteres[j] == 'Ú' || caracteres[j] == 'ú') {
				contU++;
			}
		}

		System.out.println("Hay un total de: ");
		System.out.println(contA + " A");
		System.out.println(contE + " E");
		System.out.println(contI + " I");
		System.out.println(contO + " O");
		System.out.println(contU + " U");

	}

	public static void main(String[] args) {
		System.out.println("Introduzca una frase: ");
		String str = s.nextLine();
		char[] caracteres = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			caracteres[i] = str.charAt(i);
		}

		contarVoc(caracteres);
	}
}