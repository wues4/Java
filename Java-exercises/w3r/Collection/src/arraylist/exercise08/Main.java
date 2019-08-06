package arraylist.exercise08;
// Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println("Before sort: " + colorList);

        colorList.sort(String::compareTo);
        System.out.println("After sort: " + colorList);
    }
}
