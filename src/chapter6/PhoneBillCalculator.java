package chapter6;

public class PhoneBillCalculator {

   public static void main(String[] args){

       PhoneBillLogic bill = new PhoneBillLogic();
       bill.setId(1);
       bill.setBaseCost(90.5);
       bill.setAllottedMins(1000);
       bill.setMinutesUsed(120);
       bill.itemizedBill();
   }

}
