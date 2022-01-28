package living_Walls;

import java.util.Random;

public class Room {
	private final String desc;
	private final Enemy ene;
	private final int numEne;
	private final boolean boss;
	
	public Room(String desc, Enemy ene, int numEne, boolean boss) {
		super();
		this.desc = desc;
		this.ene = ene;
		this.numEne = numEne;
		this.boss = boss;
	}

	public static Room newRoom() {
		String desc = null;
		int numEne = 0;
		boolean boss = false;
		
		// int sala = Dices.Thirty();
		int sala = Dices.Four();
		switch(sala) {
			case 1:
				desc = " Una solitaria calle, la sensación opresiva es constante"
						+ "casi como si hubiera algo observando, la extraña prodredumbre"
						+ " inunda esta como otras calles, una extraña masa "
						+ "oscura y dura como el tronco de un olivo de grosores "
						+ "ariados, desde grueso como tronco humano hasta fino como"
						+ " un hilo de lana. En ambos casos tocar la podredumbre"
						+ "no parece hacer nada al tocarla pero la sensación de "
						+ "angustia al pensar en ello te abruma.";
				numEne = 0;
				return new Room(desc, Enemy.newNo(), numEne, false);
			case 2:
				desc = "Una abandonada taberna con un fragmento";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, false);
			case 3:
				desc = "Dos abandonada taberna con un fragmento";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, false);
			case 4:
				desc = "Tres abandonada taberna con un fragmento";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, false);
		}
		 return new Room(desc, Enemy.newFragmento() ,numEne, false);
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
	
	
}
