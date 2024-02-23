package chapter9_inheritance;

public class Cake {

    // Initialization
    private String flavor;
    private double price;

    //Constructors
    public Cake(){

    }

    public Cake(String flavor, double price){
        setFlavor(flavor);
        setPrice(price);
    }

    // Getters & Setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
