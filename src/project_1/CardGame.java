package project_1;
/*
Your name: Masfort Boima
CardGame.java: Contains a deck of PlayingCards and basic methods for a card game
*/

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    // instance variables
    ArrayList<PlayingCard> deck;

    //constructor(s):
    /***
     *
     * @param shuffle optional deck shuffle
     */
    public CardGame(boolean shuffle){
        getNewDeck(shuffle);
    }

    //Methods:

    /**
     * Get new deck and optionally shuffle it for every new game.
     * @param shuffle
     */
    public void getNewDeck(boolean shuffle)
    {
        ArrayList<PlayingCard> newDeck = new ArrayList<PlayingCard>();
        int cardNum = 0;
        for (int value = 1; value <= 13; value++) {
                for (int suit = 1; suit <= 4; suit++) {
                    newDeck.add(new PlayingCard(value, suit));
                }
        }
        deck = newDeck;
        if (shuffle) Collections.shuffle(deck);
    }

    /***
     * Print the whole deck, one card per line of output
     */
    public void printDeck(){
        for (int i = 0; i <= deck.size(); i++){
            PlayingCard card = deck.get(i);
            System.out.println(card.getValue() + "of" + card.getSuit());
        }
    }
    /***
     * Get PlayingCard from the start (top) of deck
     * @return The card drawn
     */
    public PlayingCard draw(){
        return deck.removeFirst();
    }

    /***
     * Get PlayingCards from start (top) of the deck
     * @param  numberOfCards The number of cards to draw
     * @return card
     */
    // had to change the method name bc of java problem
    public PlayingCard drawMulti(int numberOfCards) {
        if (numberOfCards <= 0 || numberOfCards > deck.size()){
            return null;
        }
        return deck.removeFirst();
    }

    /***
     * Get a PlayingCard by index.
     * @param index card index
     * @return card at index
     */
    public PlayingCard draw(int index){
        if (index < 0 || index > deck.size()){
            return null;
        }
        return deck.get(index);
    }
}

