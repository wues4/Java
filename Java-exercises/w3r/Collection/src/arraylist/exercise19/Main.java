package arraylist.exercise19;
// Write a Java program to trim the capacity of an array list the current list size.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList1 = new ArrayList<>();
        colorList1.add("Red");
        colorList1.add("Green");
        colorList1.add("Blue");
        colorList1.add("Yellow");
        colorList1.add("Purple");

        System.out.println("My list: " + colorList1);
        System.out.println();

        ((ArrayList<String>) colorList1).trimToSize();
        System.out.println("My list after trim to size: " + colorList1);
        System.out.println();
    }
}