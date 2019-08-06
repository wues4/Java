package hashmap.exercise01;
// Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My HashMap:");
        for (Map.Entry e : myMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();
    }
}