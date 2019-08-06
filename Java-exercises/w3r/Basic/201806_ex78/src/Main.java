// Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 6};

        System.out.println(Arrays.toString(array));
        if (array[0] == 4 || array[0] == 7) {
            System.out.println("true");
        } else
            System.out.println(array[1] == 4 || array[1] == 7);
    }
}
