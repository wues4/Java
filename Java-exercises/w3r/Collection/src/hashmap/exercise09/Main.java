package hashmap.exercise09;
// Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My hash map:");
        System.out.println("Set view: " + myMap.entrySet());
    }
}