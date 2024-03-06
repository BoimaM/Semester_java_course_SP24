package chapter11_abstraction_and_interfaces;

public class Farm {

    public static void main(String[] args) {

        Animal daffy = new Duck();
        daffy.makeSound();


        Pig porky = new Pig();
        porky.makeSound();
        porky.eat();

        Duck donald = new Duck();
        donald.makeSound();
        donald.eat();
    }

}
