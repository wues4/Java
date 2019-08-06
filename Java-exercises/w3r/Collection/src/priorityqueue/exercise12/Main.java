package priorityqueue.exercise12;
// Write a Java program to change priorityQueue to maximum priority queue.

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> myQue = new PriorityQueue<>(10, Comparator.reverseOrder());
        myQue.add(23);
        myQue.add(4);
        myQue.add(46);
        myQue.add(17);
        myQue.add(48);
        myQue.add(9);

        System.out.println("Maximum PriorityQueue: ");
        System.out.println(myQue + "\n");
    }
}