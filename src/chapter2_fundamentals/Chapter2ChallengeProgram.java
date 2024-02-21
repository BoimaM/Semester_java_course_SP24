package chapter2_fundamentals;

import java.util.Scanner;

public class Chapter2ChallengeProgram {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year:");
        String seasonType = scanner.next();

        System.out.println("Enter a whole number:");
        int wholeNum = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjectiveType = scanner.next();

        scanner.close();

        System.out.println("On a " + adjectiveType + " " + seasonType + " day, I drink a minimum of " + wholeNum + " cups of coffee.") ;

    }
}
