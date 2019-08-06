package hashset.exercise07;
// Write a Java program to convert a hash set to an array.

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        String[] arr = new String[mySet.size()];
        mySet.toArray(arr);
        System.out.println("Hash set converted to array:");
        int i = 0;
        for (String e: arr) {
            System.out.println("[" + i + "]" + e);
            i++;
        }
    }
}