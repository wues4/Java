package hashset.exercise11;
// Write a Java program to compare two sets and retain elements which are same on both sets.

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

        System.out.println("Elements same on both sets:");
        for (String e : mySet) {
            if (newSet.contains(e)) {
                System.out.println(e);
            }
        }

//        mySet.retainAll(newSet);
//        System.out.println(mySet);
    }
}