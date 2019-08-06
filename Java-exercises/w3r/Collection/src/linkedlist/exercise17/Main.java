package linkedlist.exercise17;
// Write a Java program to join two linked lists.

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        System.out.println("First list: " + list1);
        System.out.println();

        List<String> list2 = new LinkedList<>();
        list2.add("Yellow");
        list2.add("Purple");
        list2.add("White");

        System.out.println("Second list: " + list2);
        System.out.println();

        List<String> bothList = new LinkedList<>();
        bothList.addAll(list1);
        bothList.addAll(list2);
        System.out.println("Both lists: " + bothList);
        System.out.println();
    }
}