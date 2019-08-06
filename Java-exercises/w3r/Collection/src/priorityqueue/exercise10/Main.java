package priorityqueue.exercise10;
// Write a Java program to convert a priority queue to an array containing all of the elements of the queue.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        Iterator it = myQue.iterator();

        var arr = new String[myQue.size()];
        int i = 0;
        while (it.hasNext()) {
            arr[i++] = (String) it.next();
        }

        Arrays.sort(arr);
        System.out.println("My PriorityQueue converted into array: ");
        System.out.println(Arrays.toString(arr) + "\n");

//        var myArr = new ArrayList<>(myQue);
//        System.out.println("My PriorityQueue converted into array list: ");
//        System.out.println(myArr + "\n");
    }
}