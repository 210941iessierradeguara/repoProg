package pruebaFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritorDeBytes {
	
	static Scanner s = new Scanner(System.in); 
	static FileWriter fw;
	
	private static void escribe(String f) {
		try {
			fw = new FileWriter(f);
			
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			
			fw.close();
			System.out.println("Se creó correctamente el fichero");
			} catch (IOException io) {
				System.out.println("Ocurrió un error en la entrada de datos.");
			}
	}
	
	public static void main(String[] args) throws IOException {
		String f = "ficheros/fichero04.dat";
		escribe(f);
	}

}
