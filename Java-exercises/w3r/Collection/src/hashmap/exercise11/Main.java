package hashmap.exercise11;
// Write a Java program to get a set view of the keys contained in this map.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Red");
        myMap.put(2, "Blue");
        myMap.put(3, "Yellow");
        myMap.put(4, "Purple");
        myMap.put(5, "Green");

        System.out.println("My hash map:");
        System.out.println(myMap + "\n");

        System.out.println("Set view of the keys in HashMap: " + myMap.keySet());
    }
}