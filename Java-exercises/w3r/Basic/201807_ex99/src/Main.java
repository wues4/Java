// Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.

public class Main {
    public static void main(String[] args) {
        int[] array = {30,20,15,20,10,20,50,20};
        int foo = 20, bar = 0;

        for (int i = 0; i<array.length; i++) {
            if (array[i] != foo && array[i+1] != foo) {
                bar = 1;
            }
        }
        if (bar == 1) {
            System.out.println("False");
        } else
            System.out.println("True");
    }
}
