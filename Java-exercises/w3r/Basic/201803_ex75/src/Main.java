// Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2

public class Main {
    public static void main(String[] args) {
        int[] list = {20, 15, 55, 85, 20};
        System.out.println(list[0] == list[list.length-1]);
    }
}
