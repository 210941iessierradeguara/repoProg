package ejercicio09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio09 {
	static FileReader fr, fr2;
	static FileWriter fw, fw2;
	
	public static boolean identico(String f, String f2) {
		int str1 = 0, str2 = 0;
		try {
			fr = new FileReader(f);
			fr2 = new FileReader(f2);
			int caracterLeido;
			while((caracterLeido = fr.read()) != -1) {
				str1 = str1 + caracterLeido;
			}
			while((caracterLeido = fr2.read()) != -1) {
				str2 = str2 + caracterLeido;
			}
			fr.close();
			if(str1 == str2) {
				return true;
			}
			
		} catch (IOException IOE) {
			IOE.printStackTrace();
		}
		
		return false;
	}
	
	public static void crearFich1(String s1) {
		try {
			fw = new FileWriter(s1);
			fw.write('a');
			fw.write('\n');
			fw.write('b');
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void crearFich2(String s1) {
		try {
			fw = new FileWriter(s1);
			fw.write('a');
			fw.write('\n');
			fw.write('b');
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String str1 = "ficheros/fichero05.txt";
		String str2 = "ficheros/fichero06.txt";
		crearFich1(str1);
		crearFich2(str2);
		System.out.println(identico(str1, str2));
	}

}
