//Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2.

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 5, 23, 45, 34,20};
        System.out.println(list[0] == 10 || (list.length-1)==10);
    }
}
