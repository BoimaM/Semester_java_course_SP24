package chapter9_inheritance;

public class InheritanceTester {

    public static void main(String[] args){

       Mother mom = new Mother();
       mom.setName("Beth");

        System.out.println(mom.getName() + " is a "+ mom.getGender());

    }

    public static void testSquareOverRide(){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(4);
        rectangle1.setWidth(8);
        System.out.println("The perimeter for the rectangle is "+ rectangle1.calculatePerimeter());

        Square square= new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println("The perimeter for the square is "+ square.calculatePerimeter());

    }
}
