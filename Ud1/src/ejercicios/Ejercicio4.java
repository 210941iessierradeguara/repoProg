package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meses=12;
		int mes=8;
		double porcentaje;
		porcentaje = (double)mes / (double)meses * 100;
		
		System.out.println("Mes " + mes + " de " + meses);
		System.out.printf("Porcentaje del año trancurrido: %.4f ", porcentaje);
	}

}
