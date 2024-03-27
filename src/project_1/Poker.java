package project_1;

import java.util.Arrays;

/**
 * Your name: Masfort Boima
 * Poker.java: Contains a deck of PlayingCards and methods to play basic poker
 */
public class Poker extends CardGame {

    //Constructor(s):
    public Poker(){
        super(true); // shuffled deck
    } // end constructor

    //Methods to detect hand ranks:

    /**
     Return the number of pairs: 0 = no pairs, 1 = one pair, 2 = two pairs
     */
    public int getPairs(PlayingCard[] hand){
        Arrays.sort(hand); //Sort the hand
        int pairCount = 0;
        for (int i = 0; i < hand.length - 1 ; i++){
            if (hand[i].getValue() == hand[i + 1].getValue()) {
                pairCount++;
            }
        }
      if (pairCount == 0){
          return 0; // no pairs
      } else if (pairCount == 1) {
          return 1; // one pair
      }else {
          return 2; // two pairs
      }
    }

        /**
        * Detect three of a kind.
         */
    public boolean hasThreeOfAKind(PlayingCard[] hand) {
    Arrays.sort(hand);
    for (int i = 0; i < hand.length - 2; i++) {
        if (hand[i].getValue() == hand[i + 1].getValue() && hand[i].getValue() == hand[i + 2].getValue()) {
            return true; // Found three of a kind
        }
    }
    return false; // Not three of a kind is found.
}

    /**
     * Checks to see if I have a FullHouse
     * three cards of one rank - three of a kind;
     * two cards of another - pairs
     *
     */
    public boolean hasFullHouse(PlayingCard[] hand){
    Arrays.sort(hand);

    boolean threeOfAKind = false;
    boolean pair = false;

    //check for three of a kind:
    for (int i =0; i < hand.length - 2 ; i++){
        if (hand[i].getValue() == hand[i + 1].getValue() && hand[i].getValue() == hand[i + 2].getValue()) {
            threeOfAKind = true; // Found three of a kind
            break;
        }
    }

    //Check for pair:
        for(int i =0; i < hand.length - 1; i++){
            if (hand[i].getValue() == hand[i+1].getValue()){
                pair = true;
                break;
            }
        }

    return  threeOfAKind && pair;
    }

}
