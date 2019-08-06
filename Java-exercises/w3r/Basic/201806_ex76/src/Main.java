// Write a Java program to test if the first and the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2

public class Main {
    public static void main(String[] args) {
        int[] list1 = {5, 10, 15, 20};
        int[] list2 = {3, 6, 9, 12};
        System.out.println((list1[0] == list2[0]) || (list1[list1.length-1] == list2[list2.length-1]));
    }
}
