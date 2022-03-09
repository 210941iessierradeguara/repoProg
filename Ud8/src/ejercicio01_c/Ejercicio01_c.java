package ejercicio01_c;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_c {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduzca un c�digo postal");
			String telf = s.next();
			
			if (telf.matches("\\d{5}")) {
				System.out.println("C�digo postal correcto");
			} else {
				System.out.println("C�digo postal incorrecto");
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
