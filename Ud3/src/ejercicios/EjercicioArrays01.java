package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int [] array = new int [10];
		System.out.print("Introduzca 10 números por teclado: ");
		
		for(int i=0; i<10; i++) {
			array[i] = s.nextInt();
		}
		
		for(int j=9; j>=0; j--) {
			System.out.println(array[j]);
		}

	}

}
