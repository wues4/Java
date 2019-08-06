package linkedlist.exercise14;
// Write a Java program to remove all the elements from a linked list.

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

        colorList.clear();
        System.out.println("Removed all elements from my list: " + colorList);
        System.out.println();
    }
}