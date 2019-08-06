package treeset.exercise13;
// Write a Java program to get an element in a tree set which is strictly less than the given element.

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(23);
        mySet.add(38);
        mySet.add(19);
        mySet.add(50);
        mySet.add(28);
        mySet.add(45);

        System.out.println("My tree set: " + mySet + "\n");

        System.out.print("Input number from 1 to 50: ");
        int n = in.nextInt();

        System.out.println("Element lower than or equal to " + n + " is: " + mySet.lower(n));
    }
}
