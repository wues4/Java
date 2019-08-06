package treemap.exercise06;
// Write a Java program to delete all elements from a given Tree Map.

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new TreeMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My TreeMap: " + myMap);
        myMap.clear();
        System.out.println("My TreeMap after clear operation:");
        System.out.println(myMap);
    }
}
