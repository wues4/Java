package treemap.exercise08;
// Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

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
        System.out.println("First entry: " + myMap.firstEntry());
        System.out.println("Last entry: " + myMap.lastEntry());
    }
}