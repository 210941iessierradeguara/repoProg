package ejercicioColecciones3_05;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario {
	static Scanner s = new Scanner(System.in);
	static HashMap <String, String> diccionario = new HashMap<String, String>();
	
	public static void ponerLasPalabras() {
		// diccionario.put("", "");
		diccionario.put("hola", "hello");
		diccionario.put("halcón", "hawk");
		diccionario.put("lista", "list");
		diccionario.put("calculadora", "calculator");
		diccionario.put("espiral", "spiral");
		//5^
		diccionario.put("europa", "europe");
		diccionario.put("tortuga", "turtle");
		diccionario.put("pez", "fish");
		diccionario.put("helado", "ice-cream");
		diccionario.put("moneda", "coin");
		//10^
		diccionario.put("acuñar", "mint");
		diccionario.put("imprimir", "print");
		diccionario.put("gusano", "worm");
		diccionario.put("dormir", "sleep");
		diccionario.put("terminar", "finish");
		//15^
		diccionario.put("casa", "house");
		diccionario.put("defender", "defend");
		diccionario.put("saltar", "jump");
		diccionario.put("abismo", "chasm");
		diccionario.put("navegar", "sail");
		//20^
	}
	
	public static String guessIng() {
		int aciertos = 0;
		int fallos = 0;
		String vuelta;
		
		for(int i = 1; i<=5; i++) {
			Object[] diccionarioRand = diccionario.keySet().toArray(); // https://crunchify.com/java-how-to-get-random-key-value-element-from-hashmap/
			Object Lan = diccionarioRand[new Random().nextInt(diccionarioRand.length)];
			System.out.println("Traduce: " + diccionario.get(Lan));
			String choice = s.next();
			
			if(diccionario.containsKey(choice)) {
				aciertos++;
			}else {
				fallos++;
			}
		}
		
		vuelta = "Has tenido: " + aciertos + " aciertos. Y: " + fallos + " fallos.";
		return vuelta;
	}
	
	public static String guessESP() {
		int aciertos = 0;
		int fallos = 0;
		String vuelta;
		
		for (int i = 1; i<=5; i++) {
			Object[] diccionarioRand = diccionario.keySet().toArray();
			Object Lan = diccionarioRand[new Random().nextInt(diccionarioRand.length)];
			String comp = diccionario.get(Lan);
			System.out.println("Traduce: " + Lan);
			String choice = s.next();
			
			if(comp == choice.toLowerCase()) {
				aciertos++;
			} else {
				fallos++;
			}
		}
		vuelta = "Has tenido: " + aciertos + " aciertos. Y: " + fallos + " fallos.";
		
		return vuelta;
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
//		String palabra;
//		System.out.println("¿Que palabra desea traducir?: ");
//		palabra = s.next();
//		System.out.println(preguntar(palabra));
//		System.out.println(guessIng());
		System.out.println(guessESP());
	}
}
