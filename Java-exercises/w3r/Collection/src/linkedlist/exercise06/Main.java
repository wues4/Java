package linkedlist.exercise06;
// Write a Java program to insert elements into the linked list at the first and last position.

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

//        colorList.add(0, "Black");
//        colorList.add(colorList.size(), "White");
        ((LinkedList<String>) colorList).addFirst("Black");
        ((LinkedList<String>) colorList).addLast("White");
        System.out.println("My list after change: " + colorList);
        System.out.println();
    }
}