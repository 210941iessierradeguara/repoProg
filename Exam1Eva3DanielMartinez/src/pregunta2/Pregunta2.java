package pregunta2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import clases.Persona;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Pregunta2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fichero = new File ("Ficheros\\Agenda.dat");
		FileInputStream fis= new FileInputStream(fichero);
		ObjectInputStream ois=new ObjectInputStream(fis);
		List<Persona> listPerso = new ArrayList<Persona>();
		
		try {
			while(true) {
				Persona p = (Persona) ois.readObject();
				listPerso.add(p);
			}
		} catch (EOFException eofe){
			// TODO Auto-generated catch block
			eofe.printStackTrace();
		}
		ois.close();
		try{
			XStream xstream = new XStream(new DomDriver("UTF-8"));
			xstream.alias("Agenda_Personal", List.class); 
		    xstream.alias("Datos_Contacto", Persona.class);
		    xstream.toXML(listPerso, new FileOutputStream ("Ficheros\\Agenda.xml"));
		    System.out.println("a");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
	}
}
