package linkedlist.exercise20;
// Write a Java program to retrieve but does not remove, the first element of a linked list.

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("My list: " + colorList);
        System.out.println();

        String first = colorList.peekFirst();
        System.out.println("Retrieve first element: " + first);
    }
}