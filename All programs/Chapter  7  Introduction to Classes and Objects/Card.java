// Fig. 7.11: Card.java
// Card class represents a playing card.

public class Card {
	private final String face; // face of card ("Ace", "Deuce", ...)
	private final String suit; // suit of card ("Hearts", "Diamonds", ...)
	
	// two-argument constructor initializes card's face and suit
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // initialize face of card
		this.suit = cardSuit; // initialize suit of card
	}
	
	// return String representation of Card
	public String toString() {
		return face + " of " + suit;
	}
} // end class Card
