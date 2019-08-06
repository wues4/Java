package hashset.exercise10;
// Write a Java program to compare two hash set.

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

        System.out.println("First hash set: " + mySet + "\n");

        Set<String> newSet = new HashSet<>();
        newSet.add("White");
        newSet.add("Blue");
        newSet.add("Yellow");
        newSet.add("Black");
        newSet.add("Green");

        System.out.println("Second hash set: " + newSet + "\n");

        System.out.println("Comparison of two hash sets:");
        for (String e : mySet) {
            System.out.println(newSet.contains(e) ? "True" : "False");
        }
    }
}