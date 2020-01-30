package Lab4;

import java.util.Scanner;
public class Deal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int PLAYERS = input.nextInt();
        int CARDS_PER_PLAYERS =5;

        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int n = SUITS.length * RANKS.length;
        if (CARDS_PER_PLAYERS * PLAYERS > n ) {
            throw new RuntimeException("Not enough cards!");
        }
        String[] deck = new String[n];
        for(int i = 0; i < RANKS.length; i++){
            for(int j = 0; j < SUITS.length; j++){
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j]; // make all cards to a deck.
             }
        }
        for ( int i =0; i < n ; i++){
            int r = i + (int) (Math.random()*(n-i)); // shuffle all the cards.
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for( int i =0 ; i < PLAYERS * CARDS_PER_PLAYERS ; i++ ){
            System.out.println(deck[i]);
            if(i%CARDS_PER_PLAYERS == CARDS_PER_PLAYERS -1 ){
                System.out.println();
            }
        }

    }
}
