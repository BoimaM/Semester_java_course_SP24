package project_1;

import java.util.Arrays;

/**
 * Your name: Masfort Boima
 * Poker.java: Contains a deck of PlayingCards and methods to play basic poker
 */
public class Poker extends CardGame {

    //Constructor(s):
    public Poker() {
        super(true); // shuffled deck
    } // end constructor

    //Methods to detect hand ranks:

    /**
     * Return the number of pairs: 0 = no pairs, 1 = one pair, 2 = two pairs
     */
    public int getPairs(PlayingCard[] hand) {
        Arrays.sort(hand); //Sort the hand
        int pairCount = 0;
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()) {
                pairCount++;
            }
        }
        if (pairCount == 0) {
            return 0; // no pairs
        } else if (pairCount == 1) {
            return 1; // one pair
        } else {
            return 2; // two pairs
        }
    }

    /**
     * Detect three of a kind.
     */
    public boolean hasThreeOfAKind(PlayingCard[] hand) {
        Arrays.sort(hand);
        for (int i = 0; i < hand.length - 2; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue() &&
                    hand[i].getValue() == hand[i + 2].getValue()) {
                return true; // Found three of a kind
            }
        }
        return false; // Not three of a kind is found.
    }

    /**
     * Checks to see if I have a FullHouse
     * three cards of one rank - three of a kind;
     * two cards of another - pairs
     */
    public boolean hasFullHouse(PlayingCard[] hand) {
        Arrays.sort(hand);

        boolean threeOfAKind = false;
        boolean pair = false;

        //Check for three of a kind:
        for (int i = 0; i < hand.length - 2; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()
                    && hand[i].getValue() == hand[i + 2].getValue()) {
                threeOfAKind = true; // Found three of a kind
                break;
            }
        }
        //Check for pair:
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()) {
                pair = true;
                break;
            }
        }
        return threeOfAKind && pair;
    }

    /**
     * Detect four of a kind
     */
    public boolean hasFourOfAKind(PlayingCard[] hand) {
        Arrays.sort(hand);

        for (int i = 0; i < hand.length - 3; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()
                    && hand[i].getValue() == hand[i + 2].getValue()
                    && hand[i].getValue() == hand[i + 3].getValue()) {
                return true; // Found four of a kind
            }
        }
        return false; // Not four of a kind is found.
    }

    /**
     * Detect Flush
     */
    public boolean hasFlush(PlayingCard[] hand) {
        if (hand == null || hand.length == 0) {
            return false; //Empty hand no flush.
        }
        //Get the suit of the first card in the hand
        String suit = hand[0].getSuit();

        //Check if all other cards have the same suit.
        for (int i = 1; i < hand.length; i++) {
            if (!hand[i].getSuit().equals(suit)) {
                return false; //Different suit found, no flush.
            }
        }
        return true; //All cards have the same suit.
    }

    /**
     * Detect a Straight
     */
    public boolean hasStraight(PlayingCard[] hand) {
    Arrays.sort(hand);

    int count=1;

    for (int i = 0; i < hand.length - 1; i++){
        if (hand[i + 1].getValue() - hand[i].getValue() == 1){
            count++;
            if (count == 5){
                return true;
            }
        }
    }
    return false;
    }

    /**
     * Detect a Straight Flush
     */
    public boolean hasStraightFlush(PlayingCard[]hand){
        return hasStraight(hand) && hasFlush(hand);
    }

    /**
     * Detect Royal Flush
     */
    public boolean hasRoyalFlush(PlayingCard[]hand){
        if (hasStraightFlush(hand)) {
            Arrays.sort(hand);
            if (hand[0].getValue() == 10 && hand[1].getValue() == 11 && hand[2].getValue() == 12 && hand[3].getValue() == 13 && hand[4].getValue() == 1) {
                return true;
            }
        }
        return false;
    }
}