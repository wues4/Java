package treeset.exercise09;
// Write a Java program to find the numbers less than 7 in a tree set.

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(17);
        mySet.add(2);
        mySet.add(5);
        mySet.add(11);
        mySet.add(1);

        System.out.println("My tree set: " + mySet + "\n");

        System.out.println("Numbers less than 7 in my tree set: " + mySet.headSet(7));

//        for (Integer e: mySet) {
//            if (e < 7){
//                System.out.print(e + " | ");
//            }
//        }
    }
}
