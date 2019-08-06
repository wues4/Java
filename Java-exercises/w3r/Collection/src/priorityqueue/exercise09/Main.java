package priorityqueue.exercise09;
// Write a Java program to retrieve and remove the first element.

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

        System.out.println("Retrieve and remove first element of my PriorityQueue: ");
        System.out.println(myQue.poll() + "\n");

        System.out.println("My PriorityQueue after removing first element: ");
        System.out.println(myQue + "\n");
    }
}