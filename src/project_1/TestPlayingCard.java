package project_1;

// Name: Masfort Boima

//Construct 52 Playing Cards and add them to a deck.

public class TestPlayingCard {
    public static void main(String[] args) {

        //Construct an array of 52 PlayingCard objects called deck.
        // Array holds capacity == 52 cards
        PlayingCard[] deck = new PlayingCard[52];

        //Lopp over the 52 PlayingCards in a standard deck of cards
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int cardVal = 1; cardVal <= 13; cardVal++) {
                deck[index] = new PlayingCard(cardVal, suit);
                index++;
            }
        }
        //Display the value and suit of every PlayingCard in the deck
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
        //Prints deck amount to ensure there's 52 cards:
        System.out.println("Deck amount: " + deck.length);
    }
}
