package treemap.exercise15;
// Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

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
        System.out.println("Getting least key strictly greater than key: 3 (returns null if there is no such key)");
        System.out.println("Value : " + myMap.higherKey(3));
    }
}