package chapter11_abstraction_and_interfaces;

public class Customer {

    public static void main(String[] args) {

        //Must use casting to get methods from Book Class (Shown in line 11).

        Product book = new Book();
        book.setPrice(9.99);
        ((Book) book).setPages(90);
                


    }
}
