package treeset.exercise08;
// Write a Java program to compare two tree sets.

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

        System.out.println("My tree set: " + mySet);

        Set<String> myNewSet = new TreeSet<>();
        myNewSet.add("Red");
        myNewSet.add("White");
        myNewSet.add("Yellow");
        myNewSet.add("Black");
        myNewSet.add("Green");

        System.out.println("My new tree set: " + myNewSet + "\n");

        System.out.println("Compare two tree sets:");
        for (String e:mySet) {
            System.out.print((myNewSet.contains(e) ? "Yes" : "No") + " | ");
        }
    }
}
