package ejercicio01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {
	static FileReader fr;
	static FileWriter fw;
	static BufferedReader bf;
	static BufferedWriter bw;
	
	public static void crearFich(String s1) {
		try {
			bw = new BufferedWriter(fw = new FileWriter(s1));
			
			bw.write("1.54");
			bw.write("2.89");
			bw.write("0.50");
			bw.write("10.98");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerFich(String f) {
		 
		try {
			bf = new BufferedReader(fr = new FileReader(f));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String f = "ficheros/ficheroDou01.txt";
		crearFich(f);
		
	}
}
