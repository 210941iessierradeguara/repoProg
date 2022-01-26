package ejercicio08;

public class Comun {
	private int cod;
	private String titulo;
	private int anyoPub;
	
	public Comun(int cod, String titulo, int anyoPub) {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.anyoPub = anyoPub;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyoPub() {
		return anyoPub;
	}

	public void setAnyoPub(int anyoPub) {
		this.anyoPub = anyoPub;
	}

	@Override
	public String toString() {
		return "Comun [cod=" + cod + ", titulo=" + titulo + ", anyoPub=" + anyoPub + "]";
	}
	
	
}
