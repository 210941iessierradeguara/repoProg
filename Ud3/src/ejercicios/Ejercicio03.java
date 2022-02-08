package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static double convertirDol(double d, double e) {
		double conversion = (d * e);
		return conversion;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduza el número de $ y la cotización en ese orden: ");
		double dolar = s.nextDouble();
		double cotizacion = s.nextDouble();
		
		double cambio = convertirDol(dolar, cotizacion);
		
		System.out.printf("El equivalente de $ a € de la cantidad introducida es: %.2f" + "€", cambio);

	}

}
