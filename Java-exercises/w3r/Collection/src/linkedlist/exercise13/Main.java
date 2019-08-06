package linkedlist.exercise13;
// Write a Java program to remove first and last element from a linked list.

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

        colorList.removeFirst();
        colorList.removeLast();
        System.out.println("My list after remove first and last element: " + colorList);
        System.out.println();
    }
}