package libros;

public class Libros {

	private String isbn;
	private String titulo;
	private String autor;
	private String numPag;
	private boolean prestado;

	public Libros() {

	}

	public Libros(String isbn, String titulo, String autor, String numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.prestado = false;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getNumPag() {
		return numPag;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public boolean prestar() {
		if (prestado) {
			return false;
		} else {
			prestado = true;
			return true;
		}
	}

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + ", prestado="
				+ prestado + "]";
	}

} // de la clase Libro
