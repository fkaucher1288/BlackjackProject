package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {

	private Deck deck = new Deck();

	
	public Card deal() {
		
		return deck.dealCard();
	}

	public boolean hit() {

		int value = hand.getHandValue();
		if (value < 17) {
			return true;
		}
		return false;
	}
	
	public Deck getDeck() {
		return deck;
	}

	public boolean stay() {
		
		int value = hand.getHandValue();
		if (value >= 17) {
			return true;
		}return false;
	}
	
	@Override
	public Hand getHand() {
		return hand;
	}
	
	
}
