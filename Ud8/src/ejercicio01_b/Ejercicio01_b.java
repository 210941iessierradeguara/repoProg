package ejercicio01_b;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_b {
	static Scanner s = new Scanner(System.in);
//	Validar un número de teléfono internacional (Comienza por paréntesis, le sigue el carácter +, después 2 ó
//			3 cifras numéricas, paréntesis de cierre y 9 cifras numéricas); ej--> (+34)974243447
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduce un télefono internacional sin espacios");
			String telf = s.next();
			
			if (telf.matches("\\(\\+\\d{2,3}\\)\\d{9}")) {
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
