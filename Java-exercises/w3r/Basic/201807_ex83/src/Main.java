// Write a Java program to multiply corresponding elements of two arrays of integers.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {5, 2, -3, 7, 1};
        int[] secondArray = {8, -4, -2, 2, 7};

        System.out.println("Your arrays looks like this: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        multiplicationOfTwoArrays(firstArray, secondArray);
    }

    private static void multiplicationOfTwoArrays (int[] firstArray, int[] secondArray){
        int[] newArray = new int[firstArray.length];
        for (int i = 0; i<firstArray.length; i++) {
            int a  = firstArray[i];
            int b = secondArray[i];
            int c = a*b;
            newArray[i] = c;
        }

        System.out.println("Multiplication corresponding elements of two arrays are:");
        System.out.println(Arrays.toString(newArray));
    }
}
