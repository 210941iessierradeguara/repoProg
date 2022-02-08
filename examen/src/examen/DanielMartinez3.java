package examen;

import java.util.Scanner;

public class DanielMartinez3 {

	public static void cerillas() {
		Scanner s = new Scanner(System.in);
		int ceri = 21, x, y;
		System.out.println("Introduce tu nombre: ");
		String nombre = s.nextLine();
		while (ceri > 0) {
			System.out.println("Hay " + ceri + " cerillas en la mesa");
			System.out.println("--> ¿Cuantas cerillas quieres coger " + nombre + "? [1-4]");
			x = s.nextInt();
			if (x > 4 || x <= 0 || x > ceri) {
				System.out.println("No puedes escoger un número menor a 1 o mayor que 4, o que supere las cerillas totales");
				System.out.println("");
			} else {
				ceri = ceri - x;
				if (ceri > 1) {
					y = 5 - x;
					System.out.println("* Yo [PC] quito " + y + " cerillas.");
					ceri = ceri - y;
					System.out.println("");
				}
			}
		}
		if (ceri == 0) {
			System.out.println("Lo lamento, has quitado la ultima cerilla has perdido.");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		cerillas();
	}
}