package hashset.exercise09;
// Write a Java program to convert a hash set to a List/ArrayList.

import java.util.ArrayList;
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

        var newSet = new ArrayList<>(mySet);
        System.out.println("Hash set converted to array list: " + newSet.toString());
    }
}