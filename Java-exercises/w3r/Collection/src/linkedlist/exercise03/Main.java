package linkedlist.exercise03;
// Write a Java program to iterate through all elements in a linked list starting at the specified position.

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


        System.out.println("Iterate through all elements:");
        colorList.forEach(System.out::println);
        System.out.println();

        System.out.println("Iterate starting from specified position:");
        Iterator it = colorList.listIterator(2);
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println();

        for (int i=2; i<colorList.size(); i++){
            System.out.println("[" + i + "] " + colorList.get(i));
        }
    }
}