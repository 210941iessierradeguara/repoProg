package pruebaFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDeCaracteres {
	
	public static void leer(String f) {
		FileReader fr;
		try {
			int caracterLeido;
			fr = new FileReader(f);
//			caracterLeido = fr.read();
//			while (caracterLeido != -1) {
//				System.out.print((char)caracterLeido);
//				caracterLeido = fr.read();
//			}
			
			while((caracterLeido = fr.read()) != -1) {
				System.out.print((char)caracterLeido);
			}
			
			fr.close();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String f = "ficheros/fichero03.txt";
		leer(f);
	}

}
