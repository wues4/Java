package hashset.exercise04;
// Write a Java program to empty an hash set.

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

        System.out.println("Hash set: " + mySet);

        System.out.println("Emptying hash set ...\n");
        mySet.clear();

        System.out.println("Hash set after clear operation: " + mySet);
    }
}