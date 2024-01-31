package Chapter3;
import java.util.Scanner;
/*
* So, you're going to create a program that asks the user to enter the quantities for the following coins.

* You'll ask them how many pennies would you like?
* How many nickels would you like?
* How many dimes?
* And then, how many quarters?
* What your program is going to do is count up the value of all the change that they answered.

* If it's exactly one dollar then they win the game.
* If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
* If it's less than one dollar, tell them how much they went under.
 */
public class Chapter3ChallengeProgram {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double penny = .01;
        double nickle = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome to the Number's Game! \nThe Goal of the game is to hit exactly $1.00");

        System.out.println("Enter amount of pennies:");
        int pennies = scanner.nextInt();

        System.out.println("Enter amount of nickles:");
        int nickles = scanner.nextInt();

        System.out.println("Enter amount of dimes:");
        int dimes = scanner.nextInt();

        System.out.println("Enter amount of quarters:");
        int quarters = scanner.nextInt();

        scanner.close();

        double totalSum = ((pennies * penny) + (nickles * nickle) + (dimes * dime) + (quarters * quarter));


        System.out.println("Your total amount was: $" + String.format("%.2f", totalSum));

        if (totalSum == dollar){
            System.out.println("Your amount equaled $1.00, you win the game!");

        }else if(totalSum > dollar){
            double amountOver = (totalSum - dollar);
            System.out.println("Your total amount was over the winning dollar amount by $" + String.format("%.2f", amountOver) + "." );

        }else{
            double amountUnder = (dollar - totalSum);
            System.out.println("Your total amount was under the winning dollar amount by $" + String.format("%.2f", amountUnder) + "." );
        }
    }
}

