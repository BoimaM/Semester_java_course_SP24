package project_1;

import java.util.ArrayList;
import java.util.Collections;

public class TestPlayingCardArrayList {

    public static void main(String[] args) {

        ArrayList<PlayingCard> deck = new ArrayList<>();
        //Construct the 52 PlayingCards in a standard deck of cards
        for(int suit = 1; suit <= 4; suit++){
            for (int cardVal = 1; cardVal <= 13; cardVal++){
                deck.add(new PlayingCard(cardVal,suit));
            }
        }
        //Display the value and suit of every PlayingCard in the deck
        System.out.println(deck);

        //Prints the deck amount just be make sure there's 52 cards:
        System.out.println("Deck amount: " + deck.size());

        //Shuffle the deck & print
        Collections.shuffle(deck);
        System.out.println("Shuffled Deck: " + deck);
    }
}

