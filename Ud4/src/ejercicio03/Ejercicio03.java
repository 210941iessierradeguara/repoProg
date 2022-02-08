package ejercicio03;

import java.util.StringTokenizer;

public class Ejercicio03 {
	
	static String cadena = "Abc Def Ghi";

	public static void main(String[] args) {
//		tokenizer
		StringTokenizer st = new StringTokenizer("Abc Def Ghi");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		Split
		String cachos [] = cadena.split(" ");
		for (String pieza: cachos)
			System.out.println(pieza);;
	}

}
