
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la frase: ");
		String frase= s.nextLine();
		
		String [] palab = frase.split(" ");
		List<String> masLarg = new ArrayList<String>();
		int minLeng = 0;
		for (int i = 0; i < palab.length; i++) {
			if (palab[i].length() >= minLeng && !masLarg.contains(palab[i])) { //Añade si supera el mínimo de longitud y la palabra no se repite
				masLarg.add(palab[i]); 
				minLeng = palab[i].length();
				
				for (int j = 0; j < masLarg.size(); j++) { //borra las anteriores palabras que no superen el mínimo de longitud
					String string = palab[j];
					if (string.length() < minLeng) {
						masLarg.remove(palab[j]);
					}
				}
			}
		}
		
		
		
		System.out.println("La palabra más larga tiene " + minLeng + " caracteres");
		System.out.println("las palabras son: ");
		System.out.println(masLarg);
	}

}
