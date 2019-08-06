package linkedlist.exercise02;
// Write a Java program to iterate through all elements in a linked list.

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

        colorList.forEach(System.out::println);
    }
}