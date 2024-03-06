package chapter10_polymorphism;

public class Banana extends Fruit {

   public Banana(){
       setCalories(99);
   }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice was made, I hope you like it. ");
    }

    public void peelFruit(){
        System.out.println("Banana has been peeled.");
    }
}
