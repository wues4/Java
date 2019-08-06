package treeset.exercise04;
// Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();
        mySet.add("Red");
        mySet.add("Blue");
        mySet.add("Yellow");
        mySet.add("Purple");
        mySet.add("Green");

        System.out.println("My tree set in normal order: " + mySet + "\n");

        Iterator iterator = ((TreeSet<String>) mySet).descendingIterator();
        System.out.println("My tree set in reverse order: ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");
    }
}
