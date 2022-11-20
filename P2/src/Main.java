
public class Main {

	public static void main(String[] args) {
		
		AccesoBOODatos abd = new AccesoBOODatos();
		
		abd.conectar();
		//abd.datosIniciales();	
		
		System.out.println(abd.insertarPais(new Pais(2, "Suiza"))); // false
		System.out.println(abd.insertarPais(new Pais(5, "Aragón"))); // true
		//System.out.println(abd.buscarPais(5));
		//System.out.println(abd.borrarPais(5)); // true
		
	//	abd.imprimirJugadoresPais(6);
		abd.desconectar();
	}

}
