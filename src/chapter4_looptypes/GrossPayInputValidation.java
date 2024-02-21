package chapter4_looptypes;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15/hr. Write a program that allows the employee
 * to enter the number of hours worked for the week. DO not allow overtime.
 */
public class GrossPayInputValidation {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Initialize the known variables:
         int rate = 15;
         int maxHours = 40;

        //Get input of unknown variables:
        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        //Validate input:
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry, Your hours worked must be between 1 and 40. Try again.");
            // Called a "Sentinel" controls the flow of loop & condition.
            // Below allows the sentinel to be updated, so we are not left with an infinite loop.
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate the gross:
        double grossPay = rate * hoursWorked;
        System.out.println("Gross Pay for this employee is: $" + grossPay);

    }
}
