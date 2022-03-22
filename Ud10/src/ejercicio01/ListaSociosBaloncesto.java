package ejercicio01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSociosBaloncesto {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		AccesoBDatos abd=new AccesoBDatos();
		//
		try {
			abd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("NO SE PUDO ESTABLECER CONEXIÓN");
			System.exit(-1);
		}

		ArrayList <Socio> todosSocios = abd.consultarTodos();
		if (todosSocios.size()!=0) {
			int cont = 0;
			System.out.println("Listado de todos los socios: ");
			for (Socio l : todosSocios) {
				 System.out.println(l);
				 cont++;
			}
			System.out.println("____________________________________________________________________________________");
			System.out.println("Hay " + cont + " Socios.");
		}
		else {
			System.out.println("Lista de todos los socios vacía");
		}
		
		System.out.println("\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		System.out.println("Introduzca una localidad [Escribir exactamente]: ");
		String lugar = s.next();
		
		
		ArrayList <Socio> lugarSocios = abd.consultarPorLocalidad(lugar);
		if (lugarSocios.size()!=0) {
			int cont = 0;
			System.out.println("Listado de todos los socios en: " + lugar);
			for (Socio l2 : lugarSocios) {
				 System.out.println(l2);
				 cont++;
			}
			System.out.println("____________________________________________________________________________________");
			System.out.println("Hay " + cont + " Socios en " + lugar);
		}
		else {
			System.out.println("Lista de todos los socios vacía");
		}
		
		// 
		
		abd.imprimirDatos(null);
		
		try {
			abd.desconectar();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR - NO SE LLEGÓ A ESTABLECER CONEXIÓN");
			System.exit(-1);
		}
	} //End main

} //End ListaSociosBaloncesto
