package chapter10_polymorphism;

public class Apple extends Fruit{

    public Apple(){
        setCalories(84);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice was made, I hope you like it.");
    }

    public void removeSeeds(){
        System.out.println("Seeds removed");
    }


}
