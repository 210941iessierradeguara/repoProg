package living_Walls;

public class Sector {
	private static boolean nD = true;
	private static boolean sD = true;
	private static boolean wD = true;
	private static boolean eD = true;
	
	public static Room[][] newRandSec(Player player){
		Room [][] sector = new Room [30][30];
		for (int i = 0; i < sector.length; i++) {
			for (int j = 0; j < sector.length; j++) {
				sector [i][j] = Room.newRoom();
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
	
	public void movPlayerFuent(Player player) {
		nD = existeSala(player.getCurrX(), player.getCurrY() + 1);
		sD = existeSala(player.getCurrX(), player.getCurrY() - 1);
		eD = existeSala(player.getCurrX() + 1, player.getCurrY());
		wD = existeSala(player.getCurrX() - 1, player.getCurrY());
		Menus.menuFuent(player);
	}
	
	public void cityLogic (Player p, Room [][] d) {
		do {
			p.setCurrCoor(d[p.getCurrX()][p.getCurrY()]);
			if (p.isAlive() && (d[p.getCurrX()][p.getCurrY()].getEne().getHp() > 0 && d[p.getCurrX()][p.getCurrY()].getNumEne() > 0)) { //Si esta vivo o el enemigo de la sala tiene m�s de 0 de vida
				System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
				Pelea.enfrentamiento(p, d[p.getCurrX()][p.getCurrY()].getEne());
				if (p.getHp() <= 0) {
					Menus.menuMuert();
				}
			if ((d[p.getCurrX()][p.getCurrY()].isDescan() && d[p.getCurrX()][p.getCurrY()].getNumEne() <= 0)) {
					// Si carece de enemigos y la sala tiene fuente se activa este
					System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
					if(d[p.getCurrX()][p.getCurrY()].getNumCur() > 0) {
						//si a la fuente le quedan curas envialo al men� de fuentes.
						p.setPutridPoints(p.getPutridPoints() + 1);
						movPlayerFuent(p);
					} else {
						p.setPutridPoints(p.getPutridPoints()+1);
						movPlayer(p);
					}
			}
			} else if (p.isAlive()) {
				System.out.println(d[p.getCurrX()][p.getCurrY()].getDesc());
				p.setPutridPoints(p.getPutridPoints()+1);
				movPlayer(p);
			}
		} while (p.isAlive());
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
