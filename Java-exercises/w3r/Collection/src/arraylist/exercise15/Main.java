package arraylist.exercise15;
// Write a Java program to join two array lists.

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

        System.out.println("First array: " + colorList1);
        System.out.println();

        List<String> colorList2 = new ArrayList<>();
        colorList2.add("Red");
        colorList2.add("Green");
        colorList2.add("Blue");
        colorList2.add("Yellow");

        System.out.println("Second array: " + colorList2);
        System.out.println();

        List<String> bothList = new ArrayList<>();
        bothList.addAll(colorList1);
        bothList.addAll(colorList2);

        System.out.println("Both list together: " + bothList);
        System.out.println();
    }
}
