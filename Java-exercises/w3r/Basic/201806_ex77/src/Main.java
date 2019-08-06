//  Write a Java program to create a new array of length 2 from two arrays of integers with three elements
// and the new array will contain the first and last elements from the two arrays.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {2, 4, 8};
        int[] second = {3, 6, 9};

        int[] newArray = {first[0], second[second.length-1]};

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(newArray));
    }
}
