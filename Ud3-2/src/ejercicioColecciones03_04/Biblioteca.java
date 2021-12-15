package ejercicioColecciones03_04;

public class Biblioteca {
	private int cont = 0;
	private static int MAX = 15;
	Libro [] _array = new Libro [MAX];
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public static int getMAX() {
		return MAX;
	}

	public static void setMAX(int mAX) {
		MAX = mAX;
	}
	
	public Libro[] get_array() {
		return _array;
	}

	public void set_array(Libro[] _array) {
		this._array = _array;
	}

	public boolean insertarOrden(Libro p) {
		if (cont == MAX)
			return false;
		int i = 0;
		boolean encontrado = false;
		while ((i < cont) && (!encontrado)) {
			encontrado = (_array[i].getTitulo().compareToIgnoreCase(p.getTitulo())) > 0;
			if (!encontrado)
				i++;
		}
		for (int j = cont -1; j >= i; j--)
			_array[j + i] = _array[j];
		_array[i] = p;
		cont++;
		return true;
	}
	
	public boolean Eliminar(int n) {
		if ((n < 1) || (n> cont) || (cont == 0))
			return false;
		for (int i = n; i < cont; i++) 
			_array[i - 1] = _array[i];
		cont--;
		return true;
		
	}
	
}