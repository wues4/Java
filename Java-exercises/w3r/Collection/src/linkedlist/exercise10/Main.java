package linkedlist.exercise10;
// Write a Java program to get the first and last occurrence of the specified elements in a linked list.

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

        System.out.println("First element of the list: " + ((LinkedList<String>) colorList).getFirst());
        System.out.println("Last element of the list: " + ((LinkedList<String>) colorList).getLast());
    }
}