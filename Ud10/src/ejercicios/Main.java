package ejercicios;

import java.sql.SQLException;

public class Main {
	static AccesoBdatos abd = new AccesoBdatos();
	
	public static void main(String[] args) {
		try {
			abd.conectar();
			
			System.out.println(abd.busquedaPorCodigo(7788));
			
			abd.desconectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
