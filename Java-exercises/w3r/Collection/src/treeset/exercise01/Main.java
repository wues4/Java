package treeset.exercise01;
// Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("My tree set: " + mySet + "\n");
    }
}
