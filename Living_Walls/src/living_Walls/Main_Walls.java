package living_Walls;

import java.util.Random;
import java.util.Scanner;

public class Main_Walls {
	public static final Random Dice = new Random();
	public static final Scanner s = new Scanner(System.in);
	public static Player player;
	public static Room[][] sector;
	public static int choice;
	
	
	public static void main(String[] args) {
		Sector sector2 = new Sector();
		switch(Menus.MenuPrinc()) {
			case 1:
				player = Player.newExiliated();
				System.out.println("¿Cual es el nombre de este: " + player.getPclass() + "?");
				String nombre = s.next();
				player.setName(nombre);
				break;
		}
		sector = Sector.newRandSec(player);
		sector2.cityLogic(player, sector);
	}

}
