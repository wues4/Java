// Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of your array of integers: ");
        int[] array = new int[in.nextInt()];

        for (int i=0; i<=array.length-1; i++) {
            System.out.println("Input value for " + i + " position in your array");
            array[i] = in.nextInt();
        }

        System.out.println("Your array looks like this: " + Arrays.toString(array));
        largestElementOfArray(array);
    }

    private static void largestElementOfArray (int[] array){
        int largestElement = 0;
        for (int ints : array) {
            if (ints > largestElement) {
                largestElement = ints;
            }
        }

        System.out.println("Largest element in your array is: " + largestElement );
    }
}
