
public class Main {

	public static void main(String[] args) {
		
		AccesoBOODatos abd = new AccesoBOODatos();
		
		abd.conectar();
		
		// Una vez ejecutado el método datosIniciales
		// comentarlo para que no se vuelva a ejecutar
		
		//abd.datosIniciales();	
		
		System.out.println(abd.borrarPais(1));
	
		abd.desconectar();
	}

}
