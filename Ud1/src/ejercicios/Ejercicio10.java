package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double segundos;
		double minutos;
		double horas;
		
		System.out.print("¿Cuantos segundos han transcurrido?: ");
		segundos = s.nextDouble();
		
		minutos = (segundos / 60);
		horas = (minutos / 60);
		
		System.out.printf("Han transcurrido %.2f segundos"+ "Que son %.2f minutos"+ "Que suman %.2f horas", segundos, minutos, horas);

	}

}
