package varios;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PlaceHolder {
	static Scanner s = new Scanner(System.in);
	public static int playerHP;
	public static int maxPlayerHP;
	public static String playerClass;
	public static String playerWeapon = "Ninguna";
	public static String playerDisWeapon = "Ninguna";
	public static int playerDmg;
	public static int playerDisDmg = 0;
	public static int typeDmg; // 1 para perforante, 2 para cortante, 3 para contundente
	public static int atkBonus;
	public static int ammunition;
	public static String playerArmor;
	public static int playerAC;
	public static int bonusAC;
	public static int totalAC; // Hay que declarar el playerAC +bonusAC en las clases, aquí no se puede.
	public static int galeones;
	public static boolean stealthDis = false; // en caso de usar x armaduras tienes desventaja en sigilo
	public static int SpellSlots;
	public static int MaxSpellSlots;
	public static int SpellBonus;
	public static int choice;
	public static int EnemyHP;
	public static int EnemyAC;
	public static int EnemyDmg;
	public static int xp;
	public static int level;
	public static boolean fighting = false;
	public static String Day = "Es de noche";
	public static int isDay = 0;
	public static boolean terminada = false; // la subasta
	public static boolean devotado = false; // Bufo de deidad

	static List<String> inv = new ArrayList<String>(); // https://stackoverflow.com/questions/22364768/inventory-system-for-a-text-based-adventure-game-in-java

	public static void clase() {
		Scanner s = new Scanner(System.in);
		System.out.println("Elige tu clase: ");
		System.out.println("1- para Guerrero.");
		System.out.println("2- para Mago.");
		System.out.println("3- para Bardo.");
		System.out.println("4- para Vagabundo.");
		System.out.println("5- para Landsknecht Crigiolano.");
		int eleccion = s.nextInt();

		switch (eleccion) {
		case 1:
			StatsWarrior();
			galeones = 10;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Florete [1d8 perforante] y daga velera[+1 AC]");
			System.out.println("2- Espada larga [1d10 cortante]");
			System.out.println("3- Espada de armas [1d6 cortante] y ecudo heraldico [+2 AC]");
			System.out.println("4- Maza [1d8 contundente]");
			System.out.println("5- Alabarda [2d6 cortante]");
			int starterWeapon = s.nextInt();
			switch (starterWeapon) {
			case 1:
				playerWeapon = "Florete [1d8 perforante]";
				playerDmg = (int) (1 + (Math.random() * 9));
				typeDmg = 1;
				bonusAC = 1;
				totalAC = playerAC + bonusAC;
				break;
			case 2:
				playerWeapon = "Espada Larga [1d10 cortante]";
				playerDmg = (int) (1 + (Math.random() * 11));
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "Espada de armas [1d6 cortante]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 2;
				bonusAC = 2;
				totalAC = playerAC + bonusAC;
				break;
			case 4:
				playerWeapon = "Maza [1d8 contundente]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 3;
				break;
			case 5:
				playerWeapon = "Alabarda [2d6 cortante]";
				playerDmg = (int) (1 + (Math.random() * 7) + (1 + (Math.random() * 7)));
				typeDmg = 2;
				break;
			default:
				System.out.println("Eso no es una opción");
				clase();
				break;
			} // End starterWeapon warrior
			break; // End Warrior
		case 2:
			StatsWizard();
			galeones = 20;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Bastón [1d6 contundente]");
			System.out.println("2- Daga [1d4 cortante]");
			System.out.println("3- Foco Arcano [+4 a los hechizos]");
			System.out.println("4- ballesta de mano [1d8 perforante] y 20 virotes");
			starterWeapon = s.nextInt();
			switch (starterWeapon) {
			case 1:
				playerWeapon = "bastón [1d6 contundente]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 3;
				break;
			case 2:
				playerWeapon = "Daga [1d4 cortante]";
				playerDmg = (int) (1 + (Math.random() * 5));
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "Foco arcano [+4 a los hechizos]";
				playerDmg = (int) (1);
				SpellBonus = SpellBonus + 4;
				typeDmg = 3;
				break;
			case 4:
				playerDisWeapon = "Ballesta de mano [1d8 perforante]";
				playerDisDmg = (int) (1 + (Math.random() * 9));
				playerDmg = 1;
				typeDmg = 3;
				ammunition = 20;
				break;
			default:
				System.out.println("Eso no es una opcción");
				clase();
				break;

			}// End starterWeapon wizard

			break; // End wizard
		case 3:
			StatsBard();
			galeones = 30;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Florete [1d8 perforante]");
			System.out.println("2- Alfanje [1d8 cortante]");
			System.out.println("3- Látigo [2d4 perforante]");
			System.out.println("4- Cuchillo [1d6 costante] y Daga Velera [+1AC]");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Florete [1d8 perforante]";
				playerDmg = roll8();
				typeDmg = 1;
				break;
			case 2:
				playerWeapon = "Alfanje [1d8 cortante]";
				playerDmg = roll8();
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "Látigo [2d4 cortante]";
				playerDmg = roll4() + roll4();
				typeDmg = 2;
				break;
			case 4:
				playerWeapon = "Cuchillo [1d6 cortante]";
				playerDmg = roll6();
				typeDmg = 2;
				bonusAC = 1;
				totalAC = playerAC + bonusAC;
				break;
			default:
				System.out.println("Eso no es una opcción");
				clase();
				break;
			}// End stater Weapon Bard
			break; // End Bard
		case 4:
			StatsHobo();
			galeones = 0;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Garrote [1d6 Contundente]");
			System.out.println("2- Cuchillo Maltrecho [1d4 Cortante]");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Garrote [1d6 Contundente]";
				playerDmg = roll6();
				typeDmg = 3;
				break;
			case 2:
				playerWeapon = "Cuchillo Maltrecho [1d4 cortante]";
				playerDmg = roll6();
				typeDmg = 2;
				break;
			default:
				System.out.println("Eso no es una opcción");
				clase();
				break;
			} // End starter weapon Hobo
			break;
		case 5:
			StatsLandsknecht();
			galeones = 25;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Zweihander [1d12 cortante]");
			System.out.println("2- Pica [1d10 perforante]");
			System.out.println("3- Messer [1d6 cortante] y escudo de brazo Crigiolano [+1 AC]");
			System.out.println("4- Ballesta pesada con cranequin [1d10 perforante] y daga de rondel [1d4 perforante]");
			inv.add("Pluma y sombrero Crigiolano");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Zweihander [1d12 cortante]";
				playerDmg = roll12();
				typeDmg = 2;
				break;
			case 2:
				playerWeapon = "Pica [1d10 perforante]";
				playerDmg = roll10();
				typeDmg = 1;
				break;
			case 3:
				playerWeapon = "Messer [1d6 cortante]";
				playerDmg = roll6();
				bonusAC = 1;
				typeDmg = 2;
				totalAC = playerAC + bonusAC;
				break;
			case 4:
				playerWeapon = "daga de rondel [1d4 perforante]";
				playerDisWeapon = "Ballesta pesada con cranequin [1d10 perforante]";
				playerDisDmg = roll10();
				playerDmg = roll4();
				typeDmg = 1;
				ammunition = 20;
				break;
			default:
				System.out.println("Eso no es una opcción");
				clase();
				break;
			}

			break; // End staterweapon landsknecht Crigiolano
		default:
			System.out.println("Eso no es un opcción");
			clase();
			break;
		}// End selección

	} // End class selection

	public static void StatsWarrior() {
		playerClass = "Guerrero";
		playerHP = (int) (1 + (Math.random() * 10)) + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Cota de placas";
		atkBonus = 3;
		stealthDis = true;
		playerAC = 14;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	} // End StatsWarrior

	public static void StatsWizard() {
		playerClass = "Mago";
		playerHP = (int) (1 + (Math.random() * 6)) + 4;
		maxPlayerHP = playerHP;
		playerArmor = "Gambesón";
		playerAC = 11;
		totalAC = playerAC + bonusAC;
		atkBonus = 0;
		SpellSlots = 5;
		MaxSpellSlots = 5;
		xp = 0;
		level = 1;
	}// End StatsWizard

	public static void StatsBard() {
		playerClass = "Bardo";
		playerHP = roll8() + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Brigantina";
		atkBonus = 3;
		playerAC = 13;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	}

	public static void StatsHobo() {
		playerClass = "Vagabundo";
		playerHP = roll6() + 3;
		maxPlayerHP = playerHP;
		playerArmor = "Nada";
		atkBonus = 2;
		playerAC = 9;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	}

	public static void StatsLandsknecht() {
		playerClass = "Landsknecht Crigiolano";
		playerHP = roll10() + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Coraza";
		atkBonus = 3;
		playerAC = 16;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	} // End StatsLandsknecht

	public static void longRest() {
		playerHP = maxPlayerHP;
		SpellSlots = MaxSpellSlots;
		DayCycle();
	}

	public static void DayCycle() {
		if (isDay % 2 == 0) {
			Day = "Es de día";
			isDay++;
		} else {
			Day = "Es de noche";
			isDay++;
		}
	}

	public static void enemies(int e) {
		switch (e) {
		case 1: // acólito del Sol melee.
			EnemyHP = (int) (1 + (Math.random() * 10) + 3);
			EnemyAC = 11;
			EnemyDmg = (int) (1 + (Math.random() * 9));
			break;
		case 2: // mago del sol
			EnemyHP = (int) (1 + (Math.random() * 6));
			EnemyAC = 9;
			EnemyDmg = roll12();
			break;
		case 3: // Elegido del Sol
			EnemyHP = roll20() + 10;
			EnemyAC = 15;
			EnemyDmg = (roll12() + roll6());
			break;
		case 4: // Guarda Uni
			EnemyHP = roll6() + 10;
			EnemyAC = 14;
			EnemyDmg = (roll6() + roll6());
			break;
		} // End switch e.

	}

	public static void enemies2(int e) {
		switch (e) {
		case 1: // Ratero de los callejones
			EnemyHP = roll8() + 5;
			EnemyAC = 12;
			EnemyDmg = roll6();
			break;
		}
	}

	public static void beasts(int e) {
		switch (e) {
		case 1: // Hombre Lobo
			EnemyHP = roll8() + roll8() + roll8() + roll8() + 18;
			EnemyAC = 13;
			EnemyDmg = roll4() + roll4() + roll8() + 5;
			break;
		}
	}

	public static void SolarBeasts(int e) {
		switch (e) {
		case 1: // Sabueso Solar
			EnemyHP = roll8() + roll8() + 11;
			EnemyAC = 14;
			EnemyDmg = roll6() + roll6() + roll6() + roll6() + roll6() + roll6();
			break;
		}
	}

	public static void ataque() {
		if (roll20() + atkBonus < EnemyAC) {
			System.out.println("Tu ataque ha fallado.");
			if (roll20() < totalAC) {
				System.out.println("El ataque enemigo ha fallado.");
			}
		} else {
			EnemyHP = EnemyHP - playerDmg;
			playerHP = playerHP - EnemyDmg;
			System.out.println(
					"Atacas al enemigo, pero en el proceso también sufres daños. Tu HP actual es: " + playerHP);
			if (playerHP <= 0) {
				muerte();
			}
			if (EnemyHP <= 0) {
				fighting = false;
			}
		} // final else ataque
	}

	public static void ataqueDistancia() {
		if (roll20() + atkBonus < EnemyAC) {
			System.out.println("Tu ataque ha fallado");
			ammunition = ammunition - 1;
		} else {
			if (ammunition > 0) {
				EnemyHP = EnemyHP - playerDisDmg;
				ammunition = ammunition - 1;
				System.out.println("Disparas tu ballesta hiriendo a tu enemigo.");
				if (playerHP <= 0) {
					muerte();
				}
				if (EnemyHP <= 0) {
					fighting = false;
				}
			} else {
				System.out.println("No te queda munición que disparar.");
			}
		}
	}

	public static void defensa() {
		if (roll20() < playerAC + 4) {
			System.out.println("Adoptas una pose defensiva y evitas sufrir daño alguno.");
		} else {
			playerHP = playerHP - EnemyDmg;
			System.out.println("El enemigo consigue superar tu defensa. Tu HP actual es: " + playerHP);
			if (playerHP <= 0) {
				muerte();
			}
		}
	}

	public static void observar() {
		if (EnemyHP > (EnemyHP / 4) * 3) {
			System.out.println("El enemigo aparenta estar en buenas condiciones");

		} else {
			if (EnemyHP > (EnemyHP / 4) * 2) {
				System.out.println("El enemigo aparenta esta bapuleado, pero lo suficiente para seguir peleando.");
			} else {
				if (EnemyHP > (EnemyHP / 4) * 1) {
					System.out.println("El enemigo se ve terriblemente herido.");
				}
			}
		}
	}

	public static void muerte() {
		System.out.println("Tus esfuerzos has resultado futiles al final.");
		System.out.println("Al menos lo intentaste...");
		System.out.println("***EL SOL HA MUERTO***");
		System.exit(0);
	}

	public static void fight(int f) {
		Scanner s = new Scanner(System.in);
		fighting = true;
		System.out.println("Adoptas una posición de combate frente a tu enemigo.");
		enemies(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opción");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opción");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 25;
		}

		checkLvl();
	}

	public static void fight2(int f) {
		Scanner s = new Scanner(System.in);
		fighting = true;
		System.out.println("Adoptas una posición de combate frente a tu enemigo.");
		enemies2(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opción");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opción");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 25;
		}

		checkLvl();
	}

	public static void fightBeast(int f) {
		Scanner s = new Scanner(System.in);
		fighting = true;
		System.out.println("Adoptas una posición de combate frente a tu enemigo.");
		beasts(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opción");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opción");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 300;
		}

		checkLvl();
	}

	public static void fightSolarBeasts(int f) {
		Scanner s = new Scanner(System.in);
		fighting = true;
		System.out.println("Adoptas una posición de combate frente a tu enemigo.");
		SolarBeasts(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opción");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opción");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 500;
		}

		checkLvl();
	}

	public static void checkLvl() {
		if (xp >= 300) {
			level = 2;
			if (playerClass == "Guerrero") {
				playerHP = playerHP + (roll10() + 3);
			} // End lvlup warrior
			if (playerClass == "Mago") {
				playerHP = playerHP + (roll6() + 2);
			} // End lvlup wizard
			if (playerClass == "Bardo") {
				playerHP = playerHP + (roll8() + 3);
			} // End lvlup bard
			if (playerClass == "Vagabundo") {
				playerHP = playerHP + (roll6() + 1);
			} // End lvlup hobo
		} // Ens lvl2 check
		if (xp >= 900) {
			level = 3;
			if (playerClass == "Guerrero") {
				playerHP = playerHP + (roll10() + 3);
			} // End lvlup warrior
			if (playerClass == "Mago") {
				playerHP = playerHP + (roll6() + 2);
			} // End lvlup wizard
			if (playerClass == "Bardo") {
				playerHP = playerHP + (roll8() + 3);
			} // End lvlup bard
			if (playerClass == "Vagabundo") {
				playerHP = playerHP + (roll6() + 1);
			} // End lvlup hobo
		} // Ens lvl3 check
	}

	public static void DoMagic() {
		Scanner s = new Scanner(System.in);
		System.out.println("Puedes hacer los siguiente hechizos");
		System.out.println("1- Misil mágico.");
		System.out.println("2- Spray venenoso.");
		System.out.println("3- Saeta de fuego.");
		int h = s.nextInt();

		if (SpellSlots <= 0) {
			System.out.println("No te quedan Spell Slots, no puedes hacer magia.");
		} else {
			switch (h) {
			case 1:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll4() + roll4() + roll4() + SpellBonus);
					SpellSlots--;
					System.out.println(
							"Tres proyectiles de un azul celeste brotan de tus dedos, directos contra tu enemigo");
				}
				break; // End Magic Missile
			case 2:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll6() + roll6() + SpellBonus);
					SpellSlots--;
					System.out.println(
							"De los poros de tu mano empiezan a salir cientos de gotas de veneno que caen sobre tu enemigo.");
				}
				break; // End
			case 3:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll10() + SpellBonus);
					SpellSlots--;
					System.out.println(
							" Una gruesa saeta de fuego brota de la palma de tu mano que sale disparada contra tu rival");
				}
				break; // End fire bolt.
			default:
				System.out.println("Eso no es una opción");
				break;
			}
		}
	}// End DoMagic

	public static void inventory() {
		System.out.println("********************************************************************************");
		System.out.print("Clase: ");
		System.out.println(playerClass);
		System.out.print("PV: ");
		System.out.println(playerHP);
		System.out.print("Arma: ");
		System.out.println(playerWeapon);
		System.out.print("Arma a distancia: ");
		System.out.println(playerDisWeapon);
		System.out.print("Munición: ");
		System.out.println(ammunition);
		System.out.print("Tipo de armadura y CA: ");
		System.out.print(playerArmor);
		System.out.print(" || ");
		System.out.println(totalAC = playerAC + bonusAC);
		System.out.print("Galeones de oro: ");
		System.out.println(galeones);
		System.out.println(Day);
		System.out.print("Nivel: ");
		System.out.println(level);
		System.out.print("Experiencia: ");
		System.out.println(xp);
		while (SpellSlots > 0) {
			System.out.print("Spell Slots: ");
			System.out.println(SpellSlots);
			System.out.print("Bonus al hechizo: ");
			System.out.println(SpellBonus);
			break;
		}
		System.out.println("********************************************************************************");
		System.out.println("Objetos: ");
		System.out.println(inv);
		System.out.println("********************************************************************************");
	}

	public static void hoboStart() {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"Esperas sentado frente a la puerta de la taberna Cabo Tenso, nadie te deja un misero galeón en el bol.");
		System.out.println(
				"Dos individuos vestidos en negro y dorado con medallones de un Sol dorado en el pecho entran si volver la vista, ");
		System.out.println(
				"De un momento a otro la tarbertna monta en panico, escuchas un grito que no llegas a entender, ");
		System.out.println(
				"a través del deformado vidrio ves a uno de los hombres en negro y dorado atravesando a alguien con su florete");
		System.out.println("su compañero aguarda pacientemente junto a él.");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Entrar y enfrentarte al hombre del florete.");
		System.out.println("2- Entrar y enfrentarte a su acompañante.");
		System.out.println("3- Esperar sin hacer nada");
		choice = s.nextInt();

		switch (choice) {
		case 1:
			fight(1);
			break;
		case 2:
			fight(2);
			break;
		case 3:
			System.out.print(
					"Quedarte sin hacer nada ha sido tu mejor opción, al poco los asaltantes se marchan del local.");
			tensoCabo3();
			break;
		default:
			System.out.println("Eso no es un opción.");
			hoboStart();
			break;
		}
	}

	public static void tensoCabo() {
		Scanner s = new Scanner(System.in);
		System.out.printf(
				"El interior de la taberna 'Tenso Cabo' el aire huele a cerveza y a sudoroso hombre de mar, \n tocan en el escenario un grupo de cuatro bardos, con bandurrias y violines tocan 'El aparejo mal atado' aunque cuesta escucharles con todo el gentío.\n");
		System.out.printf(
				"Mientras te levantas al terminar tu plato entran por la puerta un par de hombres, vestidos en negro y dorado, \n cubiertos por capas del pecho les cuelgan sendos colgantes con del iconografía del sol. \n Los hombres se dirigen con decisión a una de las mesas donde un comensal les advierte y nervioso se levanta, \n");
		System.out.printf(
				"Uno de los hombres desenvaina un florete y ensarta sin pensar al hombre asustado. todos en la taberna gritan. \n 'Sol est in linea ad supplicium!' Grita el hombre del florete con este aún atravesando a su victima"); // The
																																																											// sun
																																																											// is
																																																											// in
																																																											// line
																																																											// to
																																																											// execution

		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Combatir al hombre del florete.");
		System.out.println("2- Combatir a su acompañante.");
		System.out.println("3- Intentar huir por la puerta.");
		System.out.println("4- Intentar huir por una de las ventanas.");
		System.out.println("5- No hacer nada.");
		choice = s.nextInt();
		switch (choice) {
		case 1:
			fight(1);
			break;
		case 2:
			fight(2);
			break;
		case 3:
			System.out.println("Intentas salir por la puerta");
			if (roll20() > 10) {
				System.out.println("Consigues huir de la taberna sin meterte en ningún embrollo.");
				plaza2();
			} else {
				System.out.println("Mientras te intentas escabullir ente la confusa gente uno de los hombres te ve,");
				System.out.println("Se acerca a ti de forma poco amigable, preparate a luchar");
				fight(2);
			}
			break;
		case 4:
			if (roll20() > 15) {
				System.out.println(
						"Consigues acercarte lo suficiente como para abrirla con disimulo y salir por la misma de la taberna.");
				plaza2();
			} else {
				System.out.println(
						"Te acercas a una de las ventanas, pero están cerradas y acbas de llmar mucho la atención.");
				System.out.println("Uno de los hombres te ve, y se acerca a tí de forma poco amigable.");
				fight(2);
			}
			break;
		case 5:
			System.out.print(
					"Quedarte sin hacer nada ha sido tu mejor opción, despues de su frase ambos asltantes se marchan.");
			tensoCabo3();
			break;
		default:
			System.out.println("Eso no es un opción.");
			tensoCabo();
			break;
		} // fin switch choice

		tensoCabo2();

	} // End tensoCabo

	public static int looted1 = 0; // acolito del Sol Tenso cabo
	public static int looted2 = 0; // Victima tenso cabo

	public static void tensoCabo2() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		System.out.println("Tras acabar con tu rival su acompañante huye despavorido");
		System.out.println("¿Que quiere hacer?");
		System.out.println("1- Marcharte a la plaza.");
		System.out.println("2- Inspeccionar el cadaver de tu rival.");
		System.out.println("3- Inspeccionar el cadaver de la victima.");
		System.out.println("4- Inventario.");
		System.out.println("5- Descansar.");
		System.out.println("6- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				plaza();
				break;
			case 2:
				if (looted1 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un puñado de galeones de Oro");
					galeones = galeones + roll8();
					System.out.println("Un florete [1d8 perforante]. ¿Quieres cogerlo?");
					System.out.println("[Esta acción cambiará tu arma de forma irreversible]");
					System.out.println("1- Coger florete");
					System.out.println("2- ignorar");
					int cog = s.nextInt();
					if (cog == 1) {
						playerWeapon = "Florete [1d8 perforante]";
						playerDmg = (int) (1 + (Math.random() * 9));
						typeDmg = 1;
					}
					looted1++;
					tensoCabo2();
				}
				if (looted1 > 0) {
					System.out.println("No queda nada más de interés");
					tensoCabo2();
				}
				break;
			case 3:
				if (looted2 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un puñado de galeones de Oro");
					galeones = galeones + roll4();
					System.out.println("Un medallón con iconografía del Sol");
					System.out.println("¿Quieres coger el medallón?");
					System.out.println("1- Cogerlo.");
					System.out.println("2- Ignorarlo.");
					int cogMed = s.nextInt();
					if (cogMed == 1) {
						inv.add("Medallón del sol");
					}
					looted2++;
					tensoCabo2();
				}
				if (looted2 > 0) {
					System.out.println("No queda nada más de interés");
					tensoCabo2();
				}
				break;
			case 4:
				inventory();
				tensoCabo2();
				break;
			case 5:
				longRest();
				tensoCabo2();
				break;
			default:
				System.out.println("Eso no es una opción");
				tensoCabo2();
				break;
			}// end switch choice
		} // end while
		if (choice == 6) {
			exit = true;
			System.exit(0);
		}
	}

	public static int looted2p1 = 0; // Victima tenso cabo

	public static void tensoCabo3() {
		Scanner s = new Scanner(System.in);

		boolean exit = false;

		System.out
				.println("Al final ambos asaltantes terminan por abandonar la taberna dejando nada más que silencio.");
		System.out.println("¿Que quiere hacer?");
		System.out.println("1- Marcharte a la plaza.");
		System.out.println("2- Inspeccionar el cadaver de la victima.");
		System.out.println("3- Inventario.");
		System.out.println("4- Descansar.");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				plaza();
				break;
			case 2:
				if (looted2p1 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un puñado de galeones de Oro");
					galeones = galeones + roll4();
					System.out.println("Un medallón con iconografía del Sol"); // System.out.println("");
					System.out.println("¿Quieres coger el medallón?");
					System.out.println("1- Cogerlo.");
					System.out.println("2- Ignorarlo.");
					int cogMed = s.nextInt();
					if (cogMed == 1) {
						inv.add("Medallón del sol");
					}
					looted2p1++;
					tensoCabo3();
				}
				if (looted2p1 > 0) {
					System.out.println("No queda nada más de interés");
					tensoCabo3();
				}
				break;
			case 3:
				inventory();
				tensoCabo3();
				break;
			case 4:
				longRest();
				tensoCabo3();
				break;
			default:
				System.out.println("Eso no es una opción");
				tensoCabo3();
				break;
			}// end switch choice
		} // end while

		if (choice == 5) {
			exit = true;
			System.exit(0);
		}

	}

	public static void viaPrincipalO() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		System.out.println(
				"Una alargada vía, cruzando de lado a lado brizzaresca, al oeste uno atraviesa la entrada y sale de las murallas de la ciudad");
		System.out.println(
				"Al noroeste se ven por encima de las demás casas las torres de la universidad de Brizzaresca");
		System.out.println("Al sureste la entrada a las callejuelas te observa, al este la plaza");
		System.out.println("¿A donde te diriges?");
		System.out.println("1- Al portón de las murallas.");
		System.out.println("2- A la Universidad.");
		System.out.println("3- A las callejuelas.");
		System.out.println("4- A la plaza");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				porton();
				break;
			case 2:
				if (soborno == true || enganyados == true) {
					entradaUniversidad2();
				} else {
					entradaUniversidad1();
				}
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				plaza2();
				break;
			case 5:
				inventory();
				viaPrincipalO();
				break;
			case 6:
				longRest();
				viaPrincipalO();
				break;
			default:
				System.out.println("Eso no es una opción");
				viaPrincipalO();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 7) {
				exit = true;
				System.exit(0);
			}
			viaPrincipalO();
		}
	}

	public static boolean soborno = false;
	public static boolean enganyados = false;

	public static void entradaUniversidad1() {
		System.out.println("Siguiendo por una de las más coloridas calles de Brizzaresca");
		System.out.println("terminas llegado a la universidad mayor, donde reposa todo el");
		System.out.println("saber de la ciudad estado, o al menos eso asegura su director.");
		System.out.println("Dos hombres en coraza y alabardas guardan el campus de los no deseados");
		System.out.println("te miran con codescendencia mientras te acercas a la verja.");
		System.out.println("-¿Que quieres? --Pregunta uno de ellos.");
		System.out.println("-Este no es lugar para gente Zarrapastrosa como tú. --Añade el otro.");
		System.out.println("¿Que haces?");
		System.out.println("1- Intentar dialogar tu entrada.");
		System.out.println("2- Ofrecer 10 galeones para pasar.");
		System.out.println("3- Abrite camino a la fuerza");
		System.out.println("4- Marcharte a la via oeste");
		System.out.println("5- Descansar");
		System.out.println("6- Inventario");
		System.out.println("7- Salir de la sesion [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				int result = roll20();
				if (result >= 17) {
					System.out.println("Tras un poco de engaño y lengua viperina convences a los guardas de que");
					System.out.println(
							"estudias en la universidad de renombre y te dejan pasar tras una extensiva disculpa.");
					entradaUniversidad2();
					enganyados = true;
				} else {
					System.out.println(
							"Lo has intentado y has fallado tus palabras no han llegado a engañas a los porteros");
					entradaUniversidad1();
				}
				break;
			case 2:
				if (galeones < 10) {
					System.out.println("No teienes dinero para sobornarles");
					entradaUniversidad1();
				} else {
					galeones = galeones - 10;
					System.out.println("No siempre necesitas una lengua de plata para entrar a los sitios");
					System.out.println("en ocasiones unas monedas de oro hacen el truco. Los guardianes no");
					System.out.println("reniegan tu oferta, te dejan pasar bajo su atenta mirada.");
					soborno = true;
					entradaUniversidad2();
				}

				break;
			case 3:
				fight(4);
				enganyados = true;
				entradaUniversidad2();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				entradaUniversidad1();
				break;
			case 6:
				longRest();
				entradaUniversidad1();
				break;
			default:
				System.out.println("Eso no es una opción");
				entradaUniversidad1();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 7) {
				System.exit(0);
			}
			entradaUniversidad1();
		}
	}

	public static void entradaUniversidad2() {
		System.out.println("Siguiendo por una de las más coloridas calles de Brizzaresca");
		System.out.println("terminas llegado a la universidad mayor, donde reposa todo el");
		System.out.println("saber de la ciudad estado, o al menos eso asegura su director.");
		System.out.println("Dos hombres en coraza y alabardas guardan el campus de los no deseados");
		System.out.println("Sus miradas ahora ni rozan tu figura.");
		System.out.println("¿Que haces?");
		System.out.println("1- Entrar a la universidad.");
		System.out.println("2- Marcharte a la via oeste");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesion [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (Uencounter == true) {
					
				} else {
					interiorUniversidadE();
				}
				break;
			case 2:
				viaPrincipalO();
				break;
			case 3:
				longRest();
				entradaUniversidad2();
				break;
			case 4:
				inventory();
				entradaUniversidad2();
				break;
			default:
				System.out.println("Eso no es una opción");
				entradaUniversidad2();
				break;
			}// End switch choice ViaPricipalO
		}
		if (choice == 5) {
			System.exit(0);
		}
		entradaUniversidad2();
	}

	public static boolean Uencounter = false;

	public static void interiorUniversidadE() {
		System.out.println("Caminas por el silencioso interior de la universidad");
		System.out.println("lo unico que se escucha son las atenuadas voces de catedraticos dando clase.");
		System.out.println(
				"-Y si tuviera seis puntas su sombra también las tendría... -- Se escucha desde una de las aulas");
		System.out.println("Conforme caminas se se empiezan a escuchar murmullos que poco a poco escalan ha gritos");
		System.out
				.println("girando una esquina aparecen corriendo en dirección contraria a la tuya unas seis personas");
		System.out.println("te quedas pasmado conforme te rebasan pegando gritos que apenas forman palabras");
		System.out.println(
				"De pronto del mismo pasillo por el que han venido esos hombres se empieza a escuchar una carrera");
		System.out.println("una de algo pesado y grande, cuyas pisadas suenan a las de un sabueso rabioso");
		System.out.println(
				"más pronto que tarde aparece derrapando por los brillantes suelos de la universidad una forma");
		System.out.println(
				"vagamente humanoide, grande como dos hombres codo con codo, cubierto por pelaje gris y negro");
		System.out.println(
				"al final de sus manos se extienden garras largas como tu propia mano, los ojos amarillos repletos de furia");
		System.out.println(
				"se cruzan con los tuyos, la bestia arruga su hocico de canino antes de empezar a correr hacía a tí.");
		if (inv.contains("Amuleto de paja")) {
			System.out.println("De pronto sientes un extraño calor en ti.");
			System.out.println("el amuleto de paja comienza a arder con extraño fuego verde");
			System.out.println("el fuego indoloro al tacto se aviva conforme la bestia se acerca, la cual al ver");
			System.out.println("las llamas se detiene en seco. Atemorizada, la bestia se lanza al suelo");
			System.out.println(
					"las verdes llamas envuelven al ser y para cuando se disipan un hombre común yace en el suelo");
			xp = xp + 100;
			Uencounter = true;
		} else {
			System.out.println("La odiosa bestia se abalanza sobre tí.");
			System.out.println("¿Que haces?");
			System.out.println("1- Le plantas cara");
			System.out.println("2- Intentas huir");
			choice = s.nextInt();

			switch (choice) {
				case 1:
					fightBeast(1);
					Uencounter = true;
					break;
				case 2:
					int huida = roll20();
					if (huida >= 17) {
						System.out.println("Huyes, te escondes en el primer aula que encuentras y atrancas la puerta con ayuda de algunos estudiantes.");
						System.out.println("Esperais... Y al final se hace el silencio, has evitado la conforntación, pero la bestia ahora ronda suelta.");
						Uencounter = true;
					} else {
						fightBeast(1);
						Uencounter = true;
					}
					break;
				default:
					System.out.println("Eso no es una opción");
					break;
			}
		}
		
		interiorUniversidadE();
	}

	public static void porton() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		System.out.println(
				"Te acercas a al portó de la ciudad, el rastrillo está levantado y la sombra de las murallas se alarga ante tí.");
		System.out.println(
				"Los guardas con sus anchas mangas montan guardia apoyados en sus alabardas hermosamente decoradas, y luciendo");
		System.out.println(
				"corazas brillantes con la insignia de la ciudad, \n una bandera rectangular con  trece alargados flecos a un lado vuela sobre las murallas");
		System.out.println("Sobre un campo de sanguíneo con decoraciones de or una medusa se enrosca en un ancla");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Salir fuera de la ciudad.");
		System.out.println("2- A la via principal oeste.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				break;
			case 2:
				viaPrincipalO();
				break;
			case 3:
				inventory();
				porton();
				break;
			case 4:
				longRest();
				porton();
				break;
			default:
				System.out.println("Eso no es una opción");
				porton();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 5) {
				exit = true;
				System.exit(0);
			}
			porton();
		}

	}

	public static void plaza() {

		Scanner s = new Scanner(System.in);

		boolean exit = false;
		// System.out.println("");
		System.out.printf(
				"Una tranquila plaza de forma circular, en el centro se alza erigida en marfil, la estatua a Saturnio Brizzaresco \n bañada por la crepitante luz anaranjada de las velas ofrecidas a sus pies \n");
		System.out.println("Famoso navegante que estableció la ciudad estado de Brizzaresca donde te encuentras. ");
		System.out.println(
				" puedes observar como el ulimo de los asaltante de la taberna se ha escbullido por una de las esquinas que dan a la via principal en dirección oeste.");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Norte al puerto.");
		System.out.println("2- Este de la vía principal.");
		System.out.println("3- Sur a las callejuelas.");
		System.out.println("4- Oeste de la vía principal");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				puerto();
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				plaza();
				break;
			case 6:
				longRest();
				plaza();
				break;
			default:
				System.out.println("Eso no es una opción");
				plaza();
				break;
			}// end switch choice
		} // end while
		if (choice == 7) {
			exit = true;
			System.exit(0);
		}

		plaza();
	}

	public static void plaza2() {
		Scanner s = new Scanner(System.in);

		boolean exit = false;
		// System.out.println("");
		System.out.printf(
				"Una tranquila plaza de forma circular, en el centro se alza erigida en marfil, la estatua a Saturnio Brizzaresco \n bañada por la crepitante luz anaranjada de las velas ofrecidas a sus pies \n");
		System.out.println("Famoso navegante que estableció la ciudad estado de Brizzaresca donde te encuentras. ");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Norte al puerto.");
		System.out.println("2- Este de la vía principal.");
		System.out.println("3- Sur a las callejuelas.");
		System.out.println("4- Oeste de la vía principal");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				puerto();
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				plaza2();
				break;
			case 6:
				longRest();
				plaza2();
				break;
			default:
				System.out.println("Eso no es una opción");
				plaza2();
				break;
			}// end switch choice
		} // end while
		if (choice == 7) {
			exit = true;
			System.exit(0);
		}

		plaza2();
	}

	public static void callejuelas() {
		Scanner s = new Scanner(System.in);
		boolean persuadido = false;

		System.out.println("Adentrandote por laberinticas callejuelas ves las partes bajas de la ciudad");
		System.out.println("");
		if (roll20() >= 18 && persuadido == false) {
			System.out.println("Caminando por las callejuelas, giras una esquina aleatoria, de esta misma salta");
			System.out.println("un ratero, como es su día a día te amenaza con su espada desgastada");
			System.out.println("'Tus galeones o te picho' te amenaza nervioso, listo para saltar a la minima.");
			System.out.println("¿Que haces?");
			System.out.println("1- Darle tus galeones");
			System.out.println("2- Intentar convencerle de que no te atraque");
			System.out.println("3- Atacarle");
			System.out.println("4- Intentar rodearle sin alterarle");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				galeones = 0;
				System.out.println("Tras darle tus galeones el hombre te deja marchar.");
				System.out.println("");
				callejuelas2();
				break;
			case 2:
				if (roll20() >= 19) {
					System.out.println(
							"Tras un breve charla cosigues convencerle de que no merece la pena y te deja pasar");
					persuadido = true;
					callejuelas2();
				} else {
					System.out.println("Tus esfuerzos a la hora de dialogar resultan futiles");
					System.out.println("el hombre cumple su promesa y se dispone a pincharte.");
					fight2(1);
				}
				break;
			case 3:
				fight2(1);
				break;
			case 4:
				if (roll20() >= 17) {
					System.out.println("Durante unos momentos de tensión caminas lentamente de forma lateral");
					System.out.println("bordeas a tu asaltante sin dmeasiado problema");
					callejuelas2();
				} else {
					System.out.println("Tus esfuerzos a la hora de evadirle resultan futiles");
					System.out.println("el hombre cumple su promesa y se dispone a pincharte.");
					fight2(1);
				}
				break;
			}

		} else {
			callejuelas2();
		}

		callejuelas2();
	}

	public static void callejuelas2() {
		Scanner s = new Scanner(System.in);
		System.out.println("Tras adentrarte por las callejuelas terminas en una encrucijada");
		System.out.println("podrías adentrarte más o retroceder");
		System.out.println("¿Que haces?");
		System.out.println("1- Adentrarte en las callejuelas");
		System.out.println("2- Retroceder a la plaza");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				barquero();
				break;
			case 2:
				plaza2();
				break;
			case 3:
				inventory();
				callejuelas2();
				break;
			case 4:
				longRest();
				callejuelas2();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}

		callejuelas2();
	}

	public static void barquero() {
		Scanner s = new Scanner(System.in);
		System.out.println("En el fondo de las callejuelas se abren los canales, putridos con deshechos humanos");
		System.out.println("y algún humano ocasional, junto a un pequeño muelle que parece pudrirse una silueta");
		System.out.println("envuelta en una capa de verde oscuro que luce una máscara de rata flota en una gónldola");
		System.out.println(
				"'¿Sube?' -El desconocido pregunta ofreciendo un asiento en la hermosa góndola fuera de lugar");
		System.out.println("¿Que haces?");
		System.out.println("1- Subes");
		System.out.println("2- No subes y das media vuelta");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión[NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				System.out.println("'¿Comprará o venderá?'");
				mercadoCanales();
				break;
			case 2:
				callejuelas2();
				break;
			case 3:
				inventory();
				barquero();
				break;
			case 4:
				longRest();
				barquero();
				break;
			}
		}

		if (choice == 5) {
			System.exit(0);
		}

		barquero();
	}

	public static void mercadoCanales() {
		Scanner s = new Scanner(System.in);
		System.out.println("El hombre de la máscara de rata rema con calma,");
		System.out.println("pasais bajo puentes arqueados antes de atracar");
		System.out.println("pones pie en una placeta flotante, un mercado");
		System.out.println("oculto al público general, por haber hay de todo");
		System.out.println("¿Que haces?");
		System.out.println("1- Comprar.");
		System.out.println("2- montar en la góndola y marchar.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				comprarCanales();
				break;
			case 2:
				barquero();
				break;
			case 3:
				inventory();
				mercadoCanales();
				break;
			case 4:
				longRest();
				mercadoCanales();
				break;
			}
		}

		if (choice == 5) {
			System.exit(0);
		}
		mercadoCanales();
	}

	public static void comprarCanales() {
		Scanner s = new Scanner(System.in);
		boolean[] dis = new boolean[5];
		dis[0] = true;
		dis[1] = true;
		dis[2] = true;
		dis[3] = true;
		dis[4] = true;
		System.out.println("¿Que deseas comprar?");
		System.out.println("1- Alabarda [2d6 Costante] {}");
		System.out.println("2- Escudo Heraldico [+2 AC] {13 G}"); // 0 en dis
		System.out.println("3- Broquel [+1 AC] {9 G}"); // 1 en dis
		System.out.println("4- Escudo de brazo crigiolano [+1 AC] {10G}"); // 2 en dis
		System.out.println("5- Látigo [2d4 perforante] {}");
		System.out.println("6- Alfanje [1d8 cortante] {}");
		System.out.println("7- Florete [1d8 cortante] {}");
		System.out.println("8- Espada larga [1d10 cortante] {}");
		System.out.println("9- Bastón [1d6 contundente] {}");
		System.out.println("10- Ballesta de mano[1d8 perforante] {}");
		System.out.println("11- Ballesta pesada y cranequín [1d10 perforante] {}");
		System.out.println("12- Foco arcano [+4 a los hechizos] {24 G}");// 3 en dis
		System.out.println("13- Pluma y sombrero Crigiolano  {20 G}"); // 4 en dis
		System.out.println("14- Irse sin comprar nada");
		choice = s.nextInt();

		switch (choice) {
		case 1:
			break;
		case 2:
			if (dis[0] == false || galeones < 13) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 13;
				bonusAC = 2;
				dis[0] = false;
			}
			break; // End Escudo heraldicco
		case 3:
			if (dis[1] == false || galeones < 9) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 9;
				bonusAC = 1;
				dis[1] = false;
			}
			break; // End broquel
		case 4:
			if (dis[2] == false || galeones < 10) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 10;
				bonusAC = 1;
				dis[2] = false;
			}
			break; // End Escudo de brazo
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			if (dis[3] == false || galeones < 24) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 24;
				SpellBonus = SpellBonus + 4;
				dis[3] = false;
			}
			break;
		case 13:
			if (dis[4] == false || galeones < 20) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				inv.add("Pluma y sombrero Crigiolano");
				galeones = galeones - 20;
				dis[4] = false;
			}
			break;
		case 14:
			mercadoCanales();
			break;
		}

		comprarCanales();
	}

	public static void puerto() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		System.out.printf(
				"El olor a mar salda te llena las fosas nasales y el sonido de las gaviotas es el del unico pajaro en el momento. \n");
		System.out.printf(
				"Los marineros cargan y descarga todo tipo de bienes en los barcos, el más llamativo una carabela cuyas enormes velas lucen \n");
		System.out.printf(
				"la insignia del ducado de Crigiola, la carabela está protegida por una gran cantidad de guardias Crigolenses \n");
		System.out.printf(
				"que bloquean el paso a todo aquel que no viste a la moda de Crigiola con sombrero de ala ancha y pluma de faisán al cuello. \n");
		System.out.printf(
				"Siguiendo el puerto al este se ve el edificio de la lonja y su apabullado comercio que no se detiene ni de día ni de noche. \n");
		System.out.printf("Al sur la plaza con la estatua de Saturnio Brizzaresco espera \n");
		System.out.println("¿A donde quieres ir?");
		System.out.println("1- A la carabela Crigiolana");
		System.out.println("2- A la lonja");
		System.out.println("3- A la plaza");
		System.out.println("4- Inventario");
		System.out.println("5- Descansar");
		System.out.println("6- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				if (inv.contains("Pluma y sombrero Crigiolano")) {
					System.out.println("Ah, subid subid, nada mejor que ver a uno de los nuestros aquí");
					carabela();
				} else if (!inv.contains("Pluma y sombrero Crigiolano")) {
					System.out.println("¡EH! ¿A donde vas? En esta nave solo entran Crigiolanos.");
					System.out.println("");
					puerto();
				}
				break;
			case 2:
				if (terminada == false) {
					lonja();
				} else {
					lonja2();
				}
				break;
			case 3:
				plaza2();
				break;
			case 4:
				inventory();
				puerto();
				break;
			case 5:
				longRest();
				puerto();
				break;
			default:
				System.out.println("Eso no es una opción");
				puerto();
				break;
			}
		} // End while choice puerto
		if (choice == 6) {
			exit = true;
			System.exit(0);
		}

		puerto();
	}

	public static void lonja() {
		boolean exit = false;

		if (Day == "Es de día") {
			System.out.println(
					"El aire se ve inundado por el hedor a pescado muerto sobre cajas de sal para conservarlo");
			System.out.println(
					"las especias importadas se mezclan en el aire y en las cajas expuestas en colorida exposición");
			System.out.println("La gente grita sus precios mientras que otros realizan regateos.");
			System.out.println(
					"Una señora mayor se pasea con una cesta de mombre de la que cuelga un cartel. 'Amuletos' pone.");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("¿Que quieres hacer?");
			System.out.println("1- Hablar con la señora");
			System.out.println("2- Ir a la vía principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesión [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					System.out.println(
							"La señora camina despacio, alzando sus manos huesudas sujerando uno de los susodichos amuletos");
					System.out.println(
							"Los amuletos parecen colgantes de paja pero parecen tener un peso nada caracteristico de la paja");
					System.out.println(
							"'Comprad, comprad mi amuleto' Te dice alzando uno en tu cara 'Cuarenta galeones para librarte del mal'");
					System.out.println("¿Que haces?");
					System.out.println("1- Comprar el amuleto");
					System.out.println("2- No comprar no comprar");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						if (galeones >= 40) {
							System.out.println("'Maravillas, tened tened, la fortuna en sus manos'");
							inv.add("Amuleto de paja");
							lonja();
						} else {
							System.out.println("'Oh, pobre de ti mi alma. más no tienes lo suficientes galeones'");
							lonja();
						}
						break;
					case 2:
						System.out.println("Ignoras a la mujer de manos huesudas.");
						lonja();
						break;
					}

					lonja();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opción");
					lonja();
					break;
				} // End while choice lonja día
			} // End If
		} // End while lonja día
		if (choice == 6) {
			exit = true;
			System.exit(0);

		} else if (Day == "Es de noche") {
			System.out.println("llegas a la lonja cuya actividad no para ni de día ni de noche.");
			System.out.println("El aire huele a pescado y exoticas especias, la gente grita sus precios y quejas");
			System.out.println("al fondo de la lonja unos individuos de negro y dorado se escabullen por una puerta");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("¿Que quieres hacer?");
			System.out.println("1- Seguir a los hombre de Negro y Dorado");
			System.out.println("2- Ir a la vía principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesión [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					subasta();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opción");
					lonja();
					break;
				} // End while choice lonja noche
			} // End while lonja noche
			if (choice == 6) {
				exit = true;
				System.exit(0);
			} // End If
		} // End if dia/noche
		lonja();
	}

	public static void lonja2() {
		boolean exit = false;

		if (Day == "Es de día") {
			System.out.println(
					"El aire se ve inundado por el hedor a pescado muerto sobre cajas de sal para conservarlo");
			System.out.println(
					"las especias importadas se mezclan en el aire y en las cajas expuestas en colorida exposición");
			System.out.println("La gente grita sus precios mientras que otros realizan regateos.");
			System.out.println(
					"Una señora mayor se pasea con una cesta de mombre de la que cuelga un cartel. 'Amuletos' pone.");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("¿Que quieres hacer?");
			System.out.println("1- Hablar con la señora");
			System.out.println("2- Ir a la vía principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesión [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					System.out.println(
							"La señora camina despacio, alzando sus manos huesudas sujerando uno de los susodichos amuletos");
					System.out.println(
							"Los amuletos parecen colgantes de paja pero parecen tener un peso nada caracteristico de la paja");
					System.out.println(
							"'Comprad, comprad mi amuleto' Te dice alzando uno en tu cara 'Cuarenta galeones para librarte del mal'");
					System.out.println("¿Que haces?");
					System.out.println("1- Comprar el amuleto");
					System.out.println("2- No comprar no comprar");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						if (galeones >= 40) {
							System.out.println("'Maravillas, tened tened, la fortuna en sus manos'");
							inv.add("Amuleto de paja");
							lonja();
						} else {
							System.out.println("'Oh, pobre de ti mi alma. más no tienes lo suficientes galeones'");
							lonja();
						}
						break;
					case 2:
						System.out.println("Ignoras a la mujer de manos huesudas.");
						lonja();
						break;
					}

					lonja();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opción");
					lonja();
					break;
				} // End while choice lonja día
			} // End If
		} // End while lonja día
		if (choice == 6) {
			exit = true;
			System.exit(0);

		} else if (Day == "Es de noche") {
			System.out.println("llegas a la lonja cuya actividad no para ni de día ni de noche.");
			System.out.println("El aire huele a pescado y exoticas especias, la gente grita sus precios y quejas");
			System.out.println("al fondo de la lonja unos individuos de negro y dorado ya no están junto a la puerta");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("¿Que quieres hacer?");
			System.out.println("1- Ir a la vía principal Este");
			System.out.println("2- Ir al puerto");
			System.out.println("3- Inventario");
			System.out.println("4- Descansar");
			System.out.println("5- Salir de la sesión [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 5) {
				switch (choice) {
				case 1:
					viaPrincipalE();
					break;
				case 2:
					puerto();
					break;
				case 3:
					inventory();
					lonja2();
					break;
				case 4:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opción");
					lonja();
					break;
				} // End while choice lonja noche
			} // End while lonja noche
			if (choice == 5) {
				exit = true;
				System.exit(0);
			} // End If
		} // End if dia/noche
		lonja2();
	}

	public static void subasta() {
		int galeonesOfrecidos = 0;
		int GaleonesRival = 50;
		int galeonesOfrecidosRivales = 0;
		int turnos = 5;
		int limiteDeApuesta = galeones;
		if (terminada == false) {
			System.out.println("Siguiendo a los hombres de negro y dorado te adentras en una gran sala, ");
			System.out.println("en el centro se alza un pedestal con algo tapado por un paño de seda blanca, ");
			System.out.println("alrededor del pedestal en circulo la gente se sienta en sillas curules. ");
			System.out.println("Te sientas a cierta distancia de los hombres de negro y dorado, vigilante.");
			System.out.println(
					"Un hombre con mascará de colibrí sube junto al pedestal rodeado de braseros que le alumbran");
			System.out.println("El hombre quita el paño de seda blanca para mostrar un sol de oxidado bronce ");
			System.out.println("cuyo centro es de negro azabache, anuncia el inicio de la subasta por la pieza");
			System.out.println("encontrada en el fondo del oceano por marineros crigiolanos.");
			System.out.println("¿Quieres pujar?");
			System.out.println("1- Pujar");
			System.out.println("2- No pujar");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i <= turnos; i++) {
					if (galeones > galeonesOfrecidosRivales) {
						System.out.println("¿cuanto quieres pujar?");
						galeonesOfrecidos = s.nextInt() + galeonesOfrecidos;
						if (galeonesOfrecidos > galeones) {
							System.out.println("No puedes pujar más dinero del que tienes");
							System.out.println("¿cuanto quieres pujar?");
							galeonesOfrecidos = s.nextInt() + galeonesOfrecidos;
						}
						System.out.println("Ofreces un total de: " + galeonesOfrecidos + " galeones");
						System.out.println("Los hombres de negro y dorado no parece que quieran perder la subasta.");
						System.out.print("Ofrecen: ");
						galeonesOfrecidosRivales = galeonesOfrecidos + 10;
						System.out.println(galeonesOfrecidosRivales + " galeones");
					} else {
						System.out.println("No tienes galeones suficientes para superar la siguiente puja.");
						System.out.println("");
					}
				}
				if (galeonesOfrecidos > galeonesOfrecidosRivales) {
					System.out.println("Tu puja termina siendo la última y ganadora");
					galeones = galeones - galeonesOfrecidos;
					System.out.println("tras pagar el dinero el tasador te ofrece el objeto que aceptas");
					inv.add("Sol de bronce");
				} else {
					System.out.println("Los hombres pagan con descaro la pieza al curador");
					System.out.println("la guardan en una ornamentada caja antes de salir.");
					System.out.println("todos se van de nuevo a la lonja y tu igual");
					System.out.println("");
					terminada = true;
					lonja2();
				}
				break;
			case 2:
				System.out.println("Las gentes pujan pero en el momento que empiezan a hacerlo también los hombres de");
				System.out
						.println("negro y dorado nadie opone resistencia. Al final los hombres pagan con descaro al ");
				System.out.println("curador y guardan la pieza en una ornamentada caja antes de salir.");
				System.out.println("Todos marchan a la lonja y tú haces igual.");
				System.out.println("");
				terminada = true;
				lonja2();
				break;
			}

		} else {
			System.out.println("La subas ya ha terminado, no tienes nada que hacer aquí");
			System.out.println("vuelves a la lonja");
			lonja2();
		}

		subasta();
	}

	public static void carabela() {
		Scanner s = new Scanner(System.in);
		System.out.println("Con la cabeza gacha y vestimentas Crigiolanas no llamas la atención,");
		System.out.println("subes a la carabela Crigiolana de velas triangulares, la madera cruje mecida por las olas");
		System.out.println("Los marineros crigiolanos mueven cajas de allí para allá, suben y bajan a la cubierta");
		System.out.println("superior a través de una trampilla metálica.");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Bajar a la zona inferior.");
		System.out.println("2- Ir al puerto");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (looted3 > 0) {
					interiorCarabela2();
				} else {
					interiorCarabela1();
				}
				break;
			case 2:
				puerto();
				break;
			case 3:
				inventory();
				carabela();
				break;
			case 4:
				longRest();
				carabela();
				break;
			default:
				System.out.println("Eso no es una opción");
				carabela();
				break;
			}
		} // End while Carabela
		if (choice == 5) {
			System.exit(0);
		}
		carabela();
	}

	public static int looted3 = 0; // Elegido del sol carabela

	public static void interiorCarabela1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Bajas por la trampilla con confianza sin llamar la atención");
		System.out.println("Tras bajar unos niveles por la carabela, te encuentras en la linea de ");
		System.out.println("flotación, este piso parece extrañamente silencioso, poc más adelante ves un cañón");
		System.out.println("fuera de lugar, demasiado adentro, te acercas, por la ventana ves entrar a");
		System.out.println(
				"un hombre de negro y dorado con el medallón del sol. Está envuelto en una extraña aura durada");
		System.out.println(
				"por el hueco donde debería asomar el cañón, entre sus manos porta una botella del más puro negro");
		System.out.println("El hombre se abalanza sobre ti.");
		System.out.println("¿Que quieres hacer?");
		System.out.println("1- Atacar a la vez.");
		System.out.println("2- Intentar esquivarle");
		choice = s.nextInt();

		switch (choice) {
		case 1:
			fight(3);
			break;
		case 2:
			if (roll20() > playerAC) {
				playerHP = playerHP - roll6();
				fight(3);
			} else {
				fight(3);
			}
			break;
		default:
			System.out.println("Eso no es una opción.");
			interiorCarabela1();
			break;
		} // End switch choice

		interiorCarabela2();
	}

	public static void interiorCarabela2() {
		Scanner s = new Scanner(System.in);
		System.out.println("El cadaver de tu rival ha perido su aura dorada, ahora yace en el suelo");
		System.out.println("su cuerpo de pronto se envuelve en amarillas llamas que vuelven su carne cenizas");
		System.out.println("Quedan sus ropajes y la botella de puro negro tapada por una cubierta dorada");
		System.out.println("¿Que quiere hacer?");
		System.out.println("1- Revisar el cuerpo");
		System.out.println("2- Curiosear las mercancias de la carabela");
		System.out.println("3- Volver arriba");
		System.out.println("4- Inventario");
		System.out.println("5- Descansar");
		System.out.println("6- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();
		int revisado = 0;

		while (choice != 6) {
			switch (choice) {
			case 1:
				if (looted3 == 0) {
					System.out.println("Entre las ropas llenas cenizas encuentras el negro frasco");
					System.out.println(" y los pocos galeones que no se han fundido.");
					galeones = galeones + roll4();
					System.out.println("¿Quieres coger el frasco?");
					System.out.println("1- Coger el frasco.");
					System.out.println("2- Ignorar el frasco.");
					int cogFras = s.nextInt();
					if (cogFras == 1) {
						inv.add("Frasco negro");
					}
					looted3++;
					interiorCarabela2();
				}
				if (looted3 > 0) {
					System.out.println("No queda nada más");
					interiorCarabela2();
				}

				break;
			case 2:
				if (revisado == 0) {
					if (roll20() > 17) {
						System.out.println("Entre las cajas encuentras una de las mejores");
						System.out.println("innovaciones de guerra producidas por Crigiola.");
						System.out.println("Un arquebús [2d12 perforante]");
						System.out.println("¿Quieres cogerlo?");
						System.out.println("1- Coger el mosquete y su munición");
						System.out.println("2- Ignorarlo");
						choice = s.nextInt();
						if (choice == 1) {
							playerDisWeapon = "arquebús [2d12 perforante]";
							playerDisDmg = (roll12() + roll12());
							ammunition = 12;
						}
						interiorCarabela2();
					} else {
						System.out.println("No pareces encontrar nada que te interese");
						interiorCarabela2();
					}
					revisado++;
				} else {

				}

				break;
			case 3:
				carabela();
				break;
			case 4:
				inventory();
				interiorCarabela2();
				break;
			case 5:
				longRest();
				interiorCarabela2();
				break;
			}
		}
		if (choice == 6) {
			System.exit(0);
		}

		interiorCarabela2();
	}

	public static void viaPrincipalE() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		System.out.println("En la zona este de la vía principal la gente se mueve como el torrente de un río, ");
		System.out.println(
				"toda clase de personas camina, mercaderes ricos, pescaderos modestos, villanos pobre y peregrinos zarrapastrosos");
		System.out.println(
				"algunos van a la lonja, otros a la plaza, pero muchos, tanto habitantes de la ciudad como viajeros se dirigen al Duomo de la Medusa eterna");
		System.out.println("¿Que quieres hacer");
		System.out.println("1- Ir a la catedral de la Medusa Eterna.");
		System.out.println("2- Ir a la plaza.");
		System.out.println("3- Ir a la lonja.");
		System.out.println("4- inventario.");
		System.out.println("5- descansar.");
		System.out.println("6- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 6) {
			switch (choice) {
			case 1:
				catedralME();
				break;
			case 2:
				plaza2();
				break;
			case 3:
				lonja();
				break;
			case 4:
				inventory();
				viaPrincipalE();
				break;
			case 5:
				longRest();
				viaPrincipalE();
				break;
			default:
				viaPrincipalE();
				break;
			}
		} // End while ViaPrincipalE

		if (choice == 6) {
			exit = true;
			System.exit(0);
		}
		viaPrincipalE();
	}

	public static void catedralME() {
		System.out.println("Tus pasos resuenan con el eco producido en el interior de la colosal estructura.");
		System.out.println("La catedral de marmol de un pristino blanco se alza por encima de cualquier otro edificio");
		System.out.println(
				"sus techos de dorados colores se ven invadidos por las gaviotas que vigilan a los feligreses ");
		System.out.println(
				"y peregrinos que vienen s pedir el mayor perdon por sus errores. en el interior de la catedral ");
		System.out.println(
				"una estatua de la medusa eterna hecha de marmol negro con tentaculos extendiendose más allá del altar ");
		System.out.println(
				"subiendo por columnas hasta el techo del edificio. Los creyentes se arremolinan junto a la estatua, ");
		System.out.println(
				"un rezo colectivo donde todos caminas despacio alrededor de la enorme estatua en el centro de la estancia.");
		System.out.println("¿Que haces?");
		System.out.println("1- Rezar devotamente a la Medusa Eterna.");
		System.out.println("2- Da media vuelta a la vía principal Este.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesión [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (devotado == false) {
					System.out.println("Te unes a la marabunta de gente, giras con ellos en silencio.");
					System.out.println("Tu mente se pierde en el cosmos, te dejas alcanzar por los infinitos ");
					System.out.println(
							"tentáculos de la Medusa Eterna, sientes como superponen tu piel y te adoptan como uno más");
					System.out.println("");
					System.out.println("Ahora eres longevo como una medusa");
					System.out.println("Vida +");
					System.out.println("");

					maxPlayerHP = maxPlayerHP + (10);
					longRest();
					longRest();

					devotado = true;
					catedralME();
				} else {
					System.out.println("Ya estas devotado.");
					catedralME();
				}
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				inventory();
				catedralME();
				break;
			case 4:
				longRest();
				catedralME();
				break;
			default:
				System.out.println("Eso no es una opción");
				catedralME();
				break;
			}
		} // End while Carabela
		if (choice == 5) {
			System.exit(0);
		}
		catedralME();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean salir = false;

		try {

			System.out.print(
					"                                           -=                                             \r\n"
							+ "                                          -*:                                             \r\n"
							+ "                                         .++-                                             \r\n"
							+ "                                         .+++                                             \r\n"
							+ "                     .                 .  =++=                                            \r\n"
							+ "                     +.                   .=++=                :-==:.                     \r\n"
							+ "                     -*-.                  -+++=             :++=.                        \r\n"
							+ "                      -**=-:.              -++++:           =++=                          \r\n"
							+ "                       .=+*++++=-:         =++++=  .       =++=                           \r\n"
							+ "                          :-+***+++=.     :+=====        :=+++:                           \r\n"
							+ "                             .=++++++= .:--===--::.   .-=++++-                            \r\n"
							+ "                               .=+++===++++++++++++=-:=++++=-                             \r\n"
							+ "                                 =-=++++=:.. ...:-++++=-=+=.                              \r\n"
							+ "                                 :++++-            :=+++::                                \r\n"
							+ "                            ....:+++=.               =+++:                                \r\n"
							+ "                      .-=+*****=++++   La muerte      =++=...      .::--==-:              \r\n"
							+ "           ..     .:=++******++-+++=      del         -+++-++++==+++++++======:           \r\n"
							+ "            :=****++++==----==+:++++         Sol      -+++-++++++++=-:                    \r\n"
							+ "               ..:..            -+++:                .+++=:====-:.                        \r\n"
							+ "                             .   =+++:              .=++=.                                \r\n"
							+ "                               .=-=+++=:.         :=+++=.                                 \r\n"
							+ "                              -++++-=+++++=----==++++=-=+:                                \r\n"
							+ "                             +++*+++:.-=++++++++++=--=++++-                               \r\n"
							+ "                            =++++=:      -=====:.   :=++++++-.                            \r\n"
							+ "                           -+++=      .  ++++++.      .-=++++*+=:                         \r\n"
							+ "                          .+++=          =++++=          .:-=+**++-                       \r\n"
							+ "                         .+**-           .++++=                .:=++.                     \r\n"
							+ "                       .=**=.             :++++                   .=+                     \r\n"
							+ "                    .:==-:                 .++*-                    =                     \r\n"
							+ "                                            .**+                                          \r\n"
							+ "                                          .  -**                                          \r\n"
							+ "                                             :*+                                          \r\n"
							+ "                                             -+                                           \r\n"
							+ "                                          .  :                                            \r\n"
							+ "																							 \r\n"
							+ "																							 \r\n"
							+ "																							 \r\n"
							+ "BlaGames©																		         \r\n"
							+ "LaMuerteDelSol®		 																     \r\n"
							+ "																		                     \r\n"
							+ "");

			System.out.println("1- Jugar");
			System.out.println("2- Salir");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				clase();
				if (playerClass == "Vagabundo") {
					hoboStart();
				} else {
					tensoCabo();
				}
				break;
			case 2:
				System.exit(0);
				break;
			}
			if (salir = true) {
				System.exit(0);
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("algo salió mal");
		}

	}

	public static int roll20() {
		Random rand = new Random();
		int n = rand.nextInt(21);
		while (n == 0) {
			n = rand.nextInt(21);
		} // 1-20
		return n;
	}

	public static int roll12() {
		Random rand = new Random();
		int n = rand.nextInt(13);
		while (n == 0) {
			n = rand.nextInt(13);
		} // 1-12
		return n;
	}

	public static int roll10() {
		Random rand = new Random();
		int n = rand.nextInt(11);
		while (n == 0) {
			n = rand.nextInt(11);
		} // 1-10
		return n;
	}

	public static int roll8() {
		Random rand = new Random();
		int n = rand.nextInt(9);
		while (n == 0) {
			n = rand.nextInt(9);
		} // 1-8
		return n;
	}

	public static int roll6() {
		Random rand = new Random();
		int n = rand.nextInt(7);
		while (n == 0) {
			n = rand.nextInt(7);
		} // 1-6
		return n;
	}

	public static int roll4() {
		Random rand = new Random();
		int n = rand.nextInt(5);
		while (n == 0) {
			n = rand.nextInt(5);
		} // 1-4
		return n;
	}
} // end of class