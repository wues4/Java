package hashmap.exercise06;
// Write a Java program to get a shallow copy of a HashMap instance.

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

        var copiedMap = myMap.clone();
        System.out.println("Copied HashMap:");
        System.out.println(copiedMap + "\n");

    }
}