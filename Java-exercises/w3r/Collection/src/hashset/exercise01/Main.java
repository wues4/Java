package hashset.exercise01;
// Write a Java program to append the specified element to the end of a hash set.

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

        System.out.println("My set: " + mySet + "\n");
    }
}