package ejercicios;

import java.util.Scanner;

public class EjercicioArrays10 {
	public static Scanner s = new Scanner(System.in);
	
	
	public static void converToDecimal(int [] bina) {
		int elevado = 0;
		int decimal = 0;
		for(int l = 0; l < 8; l++) {
			if(bina[l] == 1) {
				elevado = (int) Math.pow(2, l);
				decimal = decimal + elevado;
			}
		}
		System.out.println("En decimal es:" + decimal);
	}
	
	public static void main(String[] args) {
		int cont = 1;
		System.out.println("Introduzca un binario de 8: ");
		String binaStr = s.nextLine();
		char[] binaChar = new char[binaStr.length()];
		
		for (int i = 0; i < binaStr.length(); i++) {
			binaChar[i] = binaStr.charAt(i);
		} //de string a char
		
		int [] bina = new int[8];
		
		for(int j = 0; j < 8; j++) {
			int y = binaChar[j] - '0';
			bina[j] = y;
			
			System.out.println(bina[j]);
		}//de char a int
		
		converToDecimal(bina);
	}
}

