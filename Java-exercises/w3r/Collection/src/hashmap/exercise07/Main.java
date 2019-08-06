package hashmap.exercise07;
// Write a Java program to test if a map contains a mapping for the specified key.

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
        System.out.print("Input key value(int) to check if it exists: ");
        int n = in.nextInt();
        System.out.println("Testing if specified key exists in HashMap...");
        if (myMap.containsKey(n)) {
            System.out.println("Key exist ! Value of this key is: " + myMap.get(n));
        } else
            System.out.println("There is no such key in this HashMap !");
    }
}