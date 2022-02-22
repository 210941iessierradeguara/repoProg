package living_Walls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
			case 1: // pj exiliado
				player = Player.newExiliated();
				System.out.println("¿Cual es el nombre de este: " + player.getPclass() + "?");
				String nombre = s.next();
				player.setName(nombre);
				sector = Sector.newRandSec(player);
				sector2.cityLogic(player, sector);
				break;
			case 2:
				try {
    				ObjectInputStream LP = new ObjectInputStream(new FileInputStream("g/s1.dat"));
					ObjectInputStream LD = new ObjectInputStream(new FileInputStream("g/sd1.dat"));
					try {
						player = (Player) LP.readObject();
						sector = (Room[][]) LD.readObject();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					LP.close();
					LD.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				sector2.cityLogic(player, sector);
				break;
		}
		
	}

}
