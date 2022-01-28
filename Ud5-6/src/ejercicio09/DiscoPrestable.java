package ejercicio09;

public class DiscoPrestable extends Disco implements Prestable{
	private boolean prestado;

	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion, genero);
		this.prestado = false;
	}

	@Override
	public void prestar(DiscoPrestable d) {
		this.prestado = true;
	}

	@Override
	public void devolver(DiscoPrestable d) {
		this.prestado = false;
	}

	@Override
	public boolean prestado() {
		return this.prestado;
	}
}
