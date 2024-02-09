package chapter4;

import java.util.Random;
import java.util.Scanner;
/*
* Write a program, saved in the file GuessNumber.java, that plays a number guessing game.
* The program will generate a random integer between 1 and 100, using the Math.random() method or the java.util.Random class (See Chapter 6).

* Your program will ask the user to guess the value of the number between 1 and 100.

* If the user's guess is within 5 of being correct, output "HOT".
* If the user's guess is within 10 of being correct, output "VERY WARM".
* If the user's guess is within 20 of being correct, output "WARM".
* If the user's guess is within 40 of being correct, output "LUKEWARM".
* If the user's guess is not within 40 of being correct, output "COLD".
* if the user's guess is correct, output "CORRECT".

* The user gets 6 tries to guess correctly. Display the number of guesses remaining.
* If the user fails to correctly guess the number in 6 tries, change the random number.
* After the random number changes, the user will have another 6 tries to guess correctly.
* And this will continue until the user guesses correctly within 6 tries.

* Allow the player to enter -1 to quit the game immediately.

 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing game!");

        // Generate a number between 1 and 100:
        int randomNum = random.nextInt(100) + 1;

        // Initialize what we know:
        int tries = 6;

        // Create the outputs:
        while (tries > 0) {
            System.out.println(tries + " guess remaining. Enter your guess between 1 & 100: (-1 to quit)");

            //Ask the user to enter a number guess & store the value:
            int userGuess = scanner.nextInt();

            //Quit game immediately:
            if (userGuess == -1){
                System.out.println("Game over!");
                break;
            }

            //Game logic:
            if (userGuess == randomNum) {
                System.out.println("CORRECT");
                break;
            } else if (userGuess <= randomNum + 5 && userGuess >= randomNum - 5) {
                System.out.println("HOT");
            } else if (userGuess <= randomNum + 10 && userGuess >= randomNum - 10) {
                System.out.println("VERY WARM");
            } else if (userGuess <= randomNum + 20 && userGuess >= randomNum - 20) {
                System.out.println("WARM");
            } else if (userGuess <= randomNum + 40 && userGuess >= randomNum - 40) {
                System.out.println("LUKEWARM");
            } else {
                System.out.println("COLD");
            }

            //Decrement the tries amount:
            tries--;

            //State answer, change the random number, and reset guesses:
            if (tries == 0 ){
                System.out.println("The winning number was: " +randomNum+".");
                randomNum = random.nextInt(100) + 1;
                tries = 6;
                System.out.println("Sorry, you took too many guesses, so I've changed the number.");
            }
        }
    }
}