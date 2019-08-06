package hashset.exercise05;
// Write a Java program to test a hash set is empty or not.

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

        System.out.println("Hash set is empty ?: " + mySet.isEmpty() + "\n");

        System.out.println("Emptying hash set ...\n");
        mySet.clear();

        System.out.println("Hash set is empty ?: " + mySet.isEmpty() + "\n");
    }
}