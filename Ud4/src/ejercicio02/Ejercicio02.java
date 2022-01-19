package ejercicio02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Ejercicio02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		LocalTime tiempo = LocalTime.now();
		LocalDate fecha = LocalDate.now();
		System.out.println("La fecha actual es: " + fecha);
		System.out.println("La hora actual es: " + tiempo);
		
		//Apartado A
		Date temp = new Date();
		int anyo = temp.getYear() + 1900;
		int mes = temp.getMonth() + 1;
		int diaM = temp.getDate();
		int dia = temp.getDay();
		int hora = temp.getHours();
		int mins = temp.getMinutes();
		int secs = temp.getSeconds();
		
		System.out.print("\n Año: " + anyo
				+ "\n mes: " + mes
				+ "\n dia del mes: " + diaM
				+ "\n dia de la semana: " + dia + " (0 = Domingo)"
				+ "\n hora: " + hora
				+ "\n minutos: " + mins
				+ "\n segundos: " + secs);
	}

}
