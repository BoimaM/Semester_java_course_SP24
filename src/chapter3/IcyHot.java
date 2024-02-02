package chapter3;
import java.util.Scanner;
/*
* Assignment 2:  IcyHot Program
* Write a program IcyHot.java that inputs two temperatures and prints "Temperature extremes detected" only if one temperature is less than 0 and the other is greater than 100.
* You must use a boolean variable called icyhot in this program.

* Sample runs of program:

	Enter two temperatures in degrees Celsius:
	101 -4
	Temperature extremes detected.

	Enter two temperatures in degrees Celsius:
	-1 99
	(no output)
 */
public class IcyHot { public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input the two temperature:
        System.out.println("Enter two temperatures in degree celsius:");
        int temp1 = scanner.nextInt();
        int temp2 = scanner.nextInt();
        scanner.close();

        System.out.println("The temperatures that you entered were: " + temp1 + " and " + temp2);

        //Boolean variable with temperature logical expression:
        boolean icyhot = (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0);

        //Output results:
        if (icyhot){
                System.out.println("Temperature extremes detected");
        }else {
                System.out.println("(No output)");
        }

   }
}
