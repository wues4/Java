package hashmap.exercise03;
// Write a Java program to copy all of the mappings from the specified map to another map.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");

        System.out.println("My HashMap:");
        for (Map.Entry e : myMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();

        var myNewMap = new HashMap<Integer, String>();
        myNewMap.put(4, "Purple");
        myNewMap.put(5, "Green");
        myNewMap.put(6, "White");

        System.out.println("My new HashMap:");
        for (Map.Entry e : myNewMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();

        myNewMap.putAll(myMap);
        System.out.println("Added mappings from my first HashMap to my second HashMap:");
        for (Map.Entry e : myNewMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();
    }
}