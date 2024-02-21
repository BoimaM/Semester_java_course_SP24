package chapter6_classes_and_objects;
// Month convertor program using overloading methods within a class
// Switch cases were used within the methods
// Program calls each based on the parameter being used (i.e., String or int)

public class MonthConverter {

    public static void main(String [] args){
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("January"));

    }
}
