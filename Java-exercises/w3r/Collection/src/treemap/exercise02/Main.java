package treemap.exercise02;
// Write a Java program to copy a Tree Map content to another Tree Map.

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

        System.out.println("My TreeMap:");
        for (Map.Entry e : myMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        System.out.println();

        Map<Integer, String> mySecondMap = new TreeMap<>(myMap);

        System.out.println("My second TreeMap:");
        for (Map.Entry e : mySecondMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}