package treeset.exercise02;
// Write a Java program to iterate through all elements in a tree set.

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

        mySet.forEach(System.out::println);
    }
}
