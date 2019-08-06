package linkedlist.exercise04;
// Write a Java program to iterate a linked list in reverse order.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("My list: " + colorList);
        System.out.println();

        System.out.println("Iterate in reverse order:");
        Iterator it = ((LinkedList<String>) colorList).descendingIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}