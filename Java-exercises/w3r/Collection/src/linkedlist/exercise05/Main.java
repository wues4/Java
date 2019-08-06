package linkedlist.exercise05;
// Write a Java program to insert the specified element at the specified position in the linked list.

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

        colorList.add(2, "Black");
        System.out.println("My list with new element: " + colorList);
        System.out.println();
    }
}