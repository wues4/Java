package arraylist.exercise03;
// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println("Old list");
        for (String i: colorList) {
            System.out.println(i);
        }

        System.out.println();

        colorList.add(0, "Pink");
        System.out.println("New list");
        for (String i: colorList) {
            System.out.println(i);
        }
    }
}
