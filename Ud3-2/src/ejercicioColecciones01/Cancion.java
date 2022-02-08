package ejercicioColecciones01;

public class Cancion {
	private String titulo;
	private String autor;
	
	
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Cancion() {
		
	}

	public Cancion(String titulo) {
		super();
		this.titulo = titulo;
	}

	public String dameTitulo() {
		return titulo;
	}

	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String dameAutor() {
		return autor;
	}

	public void ponAutor(String autor) {
		this.autor = autor;
	}
	
}
