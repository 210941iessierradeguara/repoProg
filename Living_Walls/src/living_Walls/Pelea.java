package living_Walls;

public class Pelea {
	
	public static void enfrentamiento(Player p, Enemy e) {
		System.out.println("Ante ti se presenta un/a " + e.getName() + e.getDesc());
		while (e.getHp() > 0) {
			if (p.getHp() <= 0) {
				Menus.menuMuert();
			}
			int choice = Menus.menuPelea(p);
			switch (choice) {
				case 1:
					ataque(p, e);
					break;
				case 2:
					defensa(p, e);
					break;
				case 3:
					observar(e);
					break;
				case 4:
					p.Stats();
					break;
				case 5:
					podredumbre(p, e);
					break;
				default:
					System.out.println("Eso no es una opción");
					break;
			}
		}
		if (p.getHp() <= 0) {
			Menus.menuMuert();
		}
	}
	
	public static void ataque(Player p, Enemy e) {
		if (Dices.Twenty() + p.getLevel() > e.getDef()) { // Si 1d20 + nvl (bonus) es mayor que Defensas enemigas, vida enemigo - daño jugador
			e.setHp(e.getHp() - p.Dmg());
			if (Dices.Twenty() > p.getDef()) { //1d20 puro que ha de superar Def jugador para dañar
				p.setHp(p.getHp() - e.dmg());
				System.out.println("El enemigo te ataca.");
				System.out.println("HP actual: " + p.getHp());
					if(p.getHp() < 0) {
						Menus.menuMuert();
					}
			} else {
				System.out.println("El ataque enemigo falla");	
			}
		} else {
			System.out.println("Tu ataque ha fallado");
				if (Dices.Twenty() > p.getDef()) {
					p.setHp(p.getHp() - e.dmg());
					System.out.println("El enemigo te ataca.");
					System.out.println("HP actual: " + p.getHp());
					if(p.getHp() < 0) {
						Menus.menuMuert();
					}
				} else {
					System.out.println("El ataque enemigo falla");	
				}
		}
	}
	
	public static void defensa(Player p, Enemy e) {
		if (Dices.Twenty() > p.getDef() + 3) {
			p.setHp(p.getHp() - e.dmg());
			System.out.println("El enemigo sortea tus defensas.");
			System.out.println("HP actual: " + p.getHp());
			if(p.getHp() < 0) {
				Menus.menuMuert();
			}
		} else {
			System.out.println("Tu bloqueo es eficiente y evitas cualquier daño.");
			if (p.getHp() <= 0) {
				Menus.menuMuert();
			}
		}
	}
	
	public static void observar(Enemy e) {
		if (e.getHp() > (e.getHp()/4) * 3) {
			System.out.println("El " + e.getName() +  " aparenta estar en buenas condiciones.");
		} else if (e.getHp() > (e.getHp()/4) * 2) {
			System.out.println("El " + e.getName() + " aparenta etar algo magullado, pero aún puede pelear sin problemas.");
		} else if (e.getHp() > (e.getHp()/4) * 1) {
			System.out.println("El " + e.getName() + " se ve malamente herido.");
		}
	}
	
	public static void podredumbre(Player p, Enemy e) {
		
	}
	
	
}
