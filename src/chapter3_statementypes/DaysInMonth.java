package chapter3_statementypes;
import java.util.Scanner;

/*
*Assignment 3: Days in Month Program:

* Write a program DaysInMonth.java that inputs a 3 letter month abbreviation and a year and outputs the number of days in that month.
* If the input month is February (feb), you must also check if the year that was input is a leap year and output the correct number of days in February.

* Sample runs of program (Don't use a loop):

   * e.g. 1: Enter a 3 letter month abbreviation (jan, feb, apr, …):
	            feb
	        Enter the year:
                 2024
            Number of days in month:
                29

	* e.g. 2: Enter a 3 letter month abbreviation (jan, feb, apr, …):
	            nov
	          Enter the year:
                2016
              Number of days in month:
                30
 */
public class DaysInMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input month (3 letter, case-sensitive to lowercase per instructions)
        System.out.println("Enter a 3 letter month abbreviation (jan, feb, apr, ...): ");
        String month = scanner.next().toLowerCase();

        //Input year
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        //Refer back to GradeMessage section: May need a switch case for the months

        int numoofdaysinmonth = 0;

        switch (month){
            case "jan" : case "mar" : case "may" : case "jul" : case "aug" : case "oct" : case "dec":
                numoofdaysinmonth = 31;
                break;
            case "apr": case "jun" : case "sep" : case "nov":
                numoofdaysinmonth = 30;
                break;
            case "feb":
                // Account for leap year per instruction (researched):
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    numoofdaysinmonth = 29; // leap year
                }else{
                    numoofdaysinmonth = 28; // non-leap year
                }
                break;
            default:
                System.out.println("Error invalid inputs!");
                break;
        }
        scanner.close();
            System.out.println("Number of days in month:\n" +numoofdaysinmonth);
    }
}
