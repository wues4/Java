package linkedlist.exercise12;
// Write a Java program to remove a specified element from a linked list.

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

        System.out.println("My original list: " + colorList);
        System.out.println();

        colorList.remove(3);
        System.out.println("My original list after remove specified element: " + colorList);
        System.out.println();
    }
}