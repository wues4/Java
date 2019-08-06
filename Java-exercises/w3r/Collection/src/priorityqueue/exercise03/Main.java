package priorityqueue.exercise03;
// Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> myQue = new PriorityQueue<>();
        myQue.add("Red");
        myQue.add("Blue");
        myQue.add("Yellow");
        System.out.println("My PriorityQueue: ");
        System.out.println(myQue + "\n");

        PriorityQueue<String> myNewQue = new PriorityQueue<>();
        myNewQue.add("Purple");
        myNewQue.add("Green");
        myNewQue.add("White");
        System.out.println("My second PriorityQueue: ");
        System.out.println(myNewQue + "\n");

        myNewQue.addAll(myQue);
        System.out.println("Adding elements from first PriorityQueue to the second PriorityQueue: ");
        System.out.println(myNewQue);
    }
}