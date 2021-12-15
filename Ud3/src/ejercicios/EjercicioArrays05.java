package ejercicios;

public class EjercicioArrays05 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (1 + (Math.random() * 100));
		} // asigna los números
		for (int j = 0; j < 20; j++) {
			int x = numero[j]; // Esto mete el numero en la x
			int pow = (int) Math.pow(x, 2); // hace el cuadrado de x y lo almacena en pow.
			cuadrado[j] = pow;
		}
		for (int l = 0; l < 20; l++) {
			int y = numero[l]; // Esto mete el numero en la x
			int cub = (int) Math.pow(y, 3); // hace el cubo de y y lo almacena en cub.
			cubo[l] = cub;
		}
		for (int t = 0; t < 20; t++) {
			System.out.printf("Número: %4d \t Cuadrado: %4d \t Cubo: %4d \n", numero[t], cuadrado[t], cubo[t]);
		}

	}

}
