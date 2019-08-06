// Write a Java program to count the number of even and odd elements in a given array of integers.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Count odd and even numbers in an array");
        System.out.println("Input the length of an array:");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++){
            System.out.println("Input the " + i + " element from an array: ");
        array[i] = in.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(array));
        howManyOddAndEven(array);
    }

    private static void howManyOddAndEven(int[] ints){
        int odds = 0;
        int even = 0;

        for (int check : ints) {
            if (check % 2 == 0) {
                even++;
            } else
                odds++;
        }

        System.out.println("Odds and even numbers in your array:");
        System.out.println("Odds: " + odds);
        System.out.println("Even: " + even);
    }
}
