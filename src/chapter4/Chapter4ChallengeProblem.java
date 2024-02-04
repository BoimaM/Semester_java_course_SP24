package chapter4;
/* The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.

 * Example output:
    Roll #1: You've rolled a 3. You are now on space 3 and have 17 more to go.
    Roll #2: You've rolled a 3. You are now on space 6 and have 14 more to go.
    Roll #3: You've rolled a 3. You are now on space 9 and have 11 more to go.
    Roll #4: You've rolled a 5. You are now on space 14 and have 6 more to go.
    Roll #5: You've rolled a 6. You're on space 20. Congrats, you win!
*
 */
import java.util.Random;
public class Chapter4ChallengeProblem {
    public static void main(String[] args) {
        Random random =new Random();

        System.out.println("Welcome to the Roll the die. Let's begin the session!");

        //Initialize what we know:
        int winningSpace = 20;
        int maxRolls = 5;
        int currentSpace = 0;
        int total;
        //Create the game:

            for (int i = 0; i < maxRolls; i++) {
                int dice = random.nextInt(6) + 1;
                currentSpace += dice; // increment by the dice amount rolled

                // print what has occurred per iteration
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + dice );
            }
            total = currentSpace;
            System.out.println("You're on space: "+ total);

            // Check if the user won or not
           int overAmount = currentSpace - winningSpace;
           int underAmount = winningSpace - currentSpace;

           if (currentSpace == winningSpace){
               System.out.println( "Congrats! You won the game.");
           }
           else if (currentSpace > winningSpace){
               System.out.println("You lost the game, you were "+ overAmount +" spot(s) over the winning amount."  );
           }else{
               System.out.println("You lost the game, you were "+ underAmount +" spot(s) under the winning amount.");
           }
    }
}
