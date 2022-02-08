package ejercicioColecciones3_1;

public class MainArrayListLibros {

	public static void main(String[] args) {
		ArrayListLibros ll = new ArrayListLibros();
		Libro l1 = new Libro();
		l1.ponTitulo("Bas");
		l1.ponPaginas(45);
		Libro l2 = new Libro();
		l2.ponTitulo("Asa");
		l2.ponPaginas(500);
		
		System.out.println(l1.tituloComparator(l2));
		System.out.println(l1.paginaComaprator(l2));
	}

}
