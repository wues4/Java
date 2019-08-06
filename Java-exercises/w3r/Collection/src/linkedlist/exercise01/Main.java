package linkedlist.exercise01;
// Write a Java program to append the specified element to the end of a linked list.

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

        colorList.add(colorList.size(), "Brown");
        System.out.println("My list: " + colorList);
    }
}