package ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
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
		
		
		
		public ArrayList <Socio> consultarTodos(){
			ArrayList <Socio>lista = new ArrayList<Socio> ();
		
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM socio");
				while (reg.next ()) {
					Socio libro= new Socio(reg.getInt (1), reg.getString (2), reg.getInt (3), reg.getInt(4),reg.getString(5));
					lista.add(libro);
			}
			consulta.close ();
			} catch (SQLException e) {
				return null;
			} 
			return lista;
			}
		
		public Socio consultarId(int numero){
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM socio WHERE socioID =" + numero);
				
				Socio socio = new Socio();
				if (reg.next ())	{
					
					socio.setSocioID(reg.getInt (1));
					socio.setNombre(reg.getString(2));
					socio.setEstatura(reg.getInt (3));
					socio.setEdad(reg.getInt(4));
					socio.setLocalidad(reg.getString(5));
			    }
				else
					socio=null;
			consulta.close ();
			return socio; 
			}
			catch (SQLException e) {
				System.out.println("error en la consulta"+e.getMessage());
			return null;
			}
			} //de consultarId
				
		//
		
		public ArrayList <Socio> consultarPorNombre(String titulo){
			ArrayList <Socio>lista = new ArrayList<Socio> ();
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM socio WHERE nombre LIKE '%" + titulo + "%'");
				//NOOOOOOOOOOOOOOOOOOOOOOOOOO HACER ESTO NUNCA
				// SOLO EN ESTE MOMENTO
				// UTILIZAREMOS SENTENCIAS PREPARADAS!!!!!!!!!!!!!!!!!
				
				while (reg.next ()) {
					Socio libro= new Socio(reg.getInt (1), reg.getString (2), reg.getInt (3), reg.getInt(4),reg.getString(5));
					lista.add(libro);
			}
			consulta.close ();
			return lista;
			}
			catch (SQLException e) {
				System.out.println("error en la consulta"+e.getMessage());
			return null;
			}
			} //de consultarporTitulo
	        //
			//
		
		public ArrayList <Socio> consultarPorLocalidad(String lugar){
			ArrayList <Socio>lista = new ArrayList<Socio> ();
			try {
				Statement consulta = conecta.createStatement();
				ResultSet reg = consulta.executeQuery ("SELECT * FROM socio WHERE localidad LIKE '%" + lugar + "%'");
				//NOOOOOOOOOOOOOOOOOOOOOOOOOO HACER ESTO NUNCA
				// SOLO EN ESTE MOMENTO
				// UTILIZAREMOS SENTENCIAS PREPARADAS!!!!!!!!!!!!!!!!!
				
				while (reg.next ()) {
					Socio libro= new Socio(reg.getInt (1), reg.getString (2), reg.getInt (3), reg.getInt(4),reg.getString(5));
					lista.add(libro);
			}
			consulta.close ();
			return lista;
			}
			catch (SQLException e) {
				System.out.println("error en la consulta"+e.getMessage());
			return null;
			}
			} //de consultarporLocalidad
	        //
			//
		
		public ResultSet consultarTodosResultSet() throws SQLException{
			Statement consulta = conecta.createStatement();
			return consulta.executeQuery ("SELECT * FROM socio");
		}
		
		public void imprimirDatos(ResultSet r) {
			int cont = 0;
			try {
				while(r.next()) {
					System.out.println(r.getInt (1) + r.getString (2) + r.getInt (3) + r.getInt(4) + r.getString(5));
					cont++;
					System.out.println(cont);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//
		public void desconectar() throws SQLException {
			if (conecta !=null) {
				conecta.close();
			}
		}
}
