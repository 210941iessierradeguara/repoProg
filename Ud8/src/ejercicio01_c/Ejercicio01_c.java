package ejercicio01_c;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_c {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduzca un código postal");
			String telf = s.next();
			
			if (telf.matches("\\d{5}")) {
				System.out.println("Código postal correcto");
			} else {
				System.out.println("Código postal incorrecto");
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
