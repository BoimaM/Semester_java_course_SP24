package chapter10_polymorphism;

public class Fruit {

    public int calories;

    public Fruit(int calories, String fruit) {
        this.calories = calories;
        System.out.println("This " + fruit + " has " + calories + " calories.");
    }

    public void makeJuice(){
       System.out.println("Juice is made.\n");
   }

}
