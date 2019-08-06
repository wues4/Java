package priorityqueue.exercise07;
// Write a Java program to compare two priority queues.

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> myQue = new PriorityQueue<>();
        myQue.add("Red");
        myQue.add("Blue");
        myQue.add("Yellow");
        myQue.add("Purple");
        myQue.add("Green");
        System.out.println("My first PriorityQueue: ");
        System.out.println(myQue + "\n");

        PriorityQueue<String> myNewQue = new PriorityQueue<>();
        myNewQue.add("Red");
        myNewQue.add("White");
        myNewQue.add("Yellow");
        myNewQue.add("Black");
        myNewQue.add("Green");
        System.out.println("My second PriorityQueue: ");
        System.out.println(myNewQue + "\n");

        System.out.println("Comparison of two PriorityQueues:");
        for (String e: myQue) {
            System.out.print((myNewQue.contains(e)) + " | ");
        }
    }
}