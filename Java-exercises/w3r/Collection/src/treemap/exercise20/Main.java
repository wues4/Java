package treemap.exercise20;
// Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("TreeMap: " + myMap);
        System.out.println("Greatest key-value mapping remove and get: " + myMap.pollLastEntry());
        System.out.println("TreeMap after removing last entry: " + myMap);
    }
}