package arraylist.exercise09;
// Write a Java program to copy one array list into another.

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

        List<String> copy = new ArrayList<>(colorList);
        System.out.println(copy);
    }
}
