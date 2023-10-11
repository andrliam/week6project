package week06;

public class App {

	public static void main(String args[]) {
		System.out.println(" __      __               \r\n"
				+ "/  \\    /  \\_____ _______ \r\n"
				+ "\\   \\/\\/   /\\__  \\\\_  __ \\\r\n"
				+ " \\        /  / __ \\|  | \\/\r\n"
				+ "  \\__/\\  /  (____  /__|   \r\n"
				+ "       \\/        \\/       ");
		System.out.println("---------------------------------------------\nGame Start!\n");
		
		//instantiate deck and 2 players
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		
		Player player1 = new Player("Joe");
		Player player2 = new Player("Donald");
		
		System.out.println("Player 1: " + player1.getName());
		System.out.println("Player 2: " + player2.getName());
		
		System.out.println("\nBegin!\n");
		
		
		//Divide cards amongst the players
		for (int i = 0; i < 52; i++) {
			
			if ( i % 2 == 0) {
				player1.draw(gameDeck);
			}
			
			else {
				player2.draw(gameDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card p1Card = player1.flip();
			p1Card.describe();
			Card p2Card = player2.flip();
			p2Card.describe();
			
			if ( p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.name + " has won the round and recieved one point\n" );
			}
			
			else if (p1Card.getValue() < p2Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.name + " has won the round and recieved one point\n" );
			}
			else { //cards have same value
				System.out.println("It was a tie! no points awarded\n");
			}
			System.out.println("Scores:\n" + player1.getName() + ": " + player1.getScore() 
							+ "\n"+ player2.getName() + ": " + player2.getScore() + "\n");
		}
		
		System.out.println("Final Scores:\n" + player1.getName() + ": " + player1.getScore() 
							+ "\n"+ player2.getName() + ": " + player2.getScore() + "\n");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1, " + player1.getName() + ", has won");
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2, " + player2.getName() + ", has won");
		}
		else {
			System.out.println("Draw, both players have the same score");
		}
		
		System.out.println("Thanks for playing!");
		
	}
}
