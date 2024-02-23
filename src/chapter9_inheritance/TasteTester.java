package chapter9_inheritance;

public class TasteTester {

    public static void main(String [] args){

        //With default constructor
        BirthdayCake cake2 = new BirthdayCake();
        cake2.setFlavor("Peach");
        System.out.println("Cake 2 Flavor: " + cake2.getFlavor());

        WeddingCake cake3 = new WeddingCake();
        cake3.setPrice(450.0);
        System.out.println("Cake 3 Price: " + cake3.getPrice());

        //With constructor 2
        Cake cake = new Cake("Vanilla",89.3 );
        System.out.println("Cake 1 flavor: "+ cake.getFlavor());
        System.out.println("Cake 1 price: "+ cake.getPrice());
    }
}
