package repaso;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosRespaso06 {
	public static Scanner s = new Scanner(System.in);
	public static int longitud = 20;
	public static int[] randNum = new int[longitud];
	public static int[] numPrimos = new int[longitud];

	public static void rellenar(int[] randNum) {
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = Roll99();
		}
	}

	public static void primos(int[] randNum) {
		
	}

	public static void main(String[] args) {
		rellenar(randNum);
	}

	public static int Roll99() {
		Random rand = new Random();
		int n = rand.nextInt(100);
		while (n == 0) {
			n = rand.nextInt(100);
		}
		return n;
	}

}
