package chapter3_statementypes;
import java.util.Scanner;
/*
1. Assignment : InOrder Program

* Write a program InOrder.java that reads in three integers and prints "in order" if they are sorted in ascending
or descending order, or "not in order" otherwise. For example,

	1 2 5		in order
	1 5 2		not in order
	5 2 1		in order
	1 2 2		in order
	5 5 5		in order

* Use no methods or loops. Use 2 System.out.println statements at most.
* Sample runs of program:
	Enter three integers:
	1 5 2
	Those integers are not in order.

	Enter three integers:
	3 2 2
	Those integers are in order.
 */
public class InOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input the three integer:
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        //Prints the numbers onto one line to show the user:
        System.out.println("You entered: "+ num1 + ", " + num2 + " , and " + num3);

        //Output results:
        if (num1 >= num2 && num2 >= num3 || num1 <= num2 && num2 <= num3){
            System.out.println("Those integers are in order.");
        }else{
            System.out.println("Those integers are not in order.");
        }
    }
}
