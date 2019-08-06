package treeset.exercise07;
// Write a Java program to get the number of elements in a tree set.

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

        System.out.println("Number of elements in my tree set: " + mySet.size() + "\n");
    }
}
