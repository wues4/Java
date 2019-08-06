package treeset.exercise14;
// Write a Java program to retrieve and remove the first element of a tree set.

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

        System.out.println("Retrieve and remove first element of a tree set: " + mySet.pollFirst());

        System.out.println("After removing first element: " + mySet + "\n");
    }
}
