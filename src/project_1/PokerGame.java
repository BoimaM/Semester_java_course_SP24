package project_1;

import java.util.Scanner;

public class PokerGame {

    public static void main(String[] args) {
        Poker poker = new Poker();

        // Shuffle the deck
        System.out.println("Hold on. I'm shuffling the deck.");
        poker.getNewDeck(true);

        // Draw a hand of 5 cards
        System.out.println("Here is your hand:");
        PlayingCard[] hand = new PlayingCard[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = poker.draw();
            System.out.println((i + 1) + " - " + hand[i]);
        }

        // Ask the user how many cards they want to replace
        int cardsToReplace = promptNumberOfCardsToReplace();

        // Replace selected cards
        if (cardsToReplace > 0) {
            replaceSelectedCards(hand, cardsToReplace, poker);
        }

        // Print the updated hand
        System.out.println("Updated hand:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + hand[i]);
        }

        // Detect the poker hand
        detectPokerHand(hand, poker);
    }

    private static int promptNumberOfCardsToReplace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cards in your hand do you want to replace (0-5)?");
        return scanner.nextInt();
    }

    private static void replaceSelectedCards(PlayingCard[] hand, int cardsToReplace, Poker poker) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the cards you want to replace (1-5), separated by spaces:");
        for (int i = 0; i < cardsToReplace; i++) {
            int cardIndex = scanner.nextInt();
            if (cardIndex >= 1 && cardIndex <= 5) {
                hand[cardIndex - 1] = poker.draw();
            } else {
                System.out.println("Invalid card index. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void detectPokerHand(PlayingCard[] hand, Poker poker) {
        if (poker.hasRoyalFlush(hand)) {
            System.out.println("\nYou have a ROYAL FLUSH.");
        } else if (poker.hasStraightFlush(hand)) {
            System.out.println("\nYou have a STRAIGHT FLUSH.");
        } else if (poker.hasFourOfAKind(hand)) {
            System.out.println("\nYou have FOUR OF A KIND.");
        } else if (poker.hasFullHouse(hand)) {
            System.out.println("\nYou have a FULL HOUSE.");
        } else if (poker.hasFlush(hand)) {
            System.out.println("\nYou have a FLUSH.");
        } else if (poker.hasStraight(hand)) {
            System.out.println("\nYou have a STRAIGHT.");
        } else if (poker.hasThreeOfAKind(hand)) {
            System.out.println("\nYou have THREE OF A KIND.");
        } else if (poker.getPairs(hand) == 2) {
            System.out.println("\nYou have TWO PAIRS.");
        } else if (poker.getPairs(hand) == 1) {
            System.out.println("\nYou have ONE PAIR.");
        } else {
            System.out.println("\nYou have a HIGH CARD.");
        }
    }
}
