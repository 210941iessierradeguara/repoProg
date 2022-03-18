package ejercicio02_a_b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Ejericicio02_c2 {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream();
		xstream.alias("ListaDepartamento",ListaDeps.class);
		xstream.alias("DatosDepartamento", Departamento.class);
		xstream.addImplicitCollection(ListaDeps.class, "lista");
		
		ListaDeps listadoTodas = (ListaDeps) 
									xstream.fromXML
									(new FileReader("Documentos/fichero02.xml"));
		System.out.println("Número de Departamentos: " +
									listadoTodas.getListaPersonas().size());
		List<Departamento> listaPersonas=new ArrayList<Departamento>();
		listaPersonas=listadoTodas.getListaPersonas();
		
		Iterator iterador = listaPersonas.listIterator();
		while (iterador.hasNext()){
			Departamento p= (Departamento) iterador.next();
			System.out.println("Nombre: " + p.getNombre() + 
					", Localidad: " + p.getLocalidad());
		}
		System.out.println("Fin del listado....");	
	}

}
