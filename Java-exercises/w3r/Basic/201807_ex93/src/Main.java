// Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {2, 10, 10, 5, 18, 23};
        int[] arrayTwo = {10, 10, 2, 14, 20, 20};
        int[] arrayThree = {13,37,5,8,12,1};


        System.out.println("Original Array: " + Arrays.toString(arrayOne));
        checkArray(arrayOne);

        System.out.println("Original Array: " + Arrays.toString(arrayTwo));
        checkArray(arrayTwo);

        System.out.println("Original Array: " + Arrays.toString(arrayThree));
        checkArray(arrayThree);

    }

    private static void checkArray (int[] ints){
        boolean contain10 = false;
        boolean contain20 = false;

        for(int i = 0; i < ints.length - 1; i++) {
            if(ints[i] == 10 && ints[i+1] == 10)
                contain10 = true;

            if(ints[i] == 20 && ints[i+1] == 20)
                contain20 = true;
        }

        System.out.print(String.valueOf(contain10 != contain20));
        System.out.println();
    }
}
