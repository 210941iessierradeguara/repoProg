package ejercicio02_a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio02_a {

	public static void main(String[] args) {
		String dir = "Documentos/fichero.dat";
		
		Departamento d1 = new Departamento(01, "A", "A01");
		Departamento d2 = new Departamento(02, "B", "B01");
		Departamento d3 = new Departamento(03, "C", "C01");
		Departamento d4 = new Departamento(04, "D", "D01");
		
		try {
			ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(dir));
			OOS.writeObject(d1);
			OOS.writeObject(d2);
			OOS.writeObject(d3);
			OOS.writeObject(d4);
			OOS.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
