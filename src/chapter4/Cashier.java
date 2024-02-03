package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP: Best to used when know how many times loop will run.
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Get number of items to scan:
        System.out.println("Enter the numbers of items you would like to scan: ");
        int quantity = scanner.nextInt();

        // Will hold the total price of quantity:
        double total = 0;

        // Create loop to iterate through all the items and accumulate the costs:
        for (int i = 0; i < quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
