package linkedlist.exercise07;
// Write a Java program to insert the specified element at the front of a linked list.

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

        ((LinkedList<String>) colorList).offerFirst("Black");
        System.out.println("My list after change: " + colorList);
        System.out.println();
    }
}