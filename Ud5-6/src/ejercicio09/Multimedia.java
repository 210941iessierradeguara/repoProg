package ejercicio09;

import java.util.Objects;

public class Multimedia {
	private String titulo;
	private String autor;
	private String formato;
	private double duracion;
	
	public Multimedia(String titulo, String autor, String formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public boolean equals(Object obj) {
		Multimedia other = (Multimedia) obj;
		return (this.titulo.equalsIgnoreCase(other.getTitulo()) && this.autor.equalsIgnoreCase(other.getAutor()));
	}

	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
				+ "]";
	}
}