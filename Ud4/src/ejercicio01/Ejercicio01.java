package ejercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio01 {
	static Scanner s = new Scanner(System.in);
	
	public static String diaTextFe(Fecha f1) {
		int Ftext = f1.diaSemana();
		@SuppressWarnings("unused")
		String dia;
		
		switch (Ftext) {
			case 0:
				return dia = "Domingo";
			case 1:
				return dia = "Lunes";
			case 2:
				return dia = "Martes";
			case 3:
				return dia = "Miercoles";
			case 4:
				return dia = "Jueves";
			case 5:
				return dia = "Viernes";
			case 6:
				return dia = "Sábado";
			default:
				return dia = "Inválido";
		}
	}
	
	public static String diaTextGre(GregorianCalendar c1) {
		int Ftext = c1.get(Calendar.DAY_OF_WEEK);
		@SuppressWarnings("unused")
		String dia;
		
		switch (Ftext) {
			case 0:
				return dia = "Domingo";
			case 1:
				return dia = "Lunes";
			case 2:
				return dia = "Martes";
			case 3:
				return dia = "Miercoles";
			case 4:
				return dia = "Jueves";
			case 5:
				return dia = "Viernes";
			case 6:
				return dia = "Sábado";
			default:
				return dia = "Inválido";
		}
	}
	
	public static String diaTextDat(Date d1) {
		@SuppressWarnings("deprecation")
		int Ftext = d1.getDay();
		@SuppressWarnings("unused")
		String dia;
		
		switch (Ftext) {
			case 0:
				return dia = "Domingo";
			case 1:
				return dia = "Lunes";
			case 2:
				return dia = "Martes";
			case 3:
				return dia = "Miercoles";
			case 4:
				return dia = "Jueves";
			case 5:
				return dia = "Viernes";
			case 6:
				return dia = "Sábado";
			default:
				return dia = "Inválido";
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		System.out.println("Introduzca el día: ");
		int dia = s.nextInt();
		System.out.println("Introduzca el mes: ");
		int mes = s.nextInt();
		System.out.println("Introduzca el año: ");
		int anyo = s.nextInt();
		String fecha = dia + "/" + mes + "/" + anyo;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Fecha f1 = new Fecha(dia, mes, anyo);
		GregorianCalendar c1 = new GregorianCalendar();
		c1.set(Calendar.YEAR, anyo);
		c1.set(Calendar.MONTH, mes - 1);
		c1.set(Calendar.DAY_OF_MONTH, dia - 1);
		Date d1 = formato.parse(fecha);
		LocalDate fechaLocal = LocalDate.of(anyo, mes, dia);
		DayOfWeek d2 = DayOfWeek.from(fechaLocal);
		
		System.out.println("Ese día corresponde a: ");
		System.out.println("Clase Fecha: " + f1.diaSemana());
		System.out.println("Clase Gregorian Calendar: " + c1.get(Calendar.DAY_OF_WEEK));
		System.out.println("Clase Date: " + d1.getDay());
		System.out.println("Java.time.DayOfWeek: " + d2);
	}

}
