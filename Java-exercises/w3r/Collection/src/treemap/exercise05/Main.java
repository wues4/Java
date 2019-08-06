package treemap.exercise05;
// Write a Java program to get all keys from the given a Tree Map.

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

        System.out.println("Get all keys for the given TreeMap");

        for (Integer e : myMap.keySet()) {
            System.out.print(e + " | ");
        }
    }
}
