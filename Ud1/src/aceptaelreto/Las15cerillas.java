package aceptaelreto;

import java.util.Scanner;

public class Las15cerillas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total;
		int quitar;
		
		System.out.println("El juego de las cerillas es un juego por turnos donde dos o más jugadores quitan un número entre:");
		System.out.println("1 y 10 cerillas de una pila de entre 2 y 1000 cerillas totales. Ahora: ");
		System.out.print("Introduce el numero de cerillas con las que se van a jugar: ");
		total = s.nextInt();
		
		if (total <= 1) {
			System.out.println("El numero de cerilla no puede ser igual o menor a 1.");
			System.exit(-1);
		}
		
		if (total > 1000) {
			System.out.println("El numero de cerilla no puede ser superior a 1000.");
			System.exit(-1);
		}
		
		while (total > 0) {
			System.out.print("Introduce las cerillas que quieres quitar con un entero ente 1 y 10: ");
			quitar = s.nextInt();
			
			if (quitar > 10) {
				System.out.println("No se pueden quitar más de 10 cerillas.");
				System.exit(0);
			}
			if (quitar <= 0) {
				System.out.println("No se pueden quitar menos de 1 cerillas.");
				System.exit(0);
			}
			
			total = total - quitar;
			
			System.out.println("Las cerillas restantes son: " + total);
			System.out.println("----------------------------------------------------------------");
			
		}
		
		System.out.print("Quedan 0 cerillas. Pierdes.");

	}

}


// https://www.aceptaelreto.com/problem/statement.php?id=147&cat=4