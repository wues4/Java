package priorityqueue.exercise05;
// Write a Java program to remove all the elements from a priority queue.

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

        myQue.clear();
        System.out.println("My PriorityQueue after clear operation: ");
        System.out.println(myQue + "\n");
    }
}