package treeset.exercise05;
// Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("My tree set: " + mySet + "\n");
        System.out.println("First element of my tree set: " + mySet.first());
        System.out.println("Last element of my tree set: " + mySet.last());
    }
}
