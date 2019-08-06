package treemap.exercise13;
// Write a Java program to get the portion of a map whose keys are strictly less than a given key.

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
        System.out.println("Retrieve elements whose keys are strictly less than key: 3");
        System.out.println("Value : " + myMap.headMap(3));
    }
}