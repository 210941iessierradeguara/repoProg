import java.util.ArrayList;

public class Banco {
	//Daniel Martínez Eito
	//PREGUNTAS A
	private ArrayList<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas = new ArrayList<Cuenta>();
	} 
	
	public void crearCuenta(Cuenta c) {
		listaCuentas.add(c);
	}
	
	public int tamanyo() {
		return listaCuentas.size();
	}
	
	public void mostrarCuentas() {
		for (int i = 0; i < listaCuentas.size(); i++) {
			System.out.println(listaCuentas.get(i));
		}
	}
	
	public boolean buscarCuentaPorNumero(long n) {
		for (int i = 0; i < listaCuentas.size(); i++) {
			if (listaCuentas.get(i).getNumero() == n) {
				return true;
			}
		}
		return false;
	}
	public boolean annadirCuenta(Cuenta C) {
		if (buscarCuentaPorNumero(C.getNumero())) {
			return false;
		} else {
			listaCuentas.add(C);
			return true;
		}
	}
	
//	PREGUNTAS B
	
	public double saldoMedio() {
		double sum = 0;
		if (tamanyo() == 0) {
			return 0;
		}
		
		for(int i = 0; i < listaCuentas.size(); i++) {
			sum = sum + listaCuentas.get(i).getSaldo();
		}
		return sum/listaCuentas.size();
	}
	
	public boolean existeCuenta(Cuenta c) {
		if (listaCuentas.contains(c)) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean borrarCuenta(Cuenta c) {
		if (!existeCuenta(c)) {
			return false;
		} 
		
		if(buscarCuentaPorNumero(c.getNumero())) {
			listaCuentas.remove(c);
			return true;
		} else {
			return false;
			}
	}
	
	public String buscarPorNombre (String n) {
		String a = "";
		for (int i = 0; i < listaCuentas.size(); i++) {
			if (listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())) {
				 a = a + listaCuentas.get(i) + "\n";
			}
		}
		return a;
	}
	
	public boolean ingreso (long numero, double cantidad) {
		if (!buscarCuentaPorNumero(numero)) {
			return false;
		}
		
		for (int i = 0; i < listaCuentas.size(); i++) {
			if (listaCuentas.get(i).getNumero() == numero) {
				listaCuentas.get(i).setSaldo(listaCuentas.get(i).getSaldo() + cantidad);
				return true;
			}
		}
		return false;
	}
}
