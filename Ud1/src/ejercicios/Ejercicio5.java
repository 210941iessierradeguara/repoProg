package ejercicios;



import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final double pi = 3.1416;
		double radio;
		
		double area;
		
		System.out.print("Introduce el radio: ");
		radio = s.nextDouble();
		
		area = (pi * (Math.pow(radio, 2)));
		
		System.out.printf("El area del circulo es: %.4f", area);
		
	}

}
