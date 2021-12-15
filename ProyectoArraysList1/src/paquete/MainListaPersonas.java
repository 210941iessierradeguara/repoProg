package paquete;

import java.util.ArrayList;

public class MainListaPersonas {
	
	public static void code() {
		Lista l = new Lista();
		Persona p = new Persona(1234567, 25, "a", "b");
		l.insertar(new Persona(2345678, 31, "c", "d"));
		l.insertar(new Persona(3456789, 42, "e", "f"));
		l.insertar(new Persona(4567890, 28, "g", "h"));
		l.insertar(new Persona(5678901, 34, "i", "j"));
		l.insertar(new Persona(6789012, 40, "k", "l"));
		l.insertar(p);
		
//		System.out.println(l.tamanyo());
//		System.out.println(l.vacia());
//		System.out.println(l.recuperar(6));
//		System.out.println(l.recuperar(l.buscarPorDNI(3456789)));
//		
//		System.out.println("****************************************************************************");
		
//		l.BorrarPersonaPorDNI(5678901);
		
//		System.out.println("****************************************************************************");
//		
//		System.out.println(l.borrarPersonaPosicion(1));
		
//		System.out.println("****************************************************************************");
		
		//System.out.println(l.buscarPorApellido2("l"));
		
//		System.out.println("****************************************************************************");	
		
		ArrayList<Persona> encontrados = (l.buscarPorApellido2("l"));
		for (Persona p1: encontrados)
			System.out.println(p1);
		
		System.out.println("****************************************************************************");
		
		System.out.println(l);
	}

	public static void main(String[] args) {
		try {
		code();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("fuck");
		}
	}

}
