package arraylist.exercise11;
// Write a Java program to reverse elements in a array list.

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

        System.out.println(colorList);

        Collections.reverse(colorList);
        System.out.println(colorList);
    }
}
