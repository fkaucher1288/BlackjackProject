package com.skilldistillery.cards;

public class Player {
	protected Hand hand;
	//check the value of the hand 
	public Player() {
		hand = new BlackJackHand();
		
	}
	public Hand getHand() {
		return hand;
	}
	
	
	
	}
	
	

