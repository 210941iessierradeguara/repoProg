
import java.sql.*;
import java.util.ArrayList;


public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "libros10mayo2022";
    private static String hostname = "localhost";
    private static String port = "3309";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
    private Connection conecta;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		
		conecta = null; // = conecta.close();
	}
	//
	//
	public void librosEditorial(String editorial) {
		
	//	Statement consulta = conecta.createStatement();
		
		
		
//		ArrayList <Libro>lista = new ArrayList<Libro>();
		try {
			Statement consulta = conecta.createStatement();
			PreparedStatement prep = conecta.prepareStatement("SELECT ISBN, Titulo, Autor FROM libros WHERE Editorial LIKE ? ");
			prep.setString(1, editorial);
	
			ResultSet reg2 = prep.executeQuery();
			
			while (reg2.next()) {
				System.out.println(reg2.getString(1));
				System.out.println(reg2.getString(2));
				System.out.println(reg2.getString(3));
				System.out.println("");
			}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//
	//
}// De la clase AccesoBdatos