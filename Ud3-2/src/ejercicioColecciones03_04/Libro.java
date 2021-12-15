package ejercicioColecciones03_04;

import java.util.Date;

import _01objetos.Persona;
import _02colecciones1.Fecha;
import _02colecciones1.MyInput;
import libros.Libros;

public class Libro {
	private String titulo;
	private Persona autor;
	private int ISBN;
	private int Paginas;
	private int Edicion;
	private String editorial;
	private String lugar;
	private String pais;
	private Fecha fecha;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Persona getAutor() {
		return autor;
	}
	public void setAutor(Persona autor) {
		this.autor = autor;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	public int getEdicion() {
		return Edicion;
	}
	public void setEdicion(int edicion) {
		Edicion = edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	public Libro() {
		
	}
	
	public Libro(String titulo, Persona autor, int iSBN, int paginas, int edicion, String editorial, String lugar, String pais, Fecha fecha) {
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		Paginas = paginas;
		Edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.pais = pais;
		this.fecha = fecha;
	}
	
	public void mostrarInfo(Libro lib) {
		System.out.println("Título: " + this.getTitulo());
		System.out.println(this.getEdicion() + "ª edición");
		System.out.println("Autor: " + this.autor.dameApellidos() + ", " + this.autor.dameNombre());
		System.out.println("ISBN: " + this.getISBN());
		System.out.println(this.getLugar() + " (" + this.getPais() + ") " + this.getFecha());
		System.out.println(this.getPaginas() + " páginas");
	}

	public void leer() {
		System.out.println("Titulo: ");
		titulo = MyInput.readString();
		System.out.println("Autor: ");
		autor.leer();
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + Edicion + "ª Edición" + 
				"\n" + "Autor: " + autor.dameApellidos() + ", " + autor.dameNombre() + "\n" + "ISBN: " + ISBN + "\n"
				+ lugar + " " + "(" + pais + ")" + " " + fecha + "\n"
				+ Paginas + " páginas";
	}
	
	public String toStringVacio() {
		return "Titulo: " + titulo + "\n" + Edicion + "ª Edición" + 
				"\n" + "Autor: " + "\n" + "ISBN: " + ISBN + "\n"
				+ lugar + " " + "(" + pais + ")" + " " + fecha +"\n"
				+ Paginas + " páginas";
	}
}
