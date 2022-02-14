package ejercicio02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
	
	public static int contarVoc(String f) {
		int voc = 0;
		try {
			FileReader fr = new FileReader(f);
			int caracterLeido;
			
			
			while((caracterLeido = fr.read()) != -1) {
				String str = Character.toString((char)caracterLeido).toUpperCase();
				if(str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
					voc++;
				}
			}
			fr.close();
		} catch (IOException IOE) {
			IOE.printStackTrace();
		}
		return voc;
	}
	
	public static void main(String[] args) {
		System.out.println(contarVoc("ficheros/fichero01"));
	}

}
