package treemap.exercise01;
// Write a Java program to associate the specified value with the specified key in a Tree Map.

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        var myMap = new TreeMap<Integer, String>();
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
    }
}