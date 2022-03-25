package ejercicio02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBaDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
	private static String hostname = "localhost";
	private static String port = "3309";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	

	public Connection conecta;

		public void conectar() throws SQLException, ClassNotFoundException {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
		}
		
		//
		
		public String consultarLogin(String username, String pass){
			ArrayList <Usuario>lista = new ArrayList<Usuario> ();
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM usuario WHERE username LIKE '" + username + "' and password LIKE '" + pass + "'");
				
				if (reg.next()) {
					return reg.getString(3);
				} else {
					return "";
				}
			}
			catch (SQLException e) {
				return "";
			}
			} //de consultarLogin
		
		//
		public void desconectar() throws SQLException {
			if (conecta !=null) {
				conecta.close();
			}
		}
}
