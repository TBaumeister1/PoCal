import java.util.HashMap;
import java.util.Map;

public class Deck {
	private Map<Character, Integer> deck;


	public Deck() {
        this.deck = new HashMap<>();
		this.deck.put('A', 4);
		this.deck.put('K', 4);
		this.deck.put('Q', 4);
		this.deck.put('J', 4);
		this.deck.put('T', 4);
		this.deck.put('9', 4);
		this.deck.put('8', 4);
		this.deck.put('7', 4);
		this.deck.put('6', 4);
		this.deck.put('5', 4);
		this.deck.put('4', 4);
		this.deck.put('3', 4);
		this.deck.put('2', 4);
	}

    public int addCard(char card)
    {
        int numberOfCards = this.deck.get(card) + 1;
        this.deck.put(card, numberOfCards);

        return numberOfCards;
    }

	public int removeCard(char card) {
		if ( ! this.deck.containsKey(card)) {
			System.err.println("Your hand consist of a card which cannot be a legitimate card.");
		}

        int numberOfCards = this.deck.get(card) - 1;
        this.deck.put(card, numberOfCards);

        return numberOfCards;
	}

    public int getNumber(char card)
    {
        return this.deck.get(card);
    }
}
