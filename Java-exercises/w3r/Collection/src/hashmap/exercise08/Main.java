package hashmap.exercise08;
// Write a Java program to test if a map contains a mapping for the specified value.

import java.util.HashMap;
import java.util.Scanner;

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

        Scanner in = new Scanner(System.in);
        System.out.print("Input specified value(String) to check if it exists: ");
        String n = in.next();
        System.out.println("Testing if specified value exists in HashMap...");
        if (myMap.containsValue(n)) {
            System.out.println("Value exist !");
        } else
            System.out.println("There is no such value in this HashMap !");
    }
}