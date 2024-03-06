package chapter10_polymorphism;

public class Market {

    public static void main(String[] args) {

        Apple apple1 = new Apple(53, "apple");
        Banana banana1 = new Banana(23, "banana");

        apple1.removeSeeds(23);
        apple1.makeJuice();
        banana1.peelFruit("Banana");
        banana1.makeJuice();


    }
}
