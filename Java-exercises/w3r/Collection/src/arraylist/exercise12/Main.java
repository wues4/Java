package arraylist.exercise12;
// Write a Java program to extract a portion of a array list.

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

        List<String> newList = colorList.subList(0,2);
        System.out.println(newList);
    }
}
