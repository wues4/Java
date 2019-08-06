package Lesson_02;

import java.util.Arrays;

/**
 * Lesson 02: Arrays
 * CyclicRotation. Rotate an array to the right by a given number of steps.
 */

public class CyclicRotation {
    public static int[] solution(int[] array, int steps) {
        int[] newArray = new int[array.length];
        for (int i = 0; i<array.length; i++) {
            newArray[(i+steps) % array.length] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 6)));
    }
}
