package arraylist.exercise10;
// Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println(colorList);

        Collections.shuffle(colorList, new Random());
        System.out.println(colorList);
    }
}
