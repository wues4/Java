package arraylist.exercise02;
// Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        for (String i: colorList) {
            System.out.println(i);
        }
    }
}
