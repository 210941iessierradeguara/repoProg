package living_Walls;

import java.util.Random;

public class Enemy extends Stats{
	private static final Random ins = new Random();
	private String desc;
	private int PutridCle;
	public Enemy(String name, int hp, int maxHp, String armor, int def, int maxDmg, int minDmg, int critPer,
			String desc, int putridCle) {
		super(name, hp, maxHp, armor, def, maxDmg, minDmg, critPer);
		this.desc = desc;
		PutridCle = putridCle;
	}
	
	public static Enemy newFragmento() {
		return new Enemy("Fragmento Pútrido", 10, 10, "Carece de armadura", 13, 4, 1, 2 ," Una forma humanoide, cubierta en una especie de brea que refleja el sol con intesidad"
				+ " camina sin rumbo alguno y parece tan perdido como tú, fuera como fuere, un elemento altamente violento de la antigua"
				+ " capital imperial", 1);
	}
	public static Enemy newNo() {
		return new Enemy("No hay enemigos", 0, 0, "Carece", 0, 0, 0, 0, "a", 0);
	}
	
	public int dmg() {
		return Main_Walls.Dice.nextInt(this.getMaxDmg() - this.getMinDmg() + 1);
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPutridCle() {
		return PutridCle;
	}

	public void setPutridCle(int putridCle) {
		PutridCle = putridCle;
	}
	
	
}
