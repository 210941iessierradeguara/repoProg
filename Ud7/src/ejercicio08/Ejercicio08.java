package ejercicio08;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio08 {

	public static void main(String[] args) {
		DataInputStream dataIS = null;
		try {
			dataIS = new DataInputStream(new FileInputStream("ficheros/ficheroEj07.dat"));
			String s;
			s = dataIS.readUTF();
			System.out.println(s);
			int i;
			Double d;

			while (true) {
				i = dataIS.readInt();
				d = dataIS.readDouble();
				System.out.println("Hora: " + i + " Temperatura: " + d);
			}
		} catch (EOFException EO) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dataIS.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}