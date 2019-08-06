package treeset.exercise16;
// Write a Java program to remove a given element from a tree set.

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("My tree set: " + mySet + "\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Input element which you want to remove from a tree set: ");
        String n = in.next();

        if (mySet.contains(n)) {
            mySet.remove(n);
            System.out.println("Tree set after removing element: " + n);
            System.out.println(mySet);
        } else
            System.out.println("There is no such element !");
    }
}
