package hashset.exercise02;
// Write a Java program to iterate through all elements in a hash list.

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

        System.out.println("Iterate through all elements in hash set: ");
        mySet.forEach(System.out::println);
    }
}