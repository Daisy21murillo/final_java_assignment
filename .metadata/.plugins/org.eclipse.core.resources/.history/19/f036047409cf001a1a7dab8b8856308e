package game_week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String playerName;
	
	public Player(String player) {
		this.playerName = player;
	}

	public void decribe() {
		System.out.println(toString());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}

	public List<Card> getHand() {
		return hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return playerName;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Player name: ").append(playerName).append("\n");
		builder.append(" Hand:\n");
		
		for(Card cards : hand) {
			builder.append("").append(cards).append("\n");
		}
		return builder.toString();		
	}
	
}
