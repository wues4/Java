package linkedlist.exercise22;
// Write a Java program to check if a particular element exists in a linked list.

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

        System.out.println("Is Red color present in the list ?: " + colorList.contains("Red"));
    }
}