package chapter10_polymorphism;

public class Banana extends Fruit {

    public Banana(int calories, String fruit){
        super(calories, fruit); // Calls the constructor of the parent class
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice was made. ");
    }

    public void peelFruit(String fruit){
        System.out.println(fruit + " has been peeled.");
    }
}
