package arraylist.exercise22;
// Write a Java program to print all the elements of a ArrayList using the position of the elements.

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

        for (int i=0; i<colorList1.size(); i++){
            System.out.println("[" + i + "] " + colorList1.get(i));
        }
    }
}