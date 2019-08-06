package treeset.exercise15;
//  Write a Java program to retrieve and remove the last element of a tree set.

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

        System.out.println("Retrieve and remove last element of a tree set: " + mySet.pollLast());

        System.out.println("After removing last element: " + mySet + "\n");
    }
}
