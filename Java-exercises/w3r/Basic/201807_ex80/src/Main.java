// Write a Java program to get the larger value between first and last element of an array (length 3) of integers

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int[] array = new int[3];

        for (int i = 0; i<array.length; i++){
            array[i] = in.nextInt();
        }

        System.out.println("Your numbers in array: " + Arrays.toString(array));
        compareFirstAndLastElementOfArray(array);
    }

    private static void compareFirstAndLastElementOfArray(int[] array){
        if (array[0] > array[array.length-1]) {
            System.out.println("First element of your array is greater than last and the value of it is: " + array[0]);
        } else if (array[0] < array[array.length - 1]) {
            System.out.println("Last element of your array is greater than first and the value of it is: " + array[array.length - 1]);
        } else {
            System.out.println("First and last elements are equal ! first: " + array[0] + ", last: " + array[array.length - 1]);
        }
    }
}
