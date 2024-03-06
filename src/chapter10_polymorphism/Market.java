package chapter10_polymorphism;

public class Market {

    public static void main(String[] args) {

//        Apple apple1 = new Apple(3);
//        Banana banana1 = new Banana(23);
//
//        apple1.removeSeeds(6);
//        apple1.makeJuice();
//        banana1.peelFruit();
//        banana1.makeJuice();

        Fruit mango = new Banana(50);
        mango.makeJuice();
        drinkJuice(mango);

        mango = new Apple(43);
        mango.makeJuice();
        ((Apple) mango).removeSeeds(1);
    }

    public static void drinkJuice(Fruit fruit){
        if (fruit instanceof Apple){
            System.out.println("Drinking the apple juice.");
        }
        else if (fruit instanceof Banana){
            System.out.println("Drinking the banana juice.");
        }
    }
}
