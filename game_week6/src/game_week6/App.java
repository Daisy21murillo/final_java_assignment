package game_week6;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		//System.out.println(deck.cards);
		
		Player daisy = new Player("Daisy");
		Player sally = new Player("Sally");
		
		
		deck.shuffle();
		//System.out.println(deck.cards);
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				daisy.draw(deck);
			} else {
				sally.draw(deck);
			}
		} 
		
		daisy.decribe();
		sally.decribe();
		
		//for(int i = 0; i < 26; i++) {
			Card daisyCard = daisy.flip();
			Card sallyCard = daisy.flip();

			if(daisyCard.getValue() > sallyCard.getValue()) {
				daisy.incrementScore();
			} else if (sallyCard.getValue() > daisyCard.getValue()) {
				sally.incrementScore();
			} else if (sallyCard.getValue() == daisyCard.getValue()) {
				sally.incrementScore();
				daisy.incrementScore();
			} 
		//}

		
		if(daisy.getScore() > sally.getScore()) {
			System.out.println(daisy.getName() + " is the Winner! Score: " + daisy.getScore());
			System.out.println(sally.getName() + " has lost. Score: " + sally.getScore());
		} else if (daisy.getScore() < sally.getScore()) {
			System.out.println(sally.getName() + " is the Winner! Score: " + sally.getScore());
			System.out.println(daisy.getName() + " has lost. Score: " + daisy.getScore());
		} else if (daisy.getScore() == sally.getScore()) {
			System.out.println("Draw!" + daisy.getName() + " & " + sally.getName() + " have tied! Score: " + daisy.getScore());
		} 
		
	}

}
