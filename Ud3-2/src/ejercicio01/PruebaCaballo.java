package ejercicio01;

import java.util.Date;

public class PruebaCaballo {

	public static void main(String[] args) {
		Caballo Iridin = new Caballo("Iridin", "plateado", "azabache", "Shinafi", "macho", 5, new Date("2021/10/10") , false, false, false);
		Caballo asafag = new Caballo();
		asafag.setNombre("asafag");
		asafag.setRaza("Una");
		asafag.setCapa("palomizo");
		asafag.setVelocidad(2);
		
		System.out.println(Iridin);
		System.out.println(Iridin.getFechaNac());
		System.out.println("");
		
		Iridin.salta();
		System.out.println("Cebolla para Iridin");
		Iridin.rumia("Cebolla");
		Iridin.relincha();
		System.out.println("Heno para Iridin");
		Iridin.rumia("Heno");
		
		System.out.println("");
		System.out.println(Iridin.compite(asafag).getNombre());
	}

}