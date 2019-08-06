package arraylist.exercise13;
// Write a Java program to compare two array lists.

import java.util.ArrayList;
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

        List<String> colorList2 = new ArrayList<>();
        colorList2.add("Red");
        colorList2.add("Green");
        colorList2.add("Blue");
        colorList2.add("Yellow");

        System.out.println("Second array: " + colorList2);

        System.out.println();
        List<String> answerList = new ArrayList<>();

        for (String e : colorList)
            answerList.add(colorList2.contains(e) ? "Yes" : "No");
        System.out.println(answerList);
    }
}
