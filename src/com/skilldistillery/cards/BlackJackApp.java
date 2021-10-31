package com.skilldistillery.cards;

import java.util.Scanner;

public class BlackJackApp {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to BlackJack App!! Press enter to start game.");
		sc.nextLine();

		dealer.getDeck().shuffle();
		player.getHand().addCard(dealer.deal());
		// Dealer removes top card, deals face up to player.
		dealer.getHand().addCard(dealer.deal());
		// Dealer removes top card, deals face down to dealer.
		player.getHand().addCard(dealer.deal());
		// Dealer removes top card, deals face up to player.
		dealer.getHand().addCard(dealer.deal());
		// Dealer removes top card, deals face up to dealer.
		player.getHand().getHandValue();
		System.out.println("Player " + player.hand);
		System.out.println("Dealer " + dealer.hand);
		boolean dealerBlackjack = dealer.hand.isBlackjack();
		boolean playerBlackjack = player.hand.isBlackjack();
		// Player gets their Hand value.
		if (dealerBlackjack == true && playerBlackjack == true) {
			System.out.println("Push");
		} else if (dealerBlackjack == true && playerBlackjack == false) {
			System.out.println("Blackjack! Dealer wins!");
		} else if (dealerBlackjack == false && playerBlackjack == true) {
			System.out.println("Blackjack! Player wins!");
		}
		// check if blackjack

		System.out.println("Would you like to hit or stay? Press 1 for hit, 2 for stay");
		int hitOrStay = sc.nextInt();
		sc.nextLine();
		boolean playerBust = player.hand.isBust();
		boolean dealerBust = dealer.hand.isBust();
		if (hitOrStay == 1) {
			player.hand.addCard(dealer.deal());
			System.out.println("Player " + player.hand);
		} else if (hitOrStay == 2) {
			System.out.println("Player stays");
		}
		if (playerBust == true) {
			System.out.println("Player busted! Game over.");
		} else if (playerBust == false) {
			System.out.println("Would you like to hit or stay? Press 1 for hit, 2 for stay");

		}

		int hitOrStay1 = sc.nextInt();
		sc.nextLine();
		if (hitOrStay1 == 1) {
			player.hand.addCard(dealer.deal());
			System.out.println("Player " + player.hand);
		} else if (hitOrStay1 == 2) {
			System.out.println("Player stays");
		}
		
		if (playerBust == true) {
			System.out.println("Player busted! Game over.");
		} else if (playerBust == false) {
			System.out.println("Would you like to hit or stay? Press 1 for hit, 2 for stay");
			// ask player if they would like to hit.
			// if player wants to hit, deal another card to the players hand
			// check if bust or blackjack
			// if player wants to stay, show players hand value.
		
		
			
			// Dealer shows value of own hand
		// If total hand value is under 17, dealer hits.
		// If value is over 17, dealer stays.
		// Check if blackjack or bust
		// If dealer takes another card check if blackjack or bust
		// Dealer stays, compare value of dealers hand to players hand
		// Declare a winner
	}

}
