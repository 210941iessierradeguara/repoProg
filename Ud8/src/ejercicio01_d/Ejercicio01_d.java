package ejercicio01_d;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_d {
	static Scanner s = new Scanner(System.in);
//	Validar una fecha en formato dd/mm/aaaa
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduzca una fecha en el formato dd/mm/aaaa");
			String telf = s.next();
			if (telf.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$")) {
				System.out.println("Fecha correcta");
			} else {
				System.out.println("Fecha incorrecta");
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
