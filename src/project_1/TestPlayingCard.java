package project_1;

// Name: Masfort Boima

//Construct 52 Playing Cards and add them to a deck.

public class TestPlayingCard {
    public static void main(String[] args) {

        //Construct an array of 52 PlayingCard objects called deck.
        PlayingCard[] deck = new PlayingCard[52];

        //Construct the 52 PlayingCards in a standard deck of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[index] = new PlayingCard(value, suit);
                index++;
            }
        }
        //Display the value and suit of every PlayingCard in the deck
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
