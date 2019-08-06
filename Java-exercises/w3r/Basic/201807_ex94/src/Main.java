// Write a Java program to rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = {3,4,7,12,1,23,9,16};
        System.out.println("Original array:" + Arrays.toString(ints));

        rearrangeAllElementsInArray(ints);
    }

    private static void rearrangeAllElementsInArray(int[] ints){
        int j = 0;
        int[] newArray = new int[ints.length];


        for (int i : ints) {
            if (i % 2 != 0) {
                newArray[j++] = i;
            }
        }
        for (int i : ints) {
            if (i % 2 == 0) {
                newArray[j++] = i;
            }
        }

        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
