// Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers between 25 to 75");
        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.println(numbersCompare(x,y));
    }

    private static boolean numbersCompare(int x, int y) {
        if (x < 25 || x > 75 || y < 25 || y > 75)
            return false;
            int i = x%10;
            int j = y%10;
            x/=10;
            y/=10;
            return (i == j || i == y || x == j || x == y );
    }
}
