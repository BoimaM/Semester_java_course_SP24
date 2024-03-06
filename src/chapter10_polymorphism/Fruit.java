package chapter10_polymorphism;

public class Fruit {

    public int calories;

    public Fruit(int calories) {
        this.calories = calories;
        System.out.println("This has " + calories + " calories.");
    }

    public void makeJuice(){
       System.out.println("Juice is made.\n");
   }

}
