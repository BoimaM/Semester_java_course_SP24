package chapter4_looptypes;

import java.util.Scanner;

/*
 * Write Ulam.java so that it inputs a number from the user and prints the Ulam sequence for it,
 * using a while loop.
          • If n is 1, stop.
          • If n is even, the next number is n/2.
          • If n is odd, the next number is 3*n + 1.
          • Continue with this process until reaching 1.

 * Here are some example user dialogs:
          Enter a positive integer to show its Ulam sequence:
          2
          The Ulam sequence is:
          2 -> 1

          Enter a positive integer to show its Ulam sequence:
          3
          The Ulam sequence is:
          3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
Include the arrows in the output.
 */
public class Ulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a positive integer to show its Ulam sequence:");
        int num = scanner.nextInt();
        System.out.println ("The Ulam sequence is: ");

        //Print initial number from user:
        System.out.print(num);

        //Continue the loop until the num reaches 1 per instructions:
        while (num != 1) {
            if (num % 2 == 0) {
                //IF num is even, the next number is num/2
                num /= 2;
            }else{
                //IF num is odd, the next number is 3 * num + 1
                num = (3 * num) + 1;
            }

            System.out.print(" -> " + num);
        }
        scanner.close();
    }

}