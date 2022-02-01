package ejercicio04;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio04 {
	
	public static String DelSpa(String f) {
		String str = "";
		try {
			FileReader fr = new FileReader(f);
			int caracterLeido;
			while((caracterLeido = fr.read()) != -1) {
				str = str + Character.toString((char)caracterLeido);
			}
			str = str.replaceAll("\\s", "");
			fr.close();
		} catch (IOException IOE) {
			IOE.printStackTrace();
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(DelSpa("ficheros/fichero01"));
	}

}
