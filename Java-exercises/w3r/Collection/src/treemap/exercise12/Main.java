package treemap.exercise12;
// Write a Java program to get the greatest key less than or equal to the given key.

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
        System.out.println("Checking for greatest key less than or equal to 6");
        System.out.println("Value : " + myMap.floorKey(6));
    }
}