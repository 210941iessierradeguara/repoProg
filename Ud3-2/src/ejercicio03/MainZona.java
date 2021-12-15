package ejercicio03;

import java.util.Scanner;

public class MainZona {
	static Scanner s = new Scanner(System.in);
	static int cantidad;
	static Zona Principal = new Zona(1000);
	static Zona CompVen = new Zona(200); // Compra venta
	static Zona VIP = new Zona(25);

	public static void Entradas() {
		System.out.println("****************************************************");
		System.out.println(Principal.getEntradasPorVender());
		System.out.println(CompVen.getEntradasPorVender());
		System.out.println(VIP.getEntradasPorVender());		
		System.out.println("****************************************************");
		menu();
	}

	public static void vender() {
		System.out.println("¿De que sala quiere entradas");
		System.out.println("1- Zona principal.");
		System.out.println("2- Zona de Compra Venta.");
		System.out.println("3- Zona VIP.");
		System.out.println("");
		int choice = s.nextInt();
		while (choice <= 3 && choice > 0) {
			switch (choice) {
			case 1:
				System.out.println("¿Cuantas entradas?");
				cantidad = s.nextInt();
				if (cantidad <= 0) {
					System.out.println("No puede comprar menos de una entrada");
					vender();
				}
				Principal.vender(cantidad);
				System.out.println("");
				break;
			case 2:
				System.out.println("¿Cuantas entradas?");
				cantidad = s.nextInt();
				if (cantidad <= 0) {
					System.out.println("No puede comprar menos de una entrada");
					vender();
				}
				CompVen.vender(cantidad);
				System.out.println("");
				break;
			case 3:
				System.out.println("¿Cuantas entradas?");
				cantidad = s.nextInt();
				if (cantidad <= 0) {
					System.out.println("No puede comprar menos de una entrada");
					vender();
				}
				VIP.vender(cantidad);
				System.out.println("");
				break;
			default:
				System.out.println("Eso no es una opcción");
				System.out.println("");
				break;
			}
			menu();
		}

	}

	public static void menu() {
		int menuChoice;

		System.out.println("¿Que quiere hacer?");
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("");
		System.out.println("2. Vender entradas");
		System.out.println("");
		System.out.println("3. Salir");
		menuChoice = s.nextInt();

		switch (menuChoice) {
		case 1:
			Entradas();
			break;
		case 2:
			vender();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Eso no es una opcción");
			break;
		}
		menu();
	}

	public static void main(String[] args) {
		menu();
	}

}
