package com.skilldistillery.cards;

public enum Suit {
	HEARTS("Hearts"),SPADES("Spades"),CLUBS("Clubs"),DIAMONDS("Diamonds");
	
	private final String name;
	
	Suit(String n) {
		name = n;
		
	}
	
	public String getName() {
		return name;
		}

	public String toString() {
		return name;
	}

}
	




