package priorityqueue.exercise06;
// Write a Java program to count the number of elements in a priority queue.

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

        System.out.println("Number of elements in my PriorityQueue: " + myQue.size());
    }
}