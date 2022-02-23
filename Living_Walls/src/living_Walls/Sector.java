package living_Walls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sector {
	private static boolean nD = true;
	private static boolean sD = true;
	private static boolean wD = true;
	private static boolean eD = true;

	public static Room[][] newRandSec(Player player) {
		Room[][] sector = new Room[30][30];
		for (int i = 0; i < sector.length; i++) {
			for (int j = 0; j < sector.length; j++) {
				sector[i][j] = Room.newRoom();
			}
		}
		player.setCurrCoor(sector[14][14]);
		return sector;
	}

	public boolean existeSala(int x, int y) {
		return (existeLinea(x)) && (existeCol(y));
	}

	public boolean existeLinea(int x) {
		return (x >= 0) && (x <= 29);
	}

	public boolean existeCol(int y) {
		return (y >= 0) && (y <= 29);
	}

	public void movPlayer(Player player) {
		nD = existeSala(player.getCurrX(), player.getCurrY() + 1);
		sD = existeSala(player.getCurrX(), player.getCurrY() - 1);
		eD = existeSala(player.getCurrX() + 1, player.getCurrY());
		wD = existeSala(player.getCurrX() - 1, player.getCurrY());
		Menus.menuMov(player);
	}

	public void movPlayerFuent(Player player, Room[][] d) {
		nD = existeSala(player.getCurrX(), player.getCurrY() + 1);
		sD = existeSala(player.getCurrX(), player.getCurrY() - 1);
		eD = existeSala(player.getCurrX() + 1, player.getCurrY());
		wD = existeSala(player.getCurrX() - 1, player.getCurrY());
		Menus.menuFuent(player, d);
	}

	public void cityLogic(Player p, Room[][] d) {
		do {
			p.setCurrCoor(d[p.getCurrX()][p.getCurrY()]);
			g(p, d);
			System.out.println("********************************************************************************");
			if (p.isAlive() && (d[p.getCurrX()][p.getCurrY()].getEne().getHp() > 0
					&& d[p.getCurrX()][p.getCurrY()].getNumEne() > 0)) { // Si esta vivo o el enemigo de la sala tiene
																			// más de 0 de vida
				System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
				System.out.println("Hay un total de " + d[p.getCurrX()][p.getCurrY()].getNumEne() + " Enemigo/s");
				Pelea.enfrentamiento(p, d[p.getCurrX()][p.getCurrY()].getEne());
				if (d[p.getCurrX()][p.getCurrY()].getEne().getHp() <= 0) {
					d[p.getCurrX()][p.getCurrY()].setNumEne(d[p.getCurrX()][p.getCurrY()].getNumEne() - 1);
				}
				// fin comprobación enemigos
			} else if ((d[p.getCurrX()][p.getCurrY()].isDescan() == true
					&& d[p.getCurrX()][p.getCurrY()].getNumEne() <= 0)) {
				// Si carece de enemigos y la sala tiene fuente se activa este
				System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
				if (d[p.getCurrX()][p.getCurrY()].getNumCur() > 0) {
					// si a la fuente le quedan curas envialo al menú de fuentes.
					movPlayerFuent(p, d);
				} else {
					p.setPutridPoints(p.getPutridPoints() + 1);
					movPlayerFuent(p, d);
					// Si cambio esta parte la detección de curaciones peta, do not quitar
				}
				// fin comprobación fuente
			} else if (p.isAlive()) {
				System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
				movPlayer(p);
			}
			// fin comprobación area vacía
		} while (p.isAlive() && p.getPutridPoints() <= p.getMaxPutrid());
		Menus.menuMuert();
	}

	public static void g(Player p, Room[][] d) {
		ObjectOutputStream gu = null;
		ObjectOutputStream gd = null;
		try {
			@SuppressWarnings("unused")
			File file = new File("g/s1.dat");
			@SuppressWarnings("unused")
			File file2 = new File("g/sd1.dat");
			gu = new ObjectOutputStream(new FileOutputStream("g/s1.dat"));
			gd = new ObjectOutputStream(new FileOutputStream("g/sd1.dat"));
			gu.writeObject(p);
			gd.writeObject(d);
		} catch (FileNotFoundException FNFE) {
			FNFE.printStackTrace();
		} catch (IOException IOEE) {
			IOEE.printStackTrace();
		} finally {
			try {
				if (gu != null)
					gu.close();
				if (gd != null)
					gd.close();
			} catch (IOException IOEE) {
				IOEE.printStackTrace();
			}
		}
	}

	public static boolean esNort() {
		return nD;
	}

	public static boolean esSur() {
		return sD;
	}

	public static boolean esEst() {
		return eD;
	}

	public static boolean esOes() {
		return wD;
	}
}
