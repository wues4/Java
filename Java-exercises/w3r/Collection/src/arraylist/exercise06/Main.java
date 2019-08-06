package arraylist.exercise06;
// Write a Java program to remove the third element from a array list.

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

        colorList.remove(3);
        System.out.println(colorList);
    }
}
