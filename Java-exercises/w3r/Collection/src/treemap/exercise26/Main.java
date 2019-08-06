package treemap.exercise26;
// Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.

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
        System.out.println("Get key greater than or equals to the given key: 3");
        System.out.println(myMap.ceilingKey(3));
    }
}