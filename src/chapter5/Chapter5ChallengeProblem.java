package chapter5;
/* PHONE BILL CALCULATOR PROGRAM Instructions:
 * Calculate the final total of someone's cell phone bill
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan,
 * and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total
 * Print the itemized bill.
 */

import java.util.Scanner;

public class Chapter5ChallengeProblem {

    //Initialize what we know, make global:
    static double minuteRate = 0.25;
    static double subTotalTax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get what we don't know:
        double planFee = getPlanFee();
        int overageMins = getOverageMinutes();
        scanner.close();

        //User's charges (math required):
        double overageAmount = getOverageAmount(minuteRate,overageMins);
        double taxAmount = getTaxAmount(planFee,overageAmount,subTotalTax);
        double totalAmount = getTotalAmount(planFee,overageAmount,subTotalTax,taxAmount);

        //Print the itemized bill to the user:
       printBill (planFee,overageAmount,subTotalTax,taxAmount,totalAmount);

    }


    public static double getPlanFee(){
        System.out.println("Enter the base cost for the plan: ");
        double planFee;
        planFee = scanner.nextDouble();
        return  planFee;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes: ");
        int overageMin;
        overageMin = scanner.nextInt();
        return overageMin;
    }

    public static double getOverageAmount(double minuteRate, int overageMin){
        double overageAmount;
        overageAmount = minuteRate * overageMin;
        return overageAmount;
    }

    public static double getTaxAmount(double planFee, double overageAmount,double subTotalTax){
        double taxAmount;
        taxAmount = (planFee + overageAmount) * subTotalTax;
        return taxAmount;
    }

    public static double getTotalAmount(double planFee, double overageAmount, double subTotalTax, double taxAmount){
        double totalAmount;
        totalAmount = planFee + overageAmount + subTotalTax + taxAmount;
        return totalAmount;
    }

    public static void printBill(double planFee, double overageAmount, double subTotalTax, double taxAmount, double totalAmount){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan Amount: $"+ String.format("%.2f",planFee));
        System.out.println("Overage Amount: $"+ String.format("%.2f",overageAmount));
        System.out.println("Tax Amount: $"+ String.format("%.2f",taxAmount));
        System.out.println("Total Cost: $"+ String.format("%.2f",totalAmount));

    }
}




