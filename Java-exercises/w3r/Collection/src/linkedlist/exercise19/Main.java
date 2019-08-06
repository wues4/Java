package linkedlist.exercise19;
// Write a Java program to remove and return the first element of a linked list.

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

        System.out.println("Removed element: " + colorList.pop());

        System.out.println("My list after pop operation: " + colorList);
        System.out.println();

    }
}