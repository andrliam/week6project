package week06;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<>();
	
	private String[] nameArray = {"Spades", "Hearts", "Clubs", "Diamonds"};
	
	
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}


	public Deck() {
		
		for (int value = 1; value <= 14; value++) {
			for (String suit : nameArray) {
				
				String finalName = "";
				
				if (value == 1) {
					finalName += "Ace of ";
				}
				else if (value == 2){
					finalName+= "Two of ";
				}
				else if (value == 3){
					finalName+= "Three of ";
				}
				else if (value == 4){
					finalName+= "Four of ";
				}
				else if (value == 5){
					finalName+= "Five of ";
				}
				else if (value == 6){
					finalName+= "Six of ";
				}
				else if (value == 7){
					finalName+= "Seven of ";
				}
				else if (value == 8){
					finalName+= "Eight of ";
				}
				else if (value == 9){
					finalName+= "Nine of ";
				}
				else if (value == 10){
					finalName+= "Ten of ";
				}
				else if (value == 11){
					finalName+= "Jack of ";
				}
				else if (value == 12){
					finalName+= "Queen of ";
				}
				else {
					finalName+= "King of ";
				}
				
				finalName += suit;
				
				
				Card card = new Card(value, finalName);
				cards.add(card);
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		return this.cards.remove(cards.size() - 1);
	}
}
