package week06;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	//Constructor
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	public Player() {}
	
	// Getters and Setters
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public Card flip() {
		return this.hand.remove(this.hand.size() - 1);
	}
	
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void describe() {
		System.out.println("Player's name: " + this.name);
		System.out.println("Player's score: " + this.score);
		System.out.println("Player's hand: ");
		
		for (Card c : this.hand) {
			c.describe();
		}
	}
	
	public void incrementScore() {
		this.score++;
	}
	
}
