package Chapter3;

import java.util.Scanner;

/*
  * Nested IFS:
  * To qualify for a loan, a person must make at least $30,000
  * and have been working at their current job for at least 2 years
 */
public class LoanQualifier {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Initialize what we know:
        int requiredSalary  = 30000;
        int requiredEmployedYrs = 2;

        //Get what we don't:
        System.out.println("Enter your yearly salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter number years worked at current employer:");
        double yearsWorked = scanner.nextDouble();

        scanner.close();

        //Make decision:
        if (salary >= requiredSalary){
            if (yearsWorked >= requiredEmployedYrs){
                System.out.println("Congrats, you qualify for a loan!");
            }else{
                System.out.println("Sorry, you must have worked at your current job " + requiredEmployedYrs + " years.");
            }
        }else{
            System.out.println("Sorry, you must earn at least " + requiredSalary + " to qualify for a loan.");
        }
    }
}
