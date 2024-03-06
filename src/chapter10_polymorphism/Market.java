package chapter10_polymorphism;

public class Market {

    public static void main(String[] args) {

        Fruit apple1 = new Apple();
        ((Apple) apple1).removeSeeds(); //Casting calls
        apple1.makeJuice();

        Apple apple2 =new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.setCalories(90);
        banana.peelFruit();

        Fruit mango = new Fruit();
        Fruit pear = new Fruit();
        Fruit pineapple = new Fruit();

        blend(apple1);
        blend(banana);
        blend(mango);
        blend(pineapple);

    }

    public static void blend(Fruit fruit){
        System.out.println("Blending...");
        fruit.makeJuice();
    }
}
