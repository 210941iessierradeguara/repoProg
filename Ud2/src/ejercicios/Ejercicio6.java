package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {

		final double y=100;
		final double z=500;
		final double w=1000;

			System.out.print("Introduce la cantidad de agua en m3: ");
			double x= s.nextDouble();

			if (x<=100) {
				System.out.print(x+" m3 cuestan " +(x*0.15)+ " euros");
				System.exit(0);
			}

			if (x>100 && x<=500) {
				System.out.print(x+"m3 cuestan "+y*0.15+" + "+(x-y)*0.20 + " = " + ((y*0.15)+((x-y)*0.20)) +" euros");

				System.exit(0);
			}
			if (x>500 && x<=1000) {
				System.out.print(x +"m3 cuestan "+ y*0.15 +" + "+((z-y)*0.20) + "+" + ((x-z)*0.35) + " = " + ((y*0.15)+((z-y)*0.20)+((x-z)*0.35)) +" euros");

				System.exit(0);
			}
			if (x>1000) {
				System.out.print(x +"m3 cuestan "+ y*0.15 +" + "+((z-y)*0.20) + " + " + ((w-z)*0.35) + " + " + ((x-w)*0.80)+" = " + ((y*0.15)+((z-y)*0.20)+((w-z)*0.35)+((x-w)*0.80)) +" euros");

				System.exit(0);
		}

	}


}


/*
 * if (metros < 100) { double cobro1 = metros * 0.15; System.out.
 * printf("Su consumo está por debajo de los 100 m^3. Debe pagar: %.2f" + "€",
 * cobro1); System.exit(0); }
 * 
 * if (metros > 100 && metros < 500) { double cobro2 = metros * 0.20;
 * System.out.printf("Su consumo está entre los 100 y 500 m^3. Debe pagar: %.2f"
 * + "€", cobro2); System.exit(0); }
 * 
 * if (metros > 500 && metros < 1000) { double cobro3 = metros * 0.35;
 * System.out.
 * printf("Su consumo está entre los 500 y 1000 m^3. Debe pagar: %.2f" + "€",
 * cobro3); System.exit(0); }
 * 
 * if (metros > 1000) { double cobro4 = metros * 0.80; System.out.
 * printf("Su consumo está por encima de los 1000 m^3. Debe pagar: %.2f" + "€",
 * cobro4); System.exit(0); }
 */

}

