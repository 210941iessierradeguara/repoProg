package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double longitud;
		double anchura;
		double area;
		
		System.out.print("¿Cual es el largo de la habitación? ");
		longitud = s.nextDouble();
		
		System.out.print("¿Cual es el ancho de la habitación? ");
		anchura = s.nextDouble();
		
		area = (longitud * anchura);
		
		System.out.printf("El area de la habitación es de: %.4f" + " metros", area);

	}

}
