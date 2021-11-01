package com.skilldistillery.cards;

import java.util.Scanner;

public class BlackJackApp {

	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to BlackJack App!! Press enter to start the game.");
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
		int playerCardTotal;
		boolean getAnotherCard = true;

		boolean playerBust = false;

		do {
			int hitOrStay = 0;

			System.out.println("Would you like to hit or stay? Press 1 for hit, 2 for stay");
			hitOrStay = sc.nextInt();
			sc.nextLine();
			if (hitOrStay == 1) {
				player.hand.addCard(dealer.deal());
				System.out.println("Player " + player.hand);
			} else if (hitOrStay == 2) {
				getAnotherCard = false;
				System.out.println("Player stays");
				break;
			}

			playerBust = player.hand.isBust();
			if (playerBust == true) {
				System.out.println("Player busted! Game over.");
				getAnotherCard = false;
			}

		} while (getAnotherCard == true);

		boolean dealerBust = dealer.hand.isBust();
		if (playerBust != true) {
			while (dealer.hand.getHandValue() < 17) {
				if (dealer.hit() == true) {
					dealer.hand.addCard(dealer.deal());
					System.out.println("Dealer " + dealer.hand);
				} else if (dealer.hand.getHandValue() >= 17) {
					System.out.println("Dealer " + dealer.hand + " Dealer stays");
				}
			}System.out.println("Dealer has " + dealer.hand);
		}

		// Dealer shows value of own hand
		// If total hand value is under 17, dealer hits.
		// If value is over 17, dealer stays.
		// Check if blackjack or bust

		// If dealer takes another card check if blackjack or bust
		// Dealer stays, compare value of dealers hand to players hand
		// Declare a winner
		System.out.println("Program exited");
	}
}
