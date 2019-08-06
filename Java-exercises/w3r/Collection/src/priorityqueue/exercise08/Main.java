package priorityqueue.exercise08;
// Write a Java program to retrieve the first element of the priority queue.

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

        System.out.println("First element of my PriorityQueue: ");
        System.out.println(myQue.peek());
    }
}