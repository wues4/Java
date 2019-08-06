package linkedlist.exercise26;
// Write a Java program to replace an element in a linked list.

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("My list: " + colorList + "\n");

        colorList.set(0, "White");
        System.out.println("First element replaced");
        System.out.println("My list: " + colorList + "\n");
    }
}