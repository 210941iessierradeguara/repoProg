package ejercicio08;

public class Revista extends Comun{
	private int numero;

	public Revista(int cod, String titulo, int anyoPub, int numero) {
		super(cod, titulo, anyoPub);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString().concat("Revista [numero=" + numero + "]");
	}
}
