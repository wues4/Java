package arraylist.exercise21;
// Write a Java program to replace the second element of a ArrayList with the specified element.

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

        System.out.println("My list: " + colorList1);
        System.out.println();

        colorList1.set(2, "Brown");
        System.out.println("My list: " + colorList1);
    }
}