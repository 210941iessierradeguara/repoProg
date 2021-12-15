package ejercicioColecciones01;

public class CD {
	private final static int MAX = 100;
	  private Cancion [] _array;
	  private int _cont = 0;
	
	  public boolean llena() { return _cont == MAX; }

	  public boolean vacia() { return _cont == 0; }

	  public int numeroCanciones() { return _cont; }
	  
	  public Cancion dameCancion(int n) {return _array[n]; }
	  
	  public boolean grabaCancion(int n,  Cancion c) {
		  if(n <= MAX && n > 0) {
			  _array[n] = c;
			  return true;
		  }
		  return false;
	  }
	  
	  public boolean agrega(Cancion c) {
		  if(_cont == MAX) {return false;}
		    _array[_cont] = c;
		    _cont++;
		    return true;
	  }
	  
	  public boolean elimina(int n) {
		  if(n <= MAX && n > 0) {
			  _array[n] = null;
			  return true;
		  }
		  return false;
	  }
}
