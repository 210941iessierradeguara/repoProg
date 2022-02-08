package pruebaErrores;

public class PruebaErrores {

	public static void main(String[] args) {
		int [] tabla = new int [10];
		int v;
		Integer x = null;
		try {
		tabla[9]=23;
		System.out.println("Línea 10");
		v = Integer.parseInt("2");
		//v = 90/0;
		v = 90/x;
		} catch (java.lang.NumberFormatException Nfe) {
			System.out.println("No se puede convertir a entero.");
		} catch(java.lang.IndexOutOfBoundsException Ioobe) {
		System.out.println("La casilla a la que intentas acceder no existe.");
		System.out.println(Ioobe.getMessage());
		System.out.println(Ioobe.getStackTrace());
		} catch(ArithmeticException AE) {
			System.out.println("No se puede dividir por 0");
		} catch (Exception e) {
			System.out.println("Se produjo un error inesperado");
			e.printStackTrace();
		} // finally {
//			System.out.println("Esto se ejecuta siempre");
//		}
		System.out.println("Línea 26");
	}
}

