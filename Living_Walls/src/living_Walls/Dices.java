package living_Walls;

import java.util.Random;

public class Dices {
	private static final Random dice = new Random();
	
	public static int Hundred() {
		int n = dice.nextInt(101);
		while (n == 0) {
			n = dice.nextInt(101);
		} // 1-100
		return n;
	}
	
	public static int Thirty() {
		int n = dice.nextInt(31);
		while (n == 0) {
			n = dice.nextInt(31);
		} // 1-100
		return n;
	}
	
	public static int Twenty() {
		int n = dice.nextInt(21);
		while (n == 0) {
			n = dice.nextInt(21);
		} // 1-20
		return n;
	}
	
	public static int Twelve() {
		int n = dice.nextInt(13);
		while (n == 0) {
			n = dice.nextInt(13);
		} // 1-12
		return n;
	}
	
	public static int Ten() {
		int n = dice.nextInt(11);
		while (n == 0) {
			n = dice.nextInt(11);
		} // 1-10
		return n;
	}
	
	public static int Eight() {
		int n = dice.nextInt(9);
		while (n == 0) {
			n = dice.nextInt(9);
		} // 1-8
		return n;
	}
	
	public static int Six() {
		int n = dice.nextInt(7);
		while (n == 0) {
			n = dice.nextInt(7);
		} // 1-6
		return n;
	}
	
	public static int Four() {
		int n = dice.nextInt(5);
		while (n == 0) {
			n = dice.nextInt(5);
		} // 1-4
		return n;
	}

	public static Random getDice() {
		return dice;
	}
}
