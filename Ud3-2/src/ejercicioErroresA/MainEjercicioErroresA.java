package ejercicioErroresA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEjercicioErroresA {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca un entero:");
		try {
			@SuppressWarnings("unused")
			int i = s.nextInt();
		} catch (InputMismatchException IMME) {
			System.out.println("El dato introducido no es un entero.");
		}

	}
}