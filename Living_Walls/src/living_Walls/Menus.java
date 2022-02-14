package living_Walls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {
	public static final Scanner s = new Scanner(System.in);
	public static int choices;
	public static int MenuPrinc() {
		do {
			System.out.println("\n");
//	        System.out.println("BlaGames©");
	        System.out.println("");
	        System.out.println("-----------------------");
	        System.out.println("     Menú Principal      ");
	        System.out.println("_______________________");
	        System.out.println();
	        System.out.println(" 1.      Iniciar        ");
	        System.out.println();
//	        System.out.println(" 2.     Load Game        ");
//	        System.out.println();
//	        System.out.println(" 3.      Settings        ");
//	        System.out.println();
//	        System.out.println(" 4.       Credits        ");
//	        System.out.println();
	        System.out.println(" 2.     Exit Game        ");
	        System.out.println();
	        System.out.print(" Make a Selection: ");
	        System.out.println();
	        System.out.println();
	        System.out.println();
	        try {
	        	choices = s.nextInt();
	        	switch (choices) {
	        	case 1:
	        		switch(crearPj()) {
	        			case 1:
	        				return 1;
	        		}
	        		break;
	        	case 2:
	        		System.exit(0);
	        		break;
	        	default:
	        		MenuPrinc();
	        		break;
	        }
	        } catch (InputMismatchException ime) {
	        	System.out.println("opción invalida");
	        }
	        s.next(); //Limpia el buffer. Evita loop
	        
		} while (choices != 1 || choices != 2);
	        return 1;
    }
	
	public static int crearPj() {
		do {
		
		System.out.println("Selecciona un clase: ");
		System.out.println("1- Exiliado");
		
		try {
			choices = s.nextInt();
			switch(choices) {
			case 1:
				System.out.println("Exiliado a la capital errante por mostrar signos "
						+ "de estar afectado por la podradumbre, los guardias completamente "
						+ "envueltos en mantas y máscaras te arrastraron hasta las puertas de "
						+ "la gigantesca capital, temblabas, y ahora que la vagas en solitario "
						+ "poco ha cambiado, la sensación es ser vigilado, el temor de que cada "
						+ "día la podredumbre puede acabar contigo siempre está presente, cada "
						+ "paso que das es menos tiempo que viviars, cada fragmento de esta corroida "
						+ "ciudad que destruyes hace retroceder la podredumbre.");
				System.out.println("¿Seguro que quieres ser un exilidado?");
				System.out.println("1- Si");
				System.out.println("2- No");
				choices = s.nextInt();
				//
				switch(choices) {
				case 1:
					return 1;
				case 2:
					Main_Walls.main(null);
					break;
				default:
					System.out.println("Opción no valida");
					break;
				}
				// confirmación
				break;
			default:
				System.out.println("Opción no valida");
				break;
			
			}
		} catch (InputMismatchException ime) {
			System.out.println("Opción no valida.");
		}
		s.next();
		} while (choices != 1);
		return 1;
	}
	
	public static int menuPelea(Player p) {
		choices = 0;
		do {
		System.out.println("¿Que vas a hacer?");
		System.out.println("1- Atacar");
		System.out.println("2- Defenderse");
		System.out.println("3- Observar al enemigo");
		System.out.println("4- Inventario");
		System.out.println("5- Canalizar podredumbre.");
		try {
		choices = s.nextInt();
		
			if((choices == 5 && !p.isAberration())) {
				System.out.println("No eres una aberreción, esta tarea");
				System.out.println("es imposible para tí.");
				menuPelea(p);
			}
			return choices;
			
		} catch(java.util.InputMismatchException ime) {
			System.out.println("Fallo al introducir la elección.");
		}
		s.next();
		
		} while ((choices != 1 || choices != 2 || choices != 3 || choices != 4 || choices != 5));
		return choices;
	}
	
	public static void menuMov(Player p) {
		do {
		if (Sector.esNort() == true) {
			System.out.println("1- Norte");
		}
		if (Sector.esSur() == true) {
			System.out.println("2- Sur");
		}
		if (Sector.esEst() == true) {
			System.out.println("3- Este");
		}
		if (Sector.esOes() == true) {
			System.out.println("4- Oeste");
		}
		
		try {
			System.out.println("¿A donde ir?");
			choices = s.nextInt();
		
			if(choices == 1 && Sector.esNort()) {
				p.setCurrY(p.getCurrY() + 1);
				p.setPutridPoints(p.getPutridPoints() + 1);
			} else if(choices == 2 && Sector.esSur()) {
				p.setCurrY(p.getCurrY()-1);
				p.setPutridPoints(p.getPutridPoints() + 1);
			} else if(choices == 3 && Sector.esEst()) {
				p.setCurrY(p.getCurrX()+1);
				p.setPutridPoints(p.getPutridPoints() + 1);
			} else if(choices == 4 && Sector.esOes()) {
				p.setCurrY(p.getCurrX()-1);
				p.setPutridPoints(p.getPutridPoints() + 1);
			}
		} catch (java.util.InputMismatchException ime) {
			System.out.println("Opción no valida");
			s.next(); //evita bucles
		}
		
		
		} while (choices < 1 || choices > 4);
	}
	
	public static void menuFuent(Player p, Room [][] d) {
		do {
			System.out.println("En la fuente quedan " + d[p.getCurrX()][p.getCurrY()].getNumCur() + " curaciones.");
			if (Sector.esNort() == true) {
				System.out.println("1- Norte");
			}
			if (Sector.esSur() == true) {
				System.out.println("2- Sur");
			}
			if (Sector.esEst() == true) {
				System.out.println("3- Este");
			}
			if (Sector.esOes() == true) {
				System.out.println("4- Oeste");
			}
			try {
				System.out.println("5- Beber de la fuente");
				System.out.println("6- Descansar [+4 puntos de podredumbre]");
				System.out.println("7- Inventario");
				System.out.println("8- Salir de la sesión");
				System.out.println("¿Que hacer?");
				choices = s.nextInt();

				switch (choices) {
					case 1:
						if(choices == 1 && Sector.esNort()) {
							p.setCurrY(p.getCurrY() + 1);
							p.setPutridPoints(p.getPutridPoints() + 1);
						}
						break;
					case 2:
						if(choices == 2 && Sector.esSur()) {
							p.setCurrY(p.getCurrY()-1);
							p.setPutridPoints(p.getPutridPoints() + 1);
						}
						break;
					case 3:
						if(choices == 3 && Sector.esEst()) {
							p.setCurrY(p.getCurrX()+1);
							p.setPutridPoints(p.getPutridPoints() + 1);
						}
						break;
					case 4:
						if(choices == 4 && Sector.esOes()) {
							p.setCurrY(p.getCurrX()-1);
							p.setPutridPoints(p.getPutridPoints() + 1);
						}
						break;
					case 5:
						if (d[p.getCurrX()][p.getCurrY()].getNumCur() <= 0) {
							System.out.println("Lamentablemente no queda uso alguno en esta fuente");
						}else {
						d[p.getCurrX()][p.getCurrY()].setNumCur(d[p.getCurrX()][p.getCurrY()].getNumCur() - 1);
						p.setHp(p.getHp() + Dices.Ten());
						}
						break;
					case 6:
						p.Rest();
						break;
					case 7:
						p.Stats();
						break;
					case 8:
						System.exit(0);
						break;
				}
			} catch (java.util.InputMismatchException ime) {
				System.out.println("Opción no valida");
				s.next();
			}
		}while(choices < 1 || choices > 6);
	}
	
	public static void menuMuert() {
		System.out.println("En tu enfrentamiento pereces, un golpe de suerte por parte de la podredumbre.");
		System.out.println("Tu inerte cuerpo poco a poco es consumido por la podredumbre, no muchos días despues, un exiliado acaba contigo");
		System.out.println("****La ciudad avanza****");
		System.out.println("***Las murallas viven***");
		Main_Walls.main(null);
	}
}
