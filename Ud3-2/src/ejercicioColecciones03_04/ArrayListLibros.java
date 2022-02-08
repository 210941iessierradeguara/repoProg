package ejercicioColecciones03_04;
import java.util.HashSet;
import java.util.TreeSet;

// Repaso ArrayList

public class ArrayListLibros {
  // private final static int MAX = 100; no tiene sentido....
  private TreeSet<Libro> lista;
  
  public ArrayListLibros() {
    lista = new TreeSet<Libro>();
  }

 // public boolean llena() { return ... no tiene sentido }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }
  
  public boolean insertar(Libro p) {
    lista.add(p);
    return true;
  }
  
  public boolean eliminar(Libro l) {
	 return lista.remove(l);
  }
  
  public Libro buscar(String titulo) {
	  for(Libro l : lista) {
		  if(l.dameTitulo().toUpperCase().contains(titulo.toUpperCase())) {
			  return l;
		  }
	  }
	  return null;
  }
  
  public boolean contiene(Libro l) {
	  return lista.contains(l);
  }
  
 public String toString() {
	  String cad = lista.size() + " Elementos de la lista:\n\n";
	  for (Libro l: lista)
		  cad += l + "\n-----------------------------------------------\n";
	  return cad;
  }
 
  /*public String toString() {
	  String cad = lista.size() + " Elementos de la lista:\n\n";
	  Iterator it = lista.iterator(); 
	  while(it.hasNext()) {
		  cad += it.next() + "\n-----------------------------------------------\n";
	  }
	  return cad;
  }
  */
}