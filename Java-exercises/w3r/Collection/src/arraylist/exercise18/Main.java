package arraylist.exercise18;
// Write a Java program to test an array list is empty or not.

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
        System.out.println("Is my list empty ?: " + colorList1.isEmpty());
        System.out.println();

        colorList1.clear();
        System.out.println("My list after removing all objects: " + colorList1);
        System.out.println("Is my list empty ?: " + colorList1.isEmpty());
    }
}