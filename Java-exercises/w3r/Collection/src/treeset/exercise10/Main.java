package treeset.exercise10;
// Write a Java program to get the element in a tree set which is greater than or equal to the given element.

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

        System.out.println("Element greater than or equal to " + n + " is: " + mySet.ceiling(n));

//        for (Integer e : mySet) {
//            if (e >= n) {
//                System.out.print("Element greater than or equal to " + n + " is: " + e);
//                break;
//            } else if (n > 50) {
//                System.out.println("Your number are greater than any number on tree set !");
//                break;
//            }
//        }
    }
}
