package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int euros;
		
		System.out.print("Introduzca una cantidad entera de euros: ");
		euros = s.nextInt();
		
		System.out.println("Billetes de 500: " + euros/500);
		System.out.println("Billetes de 200: " + (euros%500)/200);
		System.out.println("Billetes de 100: " + (euros%500%200)/100);
		System.out.println("Billetes de 50: " + (euros%500%200%100)/50);
		System.out.println("Billetes de 20: " + (euros%500%200%100%50)/20);
		System.out.println("Billetes de 10: " + (euros%500%200%100%50%20)/10);
		System.out.println("Billetes de 5: " + (euros%500%200%100%50%20%10)/5);
		System.out.println("Monedas: " + (euros%500%200%100%50%20%10%5));		
		

	}

}
