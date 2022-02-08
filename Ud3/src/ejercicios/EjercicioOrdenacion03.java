package ejercicios;

import java.util.Random;

public class EjercicioOrdenacion03 {

	public static int tamanyo = 10;
	public static int[] vector = new int[tamanyo];

	public static void rellenar(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = randomRoll();
		}
	}

	public static void vaciar(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i] == vector[j]) {

				}
			}
		}
	}

	public static void main(String[] args) {
		rellenar(vector);
	}

	public static int randomRoll() {
		Random rand = new Random();
		int n = rand.nextInt(21);
		while (n == 0) {
			n = rand.nextInt(21);
		}
		return n;
	}
}
