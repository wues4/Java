package linkedlist.exercise23;
// Write a Java program to convert a linked list to array list.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        System.out.println("LinkedList converted to ArrayList");
        List<String> colorListNew = new ArrayList<>(colorList);
        System.out.println("My list: " + colorListNew);
        System.out.println();
    }
}