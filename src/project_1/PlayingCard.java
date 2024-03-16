package project_1;

//Name: Masfort Boima
// Defines a playing card that is used to play card games like Poker or Blackjack.

public class PlayingCard {

    //Instance variables and constants
    private int _value; //Value ranges from 1-13
    private String _suit; //Is one of: "Clubs", "Diamonds", "Hearts", "Spades"
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;

    //Constructors
     public PlayingCard (int value, int suit) {
        setValue(value);
        setSuit(suit);
     }

    // Getter(s)
    public int getValue() {
        return _value;
    }
    public String getSuit() {
        return _suit;
    }

     //Methods
     public void setValue(int value){
         if (value >=1 && value <= 13){
             _value = value;
         } else {
             System.out.println("Invalid card value!");
         }
     }

     public void setSuit(int suit){
         if (suit == CLUBS) {
             _suit = "Clubs";
         }else if (suit == DIAMONDS){
             _suit = "Diamonds";
         } else if (suit == HEARTS) {
             _suit = "Hearts";
         } else if (suit == SPADES) {
             _suit = "Spades";
         }else{
             System.out.println("Invalid card suit!");
         }
     }

     public String toString(){
         String value;
         if (_value == 1){
             value = "Ace";
         }else if (_value == 11){
             value = "Jack";
         } else if (_value == 12) {
             value = "Queen";
         } else if (_value == 13) {
            value = "King";
         }else {
             value = String.valueOf(_value);
         }
         return value + " of " + _suit;
     }


}
