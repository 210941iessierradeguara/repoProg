package _01objetos;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class ExpocochesDAMConMetodosGraficos {
	static Scanner s = new Scanner(System.in);

	public static int menuPrincipal() {
		int opcion;
		String mensaje = "EXPOCOCHES DAM.  Elige una opción\n\n";
		mensaje = mensaje + "1. Mostrar número de entradas libres\n";
		mensaje = mensaje + "2. Vender entradas \n";
		mensaje = mensaje + "3. Salir\n";

		do {
			opcion= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		} while (opcion < 1 || opcion > 3);
		return opcion;
	} // de menuPrincipal

	public static int menuCompraEntradas() {
		int opcion;
		String mensaje = "1. Principal\n";
		mensaje = mensaje + "2. Compra-venta\n";
		mensaje = mensaje + "3. Vip\n";
		mensaje = mensaje + "Elige la zona para la que quieres comprar las entradas";
		do {
			opcion= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		} while (opcion < 1 || opcion > 3);
		return opcion;
	
	}// de menuCompraEntradas

	public static int numeroEntradas() {
		int opcion;
		do {
			opcion= Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas entradas quieres?"));
		} while (opcion <= 0);
		return opcion;

	} // de numeroEntradas
		//

	/**************************/
	public static void main(String[] args) {

		Zona principal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona(25);

		int opcion = 0;// Menu principal
		int opcion2 = 0; // Menu compra entradas
		int n = 0; // Número de entradas
		String mensaje;
		do {

			opcion = menuPrincipal();

			if (opcion == 1) {
				mensaje= "En la zona principal hay "+ principal.getEntradasPorVender() + "\n";
				mensaje= mensaje + "En la zona de compra venta hay " + compraVenta.getEntradasPorVender() + "\n";
				mensaje= mensaje + "En la zona vip hay " + vip.getEntradasPorVender();
				JOptionPane.showMessageDialog(null, mensaje, "Número de entradas", JOptionPane.INFORMATION_MESSAGE);
				
			}

			if (opcion == 2) {
				opcion2 = menuCompraEntradas();
				n = numeroEntradas();
				switch (opcion2) {
				case 1:
					principal.vender(n);
					break;
				case 2:
					compraVenta.vender(n);
					break;
				case 3:
					vip.vender(n);
					break;
				default:
				}
			}
		} while (opcion != 3); // Menú principal
		JOptionPane.showMessageDialog(null, "- F I N -","Fin del programa",JOptionPane.INFORMATION_MESSAGE );
	}
}
