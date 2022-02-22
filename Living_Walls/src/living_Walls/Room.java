package living_Walls;

import java.io.Serializable;

public class Room implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String desc;
	private final Enemy ene;
	private int numEne;
	private final boolean boss;
	private final boolean descan;
	private int numCur;
	
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
		int numCur = 0;
		
		// int sala = Dices.Thirty();
		int sala = Dices.Four();
		switch(sala) {
			case 1:
				desc = " Una solitaria calle, la sensación opresiva es constante"
						+ " casi como si hubiera algo observando, la extraña prodredumbre"
						+ " inunda esta como otras calles, una extraña masa "
						+ "oscura y dura como el tronco de un olivo de grosores "
						+ "ariados, desde grueso como tronco humano hasta fino como"
						+ " un hilo de lana. En ambos casos tocar la podredumbre"
						+ " no parece hacer nada al tocarla pero la sensación de "
						+ "angustia al pensar en ello te abruma.";
				numEne = 0;
				return new Room(desc, Enemy.newNo(), numEne, boss, descan, numCur);
			case 2:
				desc = "testComb_01";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, boss, descan, numCur);
			case 3:
				desc = "testComb_02";
				numEne = 1;
				return new Room(desc, Enemy.newFragmento() ,numEne, boss, descan, numCur);
			case 4:
				desc = "Fuent_Defalt";
				numEne = 0;
				descan = true;
				numCur = 10;
				return new Room(desc, Enemy.newNo() ,numEne, boss, descan, numCur);
		}
		 return new Room(desc, Enemy.newFragmento() ,numEne, boss, descan, numCur);
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

	public void setNumEne(int numEne) {
		this.numEne = numEne;
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
		this.numCur = numCur;
	}
	
	
}
