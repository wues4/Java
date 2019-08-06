package arraylist.exercise04;
// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println(colorList);

        System.out.println(colorList.get(3));
    }
}
