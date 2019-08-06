package priorityqueue.exercise11;
// Write a Java program to convert a Priority Queue elements to a string representation.

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> myQue = new PriorityQueue<>();
        myQue.add("Red");
        myQue.add("Blue");
        myQue.add("Yellow");
        myQue.add("Purple");
        myQue.add("Green");

        System.out.println("My PriorityQueue: ");
        System.out.println(myQue + "\n");

        String stringRepOfMyQue = myQue.toString();
        System.out.println("String representation of my PriorityQueue:");
        System.out.println(stringRepOfMyQue + "\n");
    }
}