package chapter7;

/*
 * Make an array that holds the textual values of the days of the week
 * Have the user input a number corresponding to the day of the week
 * Assume the weeks starts on Monday.
 * Your program should output the String that represents the day of week
 * Example: User inputs 1, program should print "Monday"
 */

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between (1-7): ");
        int userNumDay = input.nextInt();
        input.close();

        getDay(userNumDay);
    }

    public static String getDay(int userNumDay) {
        if (userNumDay < 1 || userNumDay > 7) {
            System.out.println("Invalid input. Please enter a number between 1-7");
            return "";
        } else {
            for (int i = 0; i < daysOfWeek.length; i++) {
                if (i + 1 == userNumDay) { // adjusted index due instructions asking for monday to start at input 1
                    System.out.println("Corresponding day is: " + daysOfWeek[i]);
                    return "";
                }
            }
        }
        return "";
    }
}
