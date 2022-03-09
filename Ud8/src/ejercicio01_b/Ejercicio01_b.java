package ejercicio01_b;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Ejercicio01_b {
	static Scanner s = new Scanner(System.in);
//	Validar un n�mero de tel�fono internacional (Comienza por par�ntesis, le sigue el car�cter +, despu�s 2 �
//			3 cifras num�ricas, par�ntesis de cierre y 9 cifras num�ricas); ej--> (+34)974243447
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduce un t�lefono internacional sin espacios");
			String telf = s.next();
			
			if (telf.matches("\\(\\+\\d{2,3}\\)\\d{9}")) {
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
