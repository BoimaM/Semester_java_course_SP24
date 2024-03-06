package chapter10_polymorphism;

public class Apple extends Fruit{

    public Apple(int calories){
        super(calories); // Calls the constructor of the parent class
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice was made.");
    }

    public void removeSeeds(int seeds){
        System.out.println("Number of seeds removed: " + seeds);
    }


}
