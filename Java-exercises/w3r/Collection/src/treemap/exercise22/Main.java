package treemap.exercise22;
// Write a Java program to get the portion of a map whose keys range from a given key to another key.

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
        System.out.println("Portion of TreeMap: " + myMap.subMap(2,true,4,true));
    }
}