package ejercicioColecciones3_05;

import java.util.HashMap;
import java.util.Scanner;

public class MiniDiccionario {
	static Scanner s = new Scanner(System.in);
	static HashMap <String, String> diccionario = new HashMap<String, String>();
	
	public static void ponerLasPalabras() {
		// diccionario.put("", "");
		diccionario.put("hola", "Hello");
		diccionario.put("halcón", "Hawk");
		diccionario.put("lista", "List");
		diccionario.put("calculadora", "Calculator");
	}
	
	public static String preguntar(String palabraESP) {
		String hilo = "";
		
		if(diccionario.get(palabraESP.toLowerCase()) != null) {
			hilo = diccionario.get(palabraESP.toLowerCase());
		} else {
			hilo = "palabra inexistente";
		} 
		
		return hilo;
	}
	
	public static void main(String args[]) {
		ponerLasPalabras();
		String palabra;
		System.out.println("¿Que palabra desea traducir?: ");
		palabra = s.next();
		System.out.println(preguntar(palabra));
	}
	
}
