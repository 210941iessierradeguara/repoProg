package living_Walls;

import java.util.Random;

public class Room {
	private final String desc;
	private final Enemy ene;
	private final int numEne;
	private final boolean boss;
	private final boolean descan;
	private static int numCur;
	
	public Room(String desc, Enemy ene, int numEne, boolean boss, boolean descan, int numCur) {
		super();
		this.desc = desc;
		this.ene = ene;
		this.numEne = numEne;
		this.boss = boss;
		this.descan = descan;
		this.numCur = numCur;
	}

	public static Room newRoom() {
		String desc = null;
		int numEne = 0;
		boolean boss = false;
		boolean descan = false;
		
		// int sala = Dices.Thirty();
		int sala = Dices.Four();
		switch(sala) {
			case 1:
				desc = " Una solitaria calle, la sensaci�n opresiva es constante"
						+ " casi como si hubiera algo observando, la extra�a prodredumbre"
						+ " inunda esta como otras calles, una extra�a masa "
						+ "oscura y dura como el tronco de un olivo de grosores "
						+ "ariados, desde grueso como tronco humano hasta fino como"
						+ " un hilo de lana. En ambos casos tocar la podredumbre"
						+ " no parece hacer nada al tocarla pero la sensaci�n de "
						+ "angustia al pensar en ello te abruma.";
				numEne = 0;
				return new Room(desc, Enemy.newNo(), numEne, false, false, 0);
			case 2:
				desc = "Una abandonada taberna con un fragmento";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, false, false, 0);
			case 3:
				desc = "Dos abandonada taberna con un fragmento";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, false, false, 0);
			case 4:
				desc = "Fuent_Defalt";
				numEne = 0;
				return new Room(desc, Enemy.newNo() ,numEne, false, true, 10);
		}
		 return new Room(desc, Enemy.newFragmento() ,numEne, false, false, 0);
	}

	public String getDesc() {
		return desc;
	}

	public Enemy getEne() {
		return ene;
	}

	public int getNumEne() {
		return numEne;
	}

	public boolean isBoss() {
		return boss;
	}

	public boolean isDescan() {
		return descan;
	}

	public int getNumCur() {
		return numCur;
	}

	public void setNumCur(int numCur) {
		Room.numCur = numCur;
	}
	
	
}
