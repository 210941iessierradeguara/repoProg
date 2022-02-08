package ejercicoColecciones2_03;

import java.util.ArrayList;

public class ArrayProducto {
	static ArrayList<Producto> lista;
	
	public ArrayProducto() {
		lista = new ArrayList<Producto>();
	}
	
	public void tamanyoLista() {
		System.out.println(lista.size());
	}

	public void agregarProducto(Producto p) {
		lista.add(p);
	}

	public Producto buscarProducto(int num) { //posicion
		if (num > lista.size() || num < 1 || lista.isEmpty() == true) {
			return null;
		} else {
			return lista.get(num-1);
		}
	}

	public Producto buscarCodigoProducto(int cod) { //codigo
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == cod);
			return lista.get(i);
		}
		return null;
	}

	public Producto eliminarProductoCodigo(int cod) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo() == cod);
			return lista.remove(i);
		}
		return null;
	}
	
	public void cambiarPrecio(int cod, double newPre) {
		for (int i = 0; i < lista.size(); i++) {
			if (buscarCodigoProducto(cod).equals(lista.get(i))) {
				lista.get(i).setPrecio(newPre);
			}
		}
	}

}