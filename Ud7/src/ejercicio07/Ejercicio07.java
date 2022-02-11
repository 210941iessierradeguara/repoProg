package ejercicio07;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio07 {

	public static void main(String[] args) {
		try {
			FileOutputStream fileout = new FileOutputStream("ficheros/ficheroEj07.dat");
			DataOutputStream dataOS=new DataOutputStream(fileout);
			String dia = "10 Agosto 2021 ";
			
			dataOS.writeBytes(dia);
			
			for (int i = 0; i < 23; i++) {
				dataOS.writeInt(i);
				dataOS.writeDouble(Math.random()*26);
			}
			dataOS.close();
		} catch (IOException IOE) {
			System.out.println("Ocurrió un error en la ejecución.");
			IOE.printStackTrace();
		}
	}

}
