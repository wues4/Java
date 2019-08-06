package linkedlist.exercise11;
// Write a Java program to display the elements and their positions in a linked list.

import java.util.Iterator;
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

        Iterator it = colorList.iterator();
        for (int i = 0; i< colorList.size(); i++){
            if (it.hasNext())
                System.out.println("[" + i + "]" + it.next());
        }
    }
}