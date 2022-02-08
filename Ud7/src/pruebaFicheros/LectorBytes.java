package pruebaFicheros;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LectorBytes {
//		static FileReader fr;
		static FileInputStream fr;
		
	public static void leer(String f) {
		
		try {
			int caracterLeido;
			fr = new FileInputStream(f);
//			fr = new FileReader(f);
			
			while((caracterLeido = fr.read()) != -1) {
				System.out.print((char)caracterLeido);
			}
			
			fr.close();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String f = "ficheros/fichero04.dat";
		leer(f);
	}
}
