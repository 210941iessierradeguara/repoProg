package pruebaFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("ficheros/fichero02.txt");
		
		fw.write('1');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write("Lorem ipsum dolor sit amet");
		fw.write('\n');
		fw.write("Declinex".toCharArray());
		
//		String msg;
//		System.out.println("a?");
//		msg = s.next();
//		fw.write(msg);
		
		fw.close();
	}

}
