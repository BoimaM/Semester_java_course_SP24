package project_1;

public class PokerTest {
    public static void main(String[] args) {
        PokerTest test = new PokerTest();
        test.testGetPairs();
        test.testHasThreeOfAKind();
        test.testHasFullHouse();
        test.testHasFourOfAKind();
        test.testHasFlush();
        test.testHasStraight();
        test.testHasStraightFlush();
        test.testHasRoyalFlush();
    }

    public void testGetPairs() {
        PlayingCard[] hand = {
                new PlayingCard(3, 3),
                new PlayingCard(3, 2),
                new PlayingCard(6, 1),
                new PlayingCard(6, 4),
                new PlayingCard(10, 3)
        };
        Poker poker = new Poker();
        int pairs = poker.getPairs(hand);
        System.out.println("Pairs: " + pairs); // Expected output: 2 pairs
    }

    public void testHasThreeOfAKind() {
        PlayingCard[] hand = {
                new PlayingCard(3, 3),
                new PlayingCard(3, 2),
                new PlayingCard(3, 1),
                new PlayingCard(6, 4),
                new PlayingCard(10, 3)
        };
        Poker poker = new Poker();
        boolean hasThreeOfAKind = poker.hasThreeOfAKind(hand);
        System.out.println("Has three of a kind: " + hasThreeOfAKind); // Expected output: true
    }

    public void testHasFullHouse() {
        PlayingCard[] hand = {
                new PlayingCard(3, 3),
                new PlayingCard(3, 2),
                new PlayingCard(3, 1),
                new PlayingCard(6, 4),
                new PlayingCard(6, 3)
        };
        Poker poker = new Poker();
        boolean hasFullHouse = poker.hasFullHouse(hand);
        System.out.println("Has full house: " + hasFullHouse); // Expected output: true
    }

    public void testHasFourOfAKind() {
        PlayingCard[] hand = {
                new PlayingCard(3, 3),
                new PlayingCard(3, 2),
                new PlayingCard(3, 1),
                new PlayingCard(3, 4),
                new PlayingCard(10, 3)
        };
        Poker poker = new Poker();
        boolean hasFourOfAKind = poker.hasFourOfAKind(hand);
        System.out.println("Has four of a kind: " + hasFourOfAKind); // Expected output: true
    }

    public void testHasFlush() {
        PlayingCard[] hand = {
                new PlayingCard(3, 3),
                new PlayingCard(6, 3),
                new PlayingCard(9, 3),
                new PlayingCard(10, 3),
                new PlayingCard(13, 3)
        };
        Poker poker = new Poker();
        boolean hasFlush = poker.hasFlush(hand);
        System.out.println("Has flush: " + hasFlush); // Expected output: true
    }

    public void testHasStraight() {
        PlayingCard[] hand = {
                new PlayingCard(1, 1),
                new PlayingCard(2, 2),
                new PlayingCard(3, 3),
                new PlayingCard(4, 4),
                new PlayingCard(5, 1)
        };
        Poker poker = new Poker();
        boolean hasStraight = poker.hasStraight(hand);
        System.out.println("Has straight: " + hasStraight); // Expected output: true
    }

    public void testHasStraightFlush() {
        PlayingCard[] hand = {
                new PlayingCard(1, 1),
                new PlayingCard(2, 1),
                new PlayingCard(3, 1),
                new PlayingCard(4, 1),
                new PlayingCard(5, 1)
        };
        Poker poker = new Poker();
        boolean hasStraightFlush = poker.hasStraightFlush(hand);
        System.out.println("Has straight flush: " + hasStraightFlush); // Expected output: true
    }

    public void testHasRoyalFlush() {
        PlayingCard[] hand = {
                new PlayingCard(1, 1), // Ace
                new PlayingCard(10, 1), // 10
                new PlayingCard(11, 1), // Jack
                new PlayingCard(12, 1), // Queen
                new PlayingCard(13, 1) // King
        };
        Poker poker = new Poker();
        boolean hasRoyalFlush = poker.hasRoyalFlush(hand);
        System.out.println("Has royal flush: " + hasRoyalFlush); // Expected output: true
        }
}