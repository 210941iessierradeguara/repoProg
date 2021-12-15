package aceptaelreto;

import java.util.Scanner;

public class Relojenespejo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hora, minutos;
		
		System.out.println("¿Que hora ves?(Introduce dos enteros en el formato HH:MM de 12 horas): ");
		hora = s.nextInt();
		minutos = s.nextInt();
		
		int inverh=(6-hora)*2+hora , inverm=(30-minutos)*2+minutos;
		System.out.printf("%02d:%02d", inverh,inverm);

	}

}


//https://www.aceptaelreto.com/problem/statement.php?id=153&cat=4