package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioOrdenacion01 {
	static Scanner s = new Scanner(System.in);

	public static void rellenarRandom(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Aleatorio100();
		}
	}
	
	public static int buscar(int[] vector, int busq) {
		int Izq = 0;
		int Der = vector.length;
		int cen;
		int contA = 0;
		int cont = 1;
		
		while (Izq <= Der) {
			cen = ((Izq + Der)/2);
			if(vector[cen] == busq) {
				System.out.println("El número: " + busq + " Se ha encontrado en la posición: " + contA + " En la vuelta: " + cont);
				return cen;
			}
			if(busq < vector[cen]) {
				Der = cen-1;
			} else {
				Izq = cen +1;
			}
			contA++;
			cont++;
		}
		System.out.println("El número: " + busq + " No ha sido hallado");
		return -1;
	}

	public static void main(String[] args) {
		int[] vector = new int[100];
		
		rellenarRandom(vector);
		Arrays.sort(vector);
		System.out.println("Introduzca el número a buscar");
		int respuesta = s.nextInt();
		buscar(vector, respuesta);
	}

	public static int Aleatorio100() {
		Random rand = new Random();
		int n = rand.nextInt(101);
		while (n == 0) {
			n = rand.nextInt(101);
		} // 1-20
		return n;
	}
}