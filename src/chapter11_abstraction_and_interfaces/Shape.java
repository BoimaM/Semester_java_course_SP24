package chapter11_abstraction_and_interfaces;

public abstract class Shape { //abstract methods requires the class to be abstract also

    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
