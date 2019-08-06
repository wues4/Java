package hashmap.exercise04;
// Write a Java program to remove all of the mappings from a map.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var myMap = new HashMap<Integer, String>();
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

        myMap.clear();
        System.out.println("My HashMap after clear operation:");
        System.out.println(myMap + "\n");
    }
}