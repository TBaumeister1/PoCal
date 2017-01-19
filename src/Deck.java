import java.util.HashMap;

public class Deck {
	private HashMap<String, Integer> deck;
	
	public Deck() {
		 //Initiate combo's in HashMap
		this.deck = new HashMap<String, Integer>();
		this.deck.put("A", 4);
		this.deck.put("K", 4);
		this.deck.put("Q", 4);
		this.deck.put("J", 4);
		this.deck.put("T", 4);
		this.deck.put("9", 4);
		this.deck.put("8", 4);
		this.deck.put("7", 4);
		this.deck.put("6", 4);
		this.deck.put("5", 4);
		this.deck.put("4", 4);
		this.deck.put("3", 4);
		this.deck.put("2", 4);
	}
	
	public void removeCard(String card) {
		if ( ! this.deck.containsKey(card)) {
			System.err.println("Your hand consist of a card which cannot be a legitimate card");
		}
		
		this.deck.put(card, this.deck.get(card) - 1);
	}
}
