package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double longitud;
		double anchura;
		double area;
		
		System.out.print("�Cual es el largo de la habitaci�n? ");
		longitud = s.nextDouble();
		
		System.out.print("�Cual es el ancho de la habitaci�n? ");
		anchura = s.nextDouble();
		
		area = (longitud * anchura);
		
		System.out.printf("El area de la habitaci�n es de: %.4f" + " metros", area);

	}

}
