package treeset.exercise03;
// Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");

        System.out.println("My tree set: " + mySet + "\n");

        Set<String> myNewSet = new TreeSet<>();
        myNewSet.add("White");
        myNewSet.add("Purple");
        myNewSet.add("Green");

        myNewSet.addAll(mySet);
        System.out.println("My new tree set: " + myNewSet + "\n");
    }
}
