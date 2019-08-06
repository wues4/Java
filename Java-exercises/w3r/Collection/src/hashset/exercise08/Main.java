package hashset.exercise08;
// Write a Java program to convert a hash set to a tree set.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        var newSet = new TreeSet<>(mySet);
        System.out.println("Hash set converted to tree set: " + newSet.toString());
    }
}