// Write a Java program to add two binary numbers.

import java.util.Scanner;

public class Exercise17
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long bin1, bin2, a, b;
        int i = 0, remainder = 0;
        int[] sum = new int[50];

        System.out.println("Input first binary number: ");
        bin1 = in.nextLong();
        a = bin1;

        System.out.println("Input second binary number: ");
        bin2 = in.nextLong();
        b = bin2;

        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = (int) ((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = (int) ((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;

        System.out.println("Sum of " + a + " and " + b + " are: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
        System.out.println("*** PROGRAM ENDED ***");
    }
}

