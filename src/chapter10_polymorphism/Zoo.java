package chapter10_polymorphism;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch(); // Example of casting to access method of their instance.
        feed(sasha);
    }

    public static void feed(Animal animal){
         if (animal instanceof Dog){
             System.out.println("Here's your dog food.");
         }
         else if (animal instanceof Cat){
             System.out.println("Here's your cat food.");
         }
    }
}
