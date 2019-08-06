package linkedlist.exercise09;
// Write a Java program to insert some elements at the specified position into a linked list.

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

        List<String> newColorList = new LinkedList<>();
        newColorList.add("Black");
        newColorList.add("White");

        System.out.println("My new list: " + newColorList);
        System.out.println();

        colorList.addAll(2, newColorList);

        System.out.println("Both lists merged: " + colorList);
        System.out.println();
    }
}