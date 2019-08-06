package linkedlist.exercise25;
// Write a Java program to test an linked list is empty or not.

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

        System.out.println("Is your list empty ?: " + colorList.isEmpty() + "\n");

        colorList.clear();
        System.out.println("List cleared !");
        System.out.println("Is your list empty ?: " + colorList.isEmpty() + "\n");
    }
}