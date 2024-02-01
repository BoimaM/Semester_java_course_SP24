package chapter3;

import java.util.Scanner;

/*
*  IF Else
* All salespeople are expected to make at least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        //Initialize values we know
        int quota = 10;

        //Get unknown values through scanner
        System.out.println("Enter the number of sales you made this week:");
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (sales >= quota){
            System.out.println("Congratulations! You met your weekly quota.");
        } else{
            int salesShort = quota - sales;
            System.out.println("Unfortunately, you did not need the weekly quota. You were " + salesShort + " sales short.");
        }
    }
}
