package arraylist.exercise05;
// Write a Java program to update specific array element by given element.

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

        colorList.set(0, "Brown");
        System.out.println(colorList);
    }
}
