package arraylist.exercise17;
// Write a Java program to empty an array list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colorList1 = new ArrayList<>();
        colorList1.add("Red");
        colorList1.add("Green");
        colorList1.add("Blue");
        colorList1.add("Yellow");
        colorList1.add("Purple");

        System.out.println("Before emptying list: " + colorList1);
        System.out.println();

        colorList1.clear();
        System.out.println("After emptying list: " + colorList1);
    }
}
