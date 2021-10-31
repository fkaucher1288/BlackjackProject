package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> hand = new ArrayList<>();
	
	public Hand() {}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void clear() {
		hand.clear();
	}
	
	public abstract int getHandValue();
	
	public abstract boolean isBlackjack();
	
	public abstract boolean isBust();

	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}
}
