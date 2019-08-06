package hashset.exercise03;
// Write a Java program to get the number of elements in a hash set.

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

        System.out.println("Number of elements in hash set: " + mySet.size());
    }
}