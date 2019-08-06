package hashmap.exercise05;
// Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My HashMap:");
        System.out.println(myMap + "\n");

        System.out.println("HashMap is empty ? " + myMap.isEmpty() + "\n");
        System.out.println("Emptying HashMap ..." + "\n");
        myMap.clear();
        System.out.println("HashMap is empty ? " + myMap.isEmpty() + "\n");
    }
}