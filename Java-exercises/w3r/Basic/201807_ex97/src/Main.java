// Write a Java program to check if an array of integers contains a specified number next to each other
// or there are two same specified numbers separated by one element.

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 10, 50, 20, 13, 50};
        int[] array2 = {10, 10, 50, 50, 20, 13, 50};
        int[] array3 = {10, 70, 20, 50, 20, 50, 70};
        int x = 50;

        myMethod(array1, x);
        myMethod(array2, x);
        myMethod(array3, x);
    }

    private static void myMethod(int[] ints, int x){

        for (int i = 0; i<ints.length-1; i++) {
            if (ints[i] == x && ints[i+1] == x) {
                System.out.println("True");
                return;
            }

            if (i<=ints.length-3 && ints[i] == x && ints[i+2] == x) {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }
}
