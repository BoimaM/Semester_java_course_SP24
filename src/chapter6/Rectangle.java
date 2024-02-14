package chapter6;

public class Rectangle {
// Encapsulation:
// make fields 'private' & make methods used to access fields 'public'

    private double length;
    private double width;

    // This is a constructor must be the same as the class name
    // Used to initial an object or set up it's state.
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //Constructor for those who want to pass values
    public Rectangle(double length, double width){
        setLength(length); // Can be set this way with the method
        this.width = width; // Can be st this way with this way. Shows alt options (demo).
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

   public double getWidth(){
        return width;
    }

   public void setWidth(double width){
        this.width = width;
    }

     public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

     public double calculateArea(){
        return length * width;
    }
}
