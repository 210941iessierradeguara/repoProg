/*
 * Revisado para versi�n 8.19 de MySQL 
 * Alberto Carrera Mart�n
 * 29 febrero 2020
 */
package ejercicio04;
import java.sql.*;
import java.util.ArrayList;

import ejercicio01.Socio;
public class AccesoBdatos {
private static String driver = "com.mysql.cj.jdbc.Driver";
private static String database = "baloncesto";
private static String hostname = "localhost";
private static String port = "3309";
private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
private static String username = "root";
private static String password = "root";

// NUNCA CONECTARSE CON USUARIO ROOT!!!!!!!!!!!!!!!!!!!
// SOLO PARA PRUEBAS!!!!!!!

public Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public ArrayList <Socio> consultarTodos(){
		ArrayList <Socio>lista = new ArrayList<Socio> ();
	
		try {
			PreparedStatement prSt = conecta.prepareStatement("SELECT * FROM socio");
//			Statement consulta = conecta.createStatement();
			ResultSet reg = prSt.executeQuery ();
			while (reg.next ()) {
				Socio socio= new Socio(reg.getInt(1),reg.getString(2),reg.getInt(3),reg.getInt(4),reg.getString(5));
				lista.add(socio);
		}
		prSt.close ();
		} catch (SQLException e) {
			return null;
		} 
		return lista;
		}
	
	public ArrayList <Socio> consultarPorLocalidad(String Localidad){
		ArrayList <Socio>lista = new ArrayList<Socio> ();
		try {
			PreparedStatement prSt = conecta.prepareStatement("SELECT * FROM socio WHERE localidad LIKE ?");
			prSt.setString(1, Localidad);
//			Statement consulta = conecta.createStatement();
			ResultSet reg = prSt.executeQuery ();
			
			while (reg.next ()) {
				Socio socio= new Socio(reg.getInt(1),reg.getString(2),reg.getInt(3),reg.getInt(4),reg.getString(5));
				lista.add(socio);
		}
		prSt.close ();
		return lista;
		}
		catch (SQLException e) {
			System.out.println("error en la consulta"+e.getMessage());
		return null;
		}
		} //consultarporLocalidad
        //
	
	public ResultSet consultarPorLocalidadResultSet(String Localidad) throws SQLException{
		PreparedStatement prSt = conecta.prepareStatement("SELECT * FROM socio WHERE localidad LIKE ?");
		prSt.setString(1, Localidad);
//		Statement consulta = conecta.createStatement();
		ResultSet reg = (prSt.executeQuery ());
		prSt.close();
		
		return reg;
	}
	
	public ResultSet consultarTodosResultSetSocios() throws SQLException{
		PreparedStatement prSt = conecta.prepareStatement("SELECT * FROM socio");
//		Statement consulta = conecta.createStatement();
		ResultSet reg =(prSt.executeQuery ());
		prSt.close();
		
		return reg;
	}
	
	//
	public void desconectar() throws SQLException {
		if (conecta !=null) {
			conecta.close();
		}
	}
}