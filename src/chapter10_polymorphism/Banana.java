package chapter10_polymorphism;

public class Banana extends Fruit {

    public Banana(int calories){
        super(calories); // Calls the constructor of the parent class
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice was made. ");
    }

    public void peelFruit(){
        System.out.println("Fruit has been peeled.");
    }
}
