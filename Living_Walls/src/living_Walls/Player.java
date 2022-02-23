package living_Walls;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Player extends Stats implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Random ins = new Random();
	private String Pclass;
	private int currX;
	private int currY;
	private Room currCoor;
	private int PutridPoints;
	private int MaxPutrid; // a cada sala aumenta en 1 el nivel de pudredumbre, la podredumbre permite usar hechizos pero llegar al máximo de esta te mata y te vuelve una fragmento pútrido
	private String Wep;
	private int level;
	private int xp;
	private boolean Aberration;
	private int bastPla;
	private static ArrayList<Item> inv; // = new ArrayList<String>(); 
	
	//https://codereview.stackexchange.com/questions/171431/text-based-rpg-dungeon-game-in-java
	
	
	
	// no auto-gen
	
	public int Dmg() {
		return Main_Walls.Dice.nextInt(this.getMaxDmg() - this.getMinDmg() + 1);
	}

	public Player(String name, int hp, int maxHp, String armor, int def, int maxDmg, int minDmg, int critPer,
			String pclass, int putridPoints, int maxPutrid, String wep, int level,
			int xp, boolean aberration, int bastPla, ArrayList<Item> inv) {
		super(name, hp, maxHp, armor, def, maxDmg, minDmg, critPer);
		this.Pclass = pclass;
		this.PutridPoints = putridPoints;
		this.MaxPutrid = maxPutrid;
		this.Wep = wep;
		this.level = level;
		this.xp = xp;
		this.Aberration = aberration;
		this.bastPla = bastPla;
		this.inv = inv;
		this.currX = 14;
		this.currY = 14;
	}
	

	public void Rest() {
		this.setHp(this.getMaxHp());
		this.setPutridPoints((int) (this.getPutridPoints() + 4));
	}
	
	public void Stats() {
		System.out.println("********************************************************************************");
		System.out.print("Nombre: ");
		System.out.println(this.getName());
		System.out.print("Clase: ");
		System.out.println(this.getPclass());
		System.out.print("PV: ");
		System.out.println(this.getHp());
		System.out.print("Arma: ");
		System.out.println(this.getWep());
		System.out.print("Tipo de armadura y Defensa: ");
		System.out.print(this.getArmor());
		System.out.print(" || ");
		System.out.println(this.getDef());
		System.out.print("Bastones de plata: ");
		System.out.println(this.getBastPla());
		System.out.print("Nivel: ");
		System.out.println(this.getLevel());
		System.out.print("Experiencia: ");
		System.out.println(this.getXp());
		if (this.Aberration) {
			System.out.println("Eres un aberrante.");
			System.out.print("Podredumbre: ");
			System.out.println(this.getPutridPoints());
		}
		System.out.println("********************************************************************************");
		System.out.println("Objetos: ");
		System.out.println(inv);
		System.out.println("********************************************************************************");
	}
	
	public static Player newExiliated() {
		return new Player("PlaceHolder", 10, 10, "Jubón Raido", 10, 8, 1, 2, 
				"Exiliado", 3, 30, "Cayado", 1, 0, true, 0, inv);
	}
	
	public boolean isAlive() {
		return this.getHp() > 0;
	}
	
	//auto gen
	
	public int getCurrX() {
		return currX;
	}


	public void setCurrX(int currX) {
		this.currX = currX;
	}


	public int getCurrY() {
		return currY;
	}


	public void setCurrY(int currY) {
		this.currY = currY;
	}


	public ArrayList<Item> getInv() {
		return inv;
	}

	public void setInv(ArrayList<Item> inv) {
		this.inv = inv;
	}
	
	public int getPutridPoints() {
		return PutridPoints;
	}


	public void setPutridPoints(int putridPoints) {
		PutridPoints = putridPoints;
	}

	public int getMaxPutrid() {
		return MaxPutrid;
	}


	public void setMaxPutrid(int maxPutrid) {
		MaxPutrid = maxPutrid;
	}

	public String getWep() {
		return Wep;
	}

	public void setWep(String wep) {
		Wep = wep;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public boolean isAberration() {
		return Aberration;
	}

	public void setAberration(boolean aberration) {
		Aberration = aberration;
	}

	public int getBastPla() {
		return bastPla;
	}

	public void setBastPla(int bastPla) {
		this.bastPla = bastPla;
	}

	public String getPclass() {
		return Pclass;
	}

	public void setPclass(String pclass) {
		Pclass = pclass;
	}

	
	public Room getCurrCoor() {
		return currCoor;
	}

	public void setCurrCoor(Room currCoor) {
		this.currCoor = currCoor;
	}
	

}
