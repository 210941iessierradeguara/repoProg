package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double cantidadPrestada;
		double interesAnual;
		double interesMensual;
		double pagoMensual;
		int anyos;
		int numeroPagos;
		
		System.out.print("Introduzca la cantidad prestada: ");
		cantidadPrestada = s.nextDouble();
		System.out.print("Introduzca el interés anual en %: ");
		interesAnual = s.nextDouble();
		interesMensual = interesAnual / 100 / 12;
		System.out.print("Número de años: ");
		anyos = s.nextInt();
		numeroPagos = anyos * 12;
		pagoMensual = (cantidadPrestada * interesMensual) / (1 -(1 / (Math.pow((1+interesMensual), numeroPagos))));
		
		System.out.println("===========================================================");
		System.out.println("Resultado de la operación");
		System.out.printf("Cantidad prestada: %.2f" + " euros \n", cantidadPrestada);
		System.out.printf("Interes anual %.2f" +" porciento \n", interesAnual);
		System.out.printf("Duracion en años del prestamos: %d \n", anyos);
		System.out.printf("Número de pagos: %d \n", numeroPagos);
		System.out.printf("Pago mensual: %.2f " + " euros \n", pagoMensual);
		System.out.printf("cantidad total a pagar: %.2f" + " euros \n", (pagoMensual * numeroPagos));

	}

}
