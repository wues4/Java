// Write a Java program to rotate an array (length 3) of integers in left direction.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[3];

        for (int i=0; i<=array.length-1; i++) {
            System.out.println("Input " + i + " position in array");
            int a = in.nextInt();
            array[i] = a;
        }

        System.out.println("Original array: " + Arrays.toString(array));

        int rotate;
        System.out.println("Rotation: ");
        rotate = in.nextInt();

        int[] newArray = new int[3];
        for (int i=0; i<=array.length-1; i++) {
            newArray[(i + (array.length - rotate)) % array.length] = array[i];
        }

        System.out.println("Rotated array: " + Arrays.toString(newArray));
    }
}
