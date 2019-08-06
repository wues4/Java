// Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class CheckNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        oddOrEven(num);
    }

    private static void oddOrEven(int number)
    {
        if ((number % 2) == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
