package table;

import java.util.Random;
import java.util.Scanner;

public class Table {
	public static Scanner s = new Scanner(System.in);
	public static boolean searchStrahd = false;
	public static int select;
	public static int card;
	public static int card2;
	public static int card3;
	public static int card4;
	public static int card5;

	public static void firstDraw() {
		if (searchStrahd = true) {
			System.out.println(
					"This card tells of history. Knowledge of the ancient will help you better understand your enemy.");
			card = drawLow();
			cards.Cards.draw(card);
			secondDraw();
		} else if (searchStrahd = false) {
			System.out.println("The first draw tells: ");
			card = drawLow();
			cards.Cards.draw(card);
			secondDraw();
		}
	}

	public static void secondDraw() {
		if (searchStrahd = true) {
			System.out.println("");
			System.out.println(
					"This card tells of a powerful force for good and protection, a holy symbol of great hope");
			card2 = drawLow();
			while (card2 == card) {
				card2 = drawLow();
			}
			cards.Cards.draw(card2);
		} else if (searchStrahd = false) {
			System.out.println("");
			System.out.println("The second draw tells: ");
			card2 = drawLow();
			while (card2 == card) {
				card2 = drawLow();
			}
			cards.Cards.draw(card2);
		}
	}

	public static void thirdDraw() {
		if (searchStrahd = true) {
			System.out.println("");
			System.out.println(
					"This is a card of power and strength. It tells of a weapon of vengeance: a sword of sunlight.");
			card3 = drawLow();
			while (card3 == card || card3 == card2) {
				card3 = drawLow();
			}
			cards.Cards.draw(card3);
		} else if (searchStrahd = false) {
			System.out.println("");
			System.out.println("The third draw tells: ");
			card3 = drawLow();
			while (card3 == card || card3 == card2) {
				card3 = drawLow();
			}
			cards.Cards.draw(card3);
		}
	}

	public static void forthDraw() {
		if (searchStrahd = true) {
			System.out.println("");
			System.out
					.println("This card sheds light on one who will help you greatly in the battle against darkness.");
		} else if (searchStrahd = false) {
			System.out.println("");
			System.out.println("The forth draw tells: ");
		}
	}

	public static void FithDraw() {
		if (searchStrahd = true) {
			System.out.println("");
			System.out.println(
					"Your enemy is a creature of darkness, whose powers are beyond mortality. This card will lead you to him");
		} else if (searchStrahd = false) {
			System.out.println("");
			System.out.println("The fith draw tells: ");
		}
	}

	public static void main(String[] args) {
		System.out.println("The winds in Barovia howl as the dim sunlight hides under the hills.");
		System.out.println("The woman in the tent lays eyes on thee, she shuffles her deck and lays it on the table.");
		System.out.println("-Would you like a readind? --Asks the woman with a decrepit voice.");
		System.out.println("1- A normal one.");
		System.out.println("2- Tell me what he desires, Tell me who hates him, and tell me where he hides.");
		select = s.nextInt();

		switch (select) {
		case 1:
			System.out.println("Sit down and listen to me cards.");
			searchStrahd = false;
			firstDraw();
			break;
		case 2:
			System.out.println("Sit down as I tell thee about he whom is the land.");
			searchStrahd = true;
			firstDraw();
			break;
		default:
			System.out.println("Oh dear, thats not an option.");
			break;
		}

	}

	public static int drawLow() {
		Random rand = new Random();
		int n = rand.nextInt(40);
		// The low deck 40 cards total
		return n;
	}

	public static int drawHigh() {
		Random rand = new Random();
		int n = rand.nextInt(14);
		// The high deck 14 cards total
		return n;
	}

}
