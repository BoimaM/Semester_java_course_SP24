package chapter12_collections;

import java.awt.*;
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();

    }

    public static void setDemo(){
        Set <String>fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        /*
             3 Ways to loop/iterate through a collection:
             For sets,lists, and queue

        1: var i = fruit.iterator();
           while(i.hasNext()){
            System.out.println(i.next());
        }

        2:  for (String item: fruit){
            System.out.println(item);
        }

        3: fruit.forEach(System.out::println);

         */
    }

    public static void listDemo() {
        ArrayList<String>fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());

        fruit.forEach(System.out::println);

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void queueDemo() {
        Queue <String> fruit =new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);


        for (String type: fruit){
            System.out.println(type);
        }
    }

    public static void mapDemo() {
        Map <String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);
//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//
//        System.out.println(fruitCalories.get("lemon"));
//
//        System.out.println(fruitCalories.entrySet());
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);

        // Way to iterate over a Map
        for (var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (key,value) -> System.out.println("Fruit: "+ key + ", Calories: " + value ));

    }
}
