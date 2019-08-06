package treemap.exercise23;
// Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.

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
        System.out.println("Portion of TreeMap whose keys are greater or equals to a given key: ");
        System.out.println(myMap.tailMap(3));
    }
}