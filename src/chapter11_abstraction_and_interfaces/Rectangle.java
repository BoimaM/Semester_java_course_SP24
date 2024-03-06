package chapter11_abstraction_and_interfaces;

public class Rectangle extends Shape {

    //Variables:
    private double length;
    private double width;


    //Getters and Setters:
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Constructor:
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
