package hashmap.exercise02;
// Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My HashMap:");
        for (Map.Entry e : myMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();

        System.out.println("Number of key-value mappings in my HashMap: " + myMap.size());
    }
}