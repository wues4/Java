// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.println(isEqual(num1,num2,num3));
    }

    private static boolean isEqual(int num1, int num2, int num3)
    {
        boolean check = false;
        if ((num1+num2) == num3) {
            check = true;
        }

        return check;
    }
}
