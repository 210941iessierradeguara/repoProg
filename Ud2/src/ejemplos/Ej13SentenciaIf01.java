package ejemplos;

import java.util.Scanner;

/**
 * Sentencia if
 
 */

public class Ej13SentenciaIf01 {
  public static void main(String[] args) {   
    System.out.print("�Cu�l es la capital de Espa�a? ");
    Scanner s = new Scanner(System.in);
    String respuesta=s.nextLine();
    if (respuesta.equals("Madrid")) {
    	System.out.println("�Acertaste!");
    } else {
        System.out.println("Lo siento, es Madrid");
    }
  }
}
