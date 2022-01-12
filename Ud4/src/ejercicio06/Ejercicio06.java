package ejercicio06;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
	static Scanner s = new Scanner(System.in);
	
	public static String anagramaCompr (String p1, String p2) {
		@SuppressWarnings("unused")
		String comparado;
		
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
		char c1[] = p1.toCharArray();
		char c2[] = p2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			return comparado = "Las palabras son un anagrama";
		} else {
			return comparado = "las palabras no son un anagrama";
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Escribe la primera palabra: ");
		String p1 = s.next();
		System.out.println("Escribe la segunda palabra: ");
		String p2 = s.next();
		System.out.println(anagramaCompr(p1, p2));
	}

}
