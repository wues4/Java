package hashset.exercise06;
// Write a Java program to clone a hash set to another hash set.

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("Original hash set: " + mySet);

        HashSet cloneSet = (HashSet) mySet.clone();
        System.out.println("Cloned hash set: " + cloneSet);
    }
}