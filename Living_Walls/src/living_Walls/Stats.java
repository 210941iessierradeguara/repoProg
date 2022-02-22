package living_Walls;

import java.util.ArrayList;

public class Stats {
	private String name;
	private int Hp;
	private int maxHp;
	private String armor;
	private int def;
	private int maxDmg;
	private int minDmg;
	private int critPer;
	
	public Stats(String name, int hp, int maxHp, String armor, int def, int maxDmg, int minDmg, int critPer) {
		this.name = name;
		Hp = hp;
		this.maxHp = maxHp;
		this.armor = armor;
		this.def = def;
		this.maxDmg = maxDmg;
		this.minDmg = minDmg;
		this.critPer = critPer;
	}
	public Stats() {
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMaxDmg() {
		return maxDmg;
	}
	public void setMaxDmg(int maxDmg) {
		this.maxDmg = maxDmg;
	}
	public int getMinDmg() {
		return minDmg;
	}
	public void setMinDmg(int minDmg) {
		this.minDmg = minDmg;
	}
	public int getCritPer() {
		return critPer;
	}
	public void setCritPer(int critPer) {
		this.critPer = critPer;
	}
	
	
}
