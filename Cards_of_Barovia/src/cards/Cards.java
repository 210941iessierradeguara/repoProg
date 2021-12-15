package cards;

public class Cards {
	
	// cartas del 1 al 10 de glifos, espadas, monedas, y estrellas
	//Reyes = Ghast, Darklord, Broken One, Donjon.
	//Reinas = Innocent, Mists, Tempter, Raven.
	//Jacks = Marionette, Executioner, Beast, Seer
	//Jokers = Artifact Horseman
	
	public static String [] deck = new String [40];
	public static String [] highDeck = new String [14];
	
	public static void setDeck() {
		//low deck
		//swords
		deck[0] = "1 of swords that reads as an Avenger. The treasure lies in a dragon's house, in hands once clean and now corrupted.";
		deck[1] = "2 of swords that reads as the Paladin. I see a sleeping prince, a servant of light and the brother of darkness. The treasure lies with him.";
		deck[2] = "3 of swords that reads as the Soldier. Go to the mountains. Climb the white tower guarded by golden knights.";
		deck[3] = "4 of swords that reads as the Mercenary. The thing you seek lies with the dead, under mountains of gold coins.";
		deck[4] = "5 of swords that reads as the Myrmidon. Look for a den of wolves in the hills overlooking a mountain lake. The treasure belongs to Mother Night. ";
		deck[5] = "6 of swords that reads as the Berserker. Find the Mad Dog's crypt. The treasure lies within, beneath blackened bones";
		deck[6] = "7 of swords that reads as the Hooded One. I see a faceless god. He awaits you at the end of a long and winding road, deep in the mountains.";
		deck[7] = "8 of swords that reads as the Dictator. I see a throne fit for a king.";
		deck[8] = "9 of swords that reads as the Torturer. There is a town where all is not well. There you will find \r\n"
				+ "a house of corruption, and within, a dark room full of still ghosts.";
		deck[9] = "Master of swords that reads as the Warrior. That which you seek lies in the womb of darkness, the devil's lair: the one place to which he must return.";
		//Stars
		deck[10] = "1 of stars that reads as the Transmuter. Go to a place of dizzying heights, where the stone itself\r\n"
				+ "is alive! ";
		deck[11] = "2 of stars that reads as the Diviner. Look to the one who sees all. The treasure is hidden in\r\n"
				+ "her camp.";
		deck[12] = "3 of stars that reads as the Enchanter. I see a kneeling woman-a rose of great beauty\r\n"
				+ "plucked too soon. The master of the marsh knows of\r\n"
				+ "whom I speak. ";
		deck[13] = "4 of stars that reads as the Abjurer. I see a fallen house guarded by a great stone dragon.\r\n"
				+ "Look to the highest peak.";
		deck[14] = "5 of stars that reads as the Elementalist. The treasure is hidden in a small castle beneath a mountain, guarded by amber giants";
		deck[15] = "6 of stars that reads as the Evoker. Search for the crypt of a wizard ordinaire. His staff\r\n"
				+ "is the key.";
		deck[16] = "7 of stars that reads as the illusionist. A man is not what he seems. He comes here in a carnival\r\n"
				+ "wagon. Therein lies what you seek.";
		deck[17] = "8 of stars that reads as the Necromancer. A woman hangs above a roaring fire. Find her, and you\r\n"
				+ "will find the treasure.";
		deck[18] = "9 of stars that reads as the Conjurer. I see a dead village, drowned by a river, ruled by one who\r\n"
				+ "has brought great evil into the world";
		deck[19] = "Master of stars that reads as the Wizard. Look for a wizard's tower on a lake. Let the wizard's\r\n"
				+ "name and servant guide you to that which you seek.";
		//coins
		deck[20] = "1 of coins that reads as ";
		deck[21] = "2 of coins that reads as ";
		deck[22] = "3 of coins that reads as ";
		deck[23] = "4 of coins that reads as ";
		deck[24] = "5 of coins that reads as ";
		deck[25] = "6 of coins that reads as ";
		deck[26] = "7 of coins that reads as ";
		deck[27] = "8 of coins that reads as ";
		deck[28] = "9 of coins that reads as ";
		deck[29] = "Master of coins that reads as ";
		//glyphs
		deck[30] = "1 of glyphs that reads as ";
		deck[31] = "2 of glyphs that reads as ";
		deck[32] = "3 of glyphs that reads as ";
		deck[33] = "4 of glyphs that reads as ";
		deck[34] = "5 of glyphs that reads as ";
		deck[35] = "6 of glyphs that reads as ";
		deck[36] = "7 of glyphs that reads as ";
		deck[37] = "8 of glyphs that reads as ";
		deck[38] = "9 of glyphs that reads as ";
		deck[39] = "Master of glyphs that reads as ";
		//high Deck
		highDeck[0] = "The ghost";
		highDeck[1] = "The innocent";
		highDeck[2] = "The marionette";
		highDeck[3] = "The darklord";
		highDeck[4] = "The Mists";
		highDeck[5] = "The exceutioner";
		highDeck[6] = "The broken one";
		highDeck[7] = "The temper";
		highDeck[8] = "The beast";
		highDeck[9] = "The donjon";
		highDeck[10] = "The raven";
		highDeck[11] = "The seer";
		highDeck[12] = "The artifact";
		highDeck[13] = "The horseman";
	}
	
	public static void draw(int card) {
		System.out.println(deck[card]);
	}
	
	public static void drawHigh(int card) {
		System.out.println(highDeck[card]);
	}

}
