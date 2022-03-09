package ejercicio01_a;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_a {
	static Scanner s = new Scanner(System.in);
	// Validar un n�mero de tel�fono nacional sin espacios (9 cifras num�ricas); ej--> 974243447
	public static void main(String[] args) {
		try {
			System.out.println("Introduce un t�lefono nacional sin espacios");
			String telf = s.next();
			
			if (telf.matches("\\d{9}")) {
				System.out.println("Numero de tel�fono correcto");
			} else {
				System.out.println("Numero de tel�fono incorrecto");
			}
		} catch(PatternSyntaxException PSE) {
			System.out.println("Error la comparaci�n");
			System.out.println("");
			PSE.printStackTrace();
		} catch (InputMismatchException IME) {
			System.out.println("Error la introducci�n del tel�fono");
			System.out.println("");
			IME.printStackTrace();
		}
	}
}
