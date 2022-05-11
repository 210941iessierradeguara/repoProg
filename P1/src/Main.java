import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		AccesoBdatos abd = new AccesoBdatos();
		try {
			abd.conectar();
			
			abd.librosEditorial("Gedisa");
			
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
