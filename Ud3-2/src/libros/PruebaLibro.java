package libros;

public class PruebaLibro {
	
	public static void main(String[] args) {
		Libros l1 = new Libros();
		l1.setAutor("A");
		Libros l2 = new Libros("1234", "B", "C", "200");
		System.out.println(l2);
	}

}
