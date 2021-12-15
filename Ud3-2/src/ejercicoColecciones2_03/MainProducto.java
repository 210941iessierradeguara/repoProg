package ejercicoColecciones2_03;

import java.util.ArrayList;

public class MainProducto {

	public static void main(String[] args) {
		ArrayProducto lista = new ArrayProducto();
		Producto p1 = new Producto(0001, "p0001", "prod", 29.99, 10);
		Producto p2 = new Producto(0002, "p0002", "prod2", 19.99, 20);
		Producto p3 = new Producto(0003, "p0003", "prod2", 19.99, 20);
		
		lista.agregarProducto(p1);
		lista.agregarProducto(p2);
		lista.agregarProducto(p3);
		lista.tamanyoLista();
		System.out.println("********************************************");
		System.out.println(lista.buscarProducto(2));
		System.out.println("********************************************");
		System.out.println(lista.buscarCodigoProducto(0001));
		System.out.println("********************************************");
		lista.cambiarPrecio(0003, 56.84);
		System.out.println(lista.buscarCodigoProducto(0003));
		System.out.println("********************************************");
		lista.eliminarProductoCodigo(0002);
		lista.tamanyoLista();
	}

}