package project_1;

public class TestGetPairs {
    public static void main(String[] args) {
        Poker poker = new Poker();

        PlayingCard[][] testHands = {

                // No pairs
                {       new PlayingCard(3 ,3),
                        new PlayingCard(5, 2),
                        new PlayingCard(7, 1),
                        new PlayingCard(9, 4),
                        new PlayingCard(11, 3)},

                // One pair
                {       new PlayingCard(2, 3),
                        new PlayingCard(4, 2),
                        new PlayingCard(6, 1),
                        new PlayingCard(6, 4),
                        new PlayingCard(10, 3)},

                // Two pairs
                {       new PlayingCard(2, 3),
                        new PlayingCard(4, 2),
                        new PlayingCard(4, 1),
                        new PlayingCard(6, 4),
                        new PlayingCard(6, 3)},

                // Three of a kind
                {       new PlayingCard(2, 3),
                        new PlayingCard(4, 2),
                        new PlayingCard(4, 1),
                        new PlayingCard(4, 4),
                        new PlayingCard(10, 3)},

                // Four of a kind
                {       new PlayingCard(2, 3),
                        new PlayingCard(4, 2),
                        new PlayingCard(4, 1),
                        new PlayingCard(4, 4),
                        new PlayingCard(4, 3)},

                // Full House
                {       new PlayingCard(2, 4),
                        new PlayingCard(2, 1),
                        new PlayingCard(2, 3),
                        new PlayingCard(4, 4),
                        new PlayingCard(4, 2)}
        };

        // Test the getPairs() method for each test hand
        for (int i = 0; i < testHands.length; i++) {
            PlayingCard[] hand = testHands[i];
            int pairs = poker.getPairs(hand);
            System.out.println("Test case " + (i + 1) + ": " + pairs + " pair(s)");
        }
    }
}
