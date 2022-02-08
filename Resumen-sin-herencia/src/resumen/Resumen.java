package resumen;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Resumen {
static Scanner s=new Scanner (System.in);

public static void main(String[] args) {
// TODO Auto-generated method stub

System.out.println("Introduce el dia(dd): ");
int d=s.nextInt();
System.out.println("Introduce el mes(mm): ");
int m=s.nextInt();
System.out.println("Introduce el año(yyyy): ");
int a=s.nextInt();

GregorianCalendar Fecha =new GregorianCalendar();
//Fecha.getTime();
Fecha.set(Calendar.YEAR, a);
Fecha.set(Calendar.MONTH, m-1);
Fecha.set(Calendar.DAY_OF_MONTH, d);
System.out.println("Dia de la semana: " + (Fecha.get(Calendar.DAY_OF_WEEK)-1));
//-----------------------------------------------------------------------------

StringTokenizer nombre = new StringTokenizer("Daniel Martinez Eito");
while (nombre.hasMoreTokens()) {
System.out.println(nombre.nextToken());
}

String nombre2= "Daniel Martinez Eito";
String [] x= nombre2.split(" ");

System.out.println();

for (String trozo : x) {
System.out.println(trozo);
}
//-----------------------------------------------------------------------------

String texto = "Hola buenas tardes, esto es boulder FM.";
String buscar = "boulder";
String reemplazar ="piedra";

System.out.println("Texto sin reemplazar: "+ texto);

texto = texto.replaceAll(buscar, reemplazar);

System.out.println();
System.out.println("Texto reemplazado: "+ texto);
//-----------------------------------------------------------------------------

String frase, palabra;
int veces=0,pos;
System.out.println("Introduce la frase:");
frase= s.nextLine();

System.out.println("Introduce la palabra:");
palabra= s.nextLine();

pos=frase.indexOf(palabra);
while (pos != -1) {
veces++;
pos=frase.indexOf(palabra,pos+palabra.length());
}
System.out.println("La palabra "+palabra+ " se ha encontrado "+veces+" veces.");
//-----------------------------------------------------------------------------

System.out.println("Introduce la primera palabra:");
String palabra1= s.next().toLowerCase();

System.out.println("Introduce la segunda palabra:");
String palabra2= s.next().toLowerCase();

char [] s1=palabra1.toCharArray();
char [] s2=palabra2.toCharArray();

Arrays.sort(s1);
Arrays.sort(s2);

if (Arrays.equals(s1, s2))
System.out.println("Las palabras introducidas son anagramas");
else
System.out.println("Las palabras introducidas no son anagramas");

}

}