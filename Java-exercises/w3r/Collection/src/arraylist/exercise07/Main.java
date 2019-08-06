package arraylist.exercise07;
// Write a Java program to search an element in a array list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println(colorList.contains("Blue"));

        for (int i = 0; i<colorList.size(); i++) {
            if (colorList.get(i).equalsIgnoreCase("Blue")) {
                System.out.println("Blue is on " + i + " index");
            }
        }
    }
}
