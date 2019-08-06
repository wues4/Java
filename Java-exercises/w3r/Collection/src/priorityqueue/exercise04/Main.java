package priorityqueue.exercise04;
// Write a Java program to insert a given element into a priority queue.

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

        myQue.offer("White");
        System.out.println("Updated PriorityQueue: ");
        System.out.println(myQue + "\n");
    }
}