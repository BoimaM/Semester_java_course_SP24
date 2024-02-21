package chapter6_classes_and_objects;
/* Chapter 6 Phone Bill Challenge:

 * Enhance the Phone Bill exercise by redoing it in an object-oriented style
 * A phone bill should have an ID, a base cost, a number of allotted minutes and a number of minutes used.
 * Then it should also be able to calculate the overage, calculate the tax, and calculate the total.
 * Then it should also be able to print an itemized bill
 * You should have three constructors:
        A default one.
        One that accepts the ID only.
        One that accepts all the fields.
 * No matter which of these constructors you use, all fields should be set eventually.
 * Also create a different class that instantiates the PhoneBill and prints out an itemized bill.

 */

public class PhoneBillLogic {
    //* Remember Constructors must be the same name as the class *

    //Initialize the known
    int id;
    double baseCost;
    int allottedMins;
    int minutesUsed;

    //Constructor 1: default
   public PhoneBillLogic(){
        id = 0;
        baseCost = 0;
        allottedMins = 0;
        minutesUsed = 0;
    }

    // Constructor 2: Accepts the ID only
    public PhoneBillLogic(int id){
       this.id = id;
       baseCost = 0;
       allottedMins = 0;
       minutesUsed = 0;
    }

    //Constructor 3: Accepts all fields
    public PhoneBillLogic(int id, double baseCost, int allottedMins, int minutesUsed){
       this.id = id;
       this.baseCost = baseCost;
       this.allottedMins = allottedMins;
       this.minutesUsed = minutesUsed;
    }

    //Getter and Setter Methods:

    public int getId(){
       return id;
    }

    public void setId(int id){
       this.id = id;
    }

    public double getBaseCost(){
       return baseCost;
    }

    public void setBaseCost(double baseCost){
       this.baseCost = baseCost;
    }

    public int getAllottedMins(){
       return allottedMins;
    }

    public void setAllottedMins(int allottedMins){
       this.allottedMins = allottedMins;
    }
    public int getMinutesUsed(){
       return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
       this.minutesUsed = minutesUsed;
    }


    // Calculation Methods per instructions:

    public double calculateOverage(){
        if (minutesUsed <= allottedMins){
            return 0;
        }else{
            double overageRate = 0.50; //Assumption amount (subject to change)
            int overageMins = minutesUsed - allottedMins;
            return overageMins * overageRate;
        }
    }

    public double calculateTax(){
       double taxRate = 1.50; //Assumption amount (subject to change)
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
       return baseCost + calculateOverage() + calculateTax();
    }

    //Print Bill:
    public void itemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f",calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f",calculateTax()));
        System.out.println("Total: $" + String.format("%.2f",calculateTotal()));
        System.out.println();
    }
}

