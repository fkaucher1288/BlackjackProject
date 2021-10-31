package com.skilldistillery.cards;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	public int getHandValue() {
		int handValue = 0;

		for (Card card : hand) {
			handValue += card.getValue();

		}
		return handValue;

	}

	public boolean isBlackjack() {
		int value = getHandValue();
		if (value == 21) {
			return true;

		}
		return false;

	}

	public boolean isBust() {
		int value = getHandValue();
		if (value > 21) {
			return true;
		}
		return false;
	}

	
	
}