package treemap.exercise10;
// Write a Java program to get a reverse order view of the keys contained in a given map.

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
        System.out.println("TreeMap key set: " + myMap.keySet());
        System.out.println("TreeMap descending order key set: " + myMap.descendingKeySet());
    }
}