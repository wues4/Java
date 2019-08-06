package arraylist.exercise14;
// Write a Java program of swap two elements in an array list.

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
        colorList.add("Purple");

        System.out.println("Original array: " + colorList);

        Collections.swap(colorList,1, 3);
        System.out.println("After swap: " + colorList);
    }
}
