package ejercicio01_a;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_a {
	static Scanner s = new Scanner(System.in);
	// Validar un número de teléfono nacional sin espacios (9 cifras numéricas); ej--> 974243447
	public static void main(String[] args) {
		try {
			System.out.println("Introduce un télefono nacional sin espacios");
			String telf = s.next();
			
			if (telf.matches("\\d{9}")) {
				System.out.println("Numero de teléfono correcto");
			} else {
				System.out.println("Numero de teléfono incorrecto");
			}
		} catch(PatternSyntaxException PSE) {
			System.out.println("Error la comparación");
			System.out.println("");
			PSE.printStackTrace();
		} catch (InputMismatchException IME) {
			System.out.println("Error la introducción del teléfono");
			System.out.println("");
			IME.printStackTrace();
		}
	}
}
