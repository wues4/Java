package treeset.exercise06;
// Write a Java program to clone a tree set list to another tree set.

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
        Set<String> cloneSet = new TreeSet<>(mySet);
        System.out.println("Cloned tree set: " + cloneSet);
    }
}
