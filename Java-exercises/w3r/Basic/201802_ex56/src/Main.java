// Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Set the range of integers");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("Input division integer:");
        int z = in.nextInt();

        result(x,y,z);
    }

    private static void result(int x, int y, int z) {
        if (x < y) {
            System.out.println("Numbers of integers divisible by " + z + " in range of " + x + "-" + y + " are: ");
            for (int i = x; i <= y; i++) {
                if ((i % z) == 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Set the range of numbers from small to large.");
        }
    }
}