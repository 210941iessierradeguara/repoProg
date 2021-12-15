package ejercicios;

import java.util.Scanner;

public class ConvertirCelsiusMetods {

	public static double conversorFtoC(double n) {
		return ((n - 32) / 1.8);
		/*double celsius;
		celsius = ((n - 32) / 1.8);
		return celsius;
		*/
	} // End of method conversor

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la cantidad en farenheit a convertir: ");
		double far = s.nextDouble();
		System.out.printf("La cantidad en Celsius es: %.2f" + "ºC", conversorFtoC(far));
	} // End of main
}