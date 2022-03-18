package ejercicio02_a_b;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.thoughtworks.xstream.XStream;

public class Ejercicio02_c1 {
	static XStream xs = new XStream();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fichero = new File ("Documentos/fichero.dat");
		FileInputStream filein= new FileInputStream(fichero);
		ObjectInputStream dataIS=new ObjectInputStream(filein);
		System.out.println("Comienza el proceso de creaci�n del fichero XML..");
		ListaDeps listadeps=new ListaDeps();
		try{
			while(true){
				Departamento depar=(Departamento) dataIS.readObject();
				listadeps.add(depar);
			}
		} catch (EOFException eo){}
		dataIS.close();
		try{
			XStream xstream = new XStream();
			xstream.alias("ListaDepartamento",ListaDeps.class);
		    xstream.alias("DatosDepartamento", Departamento.class);
		    xstream.addImplicitCollection(ListaDeps.class, "lista");
		    xstream.toXML(listadeps, new FileOutputStream ("Documentos/fichero02.xml"));
		    System.out.println("Creado fichero XML...");					
		}catch (Exception e) {e.printStackTrace(); }
	
	}

}
