package arraylist.exercise16;
// Write a Java program to clone an array list to another array list.

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

        List<String> colorList2 = new ArrayList<>(colorList1);

        System.out.println("Second array: " + colorList2);
        System.out.println();
    }
}
