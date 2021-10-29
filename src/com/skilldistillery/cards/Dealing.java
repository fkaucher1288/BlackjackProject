package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealing {

	public static void main(String[] args) {
		Dealing dealing = new Dealing();
		dealing.deal();

	}

	public void deal() {

		// get a deck of cards
		Deck deck = new Deck();

		// shuffle the deck
		deck.shuffle();

		// ask the user "how many cards do they want?
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cards would you like?");
		int howMany = sc.nextInt();
		sc.nextLine();
		
		List<Card> userHand = new ArrayList<>();
		int handTotal = 0;
		

		// deal the requested number of cards to the user
		for(int numCard=0; (numCard < howMany) && (deck != null) && (deck.checkDeckSize() > 0 ) && 
		( howMany < deck.checkDeckSize());
				numCard++);
	
		// user puts cards in their hand
		Card dealtCard = deck.dealCard();
		userHand.add(dealtCard);
		
		
		// the user adds up the value of the hand
		handTotal += dealtCard.getValue();
		
		
		// have the user show their hand
		System.out.println("player total of hand: " + handTotal);
		for(Card card : userHand) {
			System.out.println(card);
		}
		
		
	}
}
