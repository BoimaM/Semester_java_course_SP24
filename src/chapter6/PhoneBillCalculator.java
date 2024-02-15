package chapter6;

public class PhoneBillCalculator {

   public static void main(String[] args){

       PhoneBillLogic bill1 = new PhoneBillLogic();
       bill1.id = 1;
       bill1.baseCost = 500;
       bill1.allottedMins = 9322;
       bill1.minutesUsed = 434453;
       bill1.itemizedBill();

       //Print using constructor 2
       PhoneBillLogic bill2 = new PhoneBillLogic(2);
       bill2.baseCost = 90.53;
       bill2.allottedMins = 8000;
       bill2.minutesUsed = 43233;
       bill2.itemizedBill();

       //Print using constructor 3
       PhoneBillLogic bill3 = new PhoneBillLogic(3,56.69,1000,299);
       bill3.itemizedBill();

   }

}
