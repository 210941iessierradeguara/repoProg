package ejercicios;

public class EjercicioArrays04 {

	public static void main(String[] args) {
		char [] a = new char[10];
		a[0] = 'a';
		a[1] = 'x';
		a[4] = '@';
		a[6] = ' ';
		a[7] = '7';
		a[8] = 'Q';
		
		for(int i = 0; i < 9; i++) {
			System.out.println(a[i]);
		}
		
		//Los valores sin inicializar se imprimen vacios.

	}

}
