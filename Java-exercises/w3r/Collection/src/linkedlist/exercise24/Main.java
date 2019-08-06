package linkedlist.exercise24;
// Write a Java program to compare two linked lists.

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> colorListOne = new LinkedList<>();
        colorListOne.add("Red");
        colorListOne.add("Green");
        colorListOne.add("Blue");
        colorListOne.add("Yellow");
        colorListOne.add("Purple");

        System.out.println("First list: " + colorListOne);
        System.out.println();

        LinkedList<String> colorListTwo = new LinkedList<>();
        colorListTwo.add("Black");
        colorListTwo.add("Green");
        colorListTwo.add("Brown");
        colorListTwo.add("Yellow");
        colorListTwo.add("White");

        System.out.println("Second list: " + colorListTwo);
        System.out.println();

        for (int i = 0; i<colorListOne.size(); i++) {
            System.out.println("[" + i + "]" + colorListOne.get(i).contains(colorListTwo.get(i)));
        }
    }
}