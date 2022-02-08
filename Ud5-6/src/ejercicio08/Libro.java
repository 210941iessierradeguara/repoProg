package ejercicio08;

public class Libro extends Comun implements Prestable{
	private boolean prestado;

	public Libro(int cod, String titulo, int anyoPub, boolean prestado) {
		super(cod, titulo, anyoPub);
		this.prestado = false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		return super.toString().concat("Libro [prestado=" + prestado + "]");
	}

	@Override
	public void prestar(Libro l) {
		this.prestado = true;
	}

	@Override
	public void devolver(Libro l) {
		this.prestado = false;
	}

	@Override
	public boolean prestado() {
		return this.prestado;
	}
	
	
}
