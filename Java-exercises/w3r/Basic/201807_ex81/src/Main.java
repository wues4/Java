// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.

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
        swapFirstAndLastElementOfArray(array);
    }

    private static void swapFirstAndLastElementOfArray (int[] array){

        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[0] = array[array.length-1];
        newArray[newArray.length-1] = array[0];

        System.out.println("Your array with swapped first and last element is: " + Arrays.toString(newArray));
    }
}
