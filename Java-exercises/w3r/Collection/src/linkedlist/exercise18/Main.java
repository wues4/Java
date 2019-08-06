package linkedlist.exercise18;
// Write a Java program to clone an linked list to another linked list.

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        System.out.println("My list: " + colorList);
        System.out.println();

        List<String> clonedList = (List<String>) colorList.clone();
        System.out.println("Cloned list: " + clonedList);
        System.out.println();
    }
}