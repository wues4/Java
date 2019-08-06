package treemap.exercise04;
// Write a Java program to search a value in a Tree Map.

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

        System.out.println("Checking if TreeMap contains a specified value");
        System.out.println(myMap.containsValue("Red"));
    }
}
