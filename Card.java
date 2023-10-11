package week06;

public class Card {

	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Getters and Setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Method for printing out the name and value of the card
	public void describe() {
		System.out.println(this.name);
	}

}
