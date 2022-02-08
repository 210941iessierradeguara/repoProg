package pruebaFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritorv2 {
	
	static Scanner s = new Scanner(System.in); 
	
	private static void escribe(String f) {
		try {
			FileWriter fw = new FileWriter(f);
			
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.write("Lorem ipsum dolor sit amet");
			fw.write('\n');
			fw.write("Declinex".toCharArray());
			
//			String msg;
//			System.out.println("a?");
//			msg = s.next();
//			fw.write(msg);
			
			fw.close();
			System.out.println("Se creó correctamente el fichero");
			} catch (IOException io) {
				System.out.println("Ocurrió un error en la entrada de datos.");
			}
	}
	
	public static void main(String[] args) throws IOException {
		String f = "ficheros/fichero03.txt";
		escribe(f);
	}

}
