package ejercicios;

import java.util.Scanner;

public class EjercicioArrays12 {
	static Scanner s = new Scanner(System.in);

	public static void contarVoc(char[] caracteres) {
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

		for (int j = 0; j < caracteres.length; j++) {
			if (caracteres[j] == 'a' || caracteres[j] == 'A' || caracteres[j] == '�' || caracteres[j] == '�') {
				contA++;
			}
			if (caracteres[j] == 'e' || caracteres[j] == 'E' || caracteres[j] == '�' || caracteres[j] == '�') {
				contE++;
			}
			if (caracteres[j] == 'i' || caracteres[j] == 'I' || caracteres[j] == '�' || caracteres[j] == '�') {
				contI++;
			}
			if (caracteres[j] == 'o' || caracteres[j] == 'O' || caracteres[j] == '�' || caracteres[j] == '�') {
				contO++;
			}
			if (caracteres[j] == 'u' || caracteres[j] == 'U' || caracteres[j] == '�' || caracteres[j] == '�') {
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