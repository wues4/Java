package linkedlist.exercise15;
// Write a Java program of swap two elements in an linked list.

import java.util.Collections;
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

        Collections.swap(colorList,0,4);
        System.out.println("List after swap two elements: " + colorList);
        System.out.println();
    }
}