package ch13.miniProject;

import java.util.ArrayList;
import java.util.Collections;

class Card {
    String suit;
    String rank;

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
	private ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for (String suit : suits) {
			for (String rank : ranks) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card deal() {
		if (cards.size() > 0) {
			return cards.remove(cards.size() - 1);
		} else {
			return null;
		}
	}
}

class Player {
	private String name;
	private ArrayList<Card> hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
	}
	
	public void getCard(Card card) {
		if (card != null) {
			hand.add(card);
		}
	}
	
	public void showCards() {
		System.out.println(name + "'s Hand: " + hand);
	}
}

public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Alice");
		Player player2 = new Player("Bob");
		
		int cardsPerPlayer = 5;
		for (int i = 0; i < cardsPerPlayer; i++) {
			player1.getCard(deck.deal());
			player2.getCard(deck.deal());
		}
		
		player1.showCards();
		player2.showCards();
	}
}
