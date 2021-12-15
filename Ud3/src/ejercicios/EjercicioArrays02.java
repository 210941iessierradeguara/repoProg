package ejercicios;

import java.util.Scanner;

public class EjercicioArrays02 {
	
	public static int aleatorio() {
		int num = (int) (Math.random() * 100);
		return num;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] array = new int[20];
		array[0] = aleatorio();
		array[1] = aleatorio();
		array[2] = aleatorio();
		array[3] = aleatorio();
		array[4] = aleatorio();
		array[5] = aleatorio();
		array[6] = aleatorio();
		array[7] = aleatorio();
		array[8] = aleatorio();
		array[9] = aleatorio();
		array[10] = aleatorio();
		array[11] = aleatorio();
		array[12] = aleatorio();
		array[13] = aleatorio();
		array[14] = aleatorio();
		array[15] = aleatorio();
		array[16] = aleatorio();
		array[17] = aleatorio();
		array[18] = aleatorio();
		array[19] = aleatorio();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(array[i]);
		}
	}

}
