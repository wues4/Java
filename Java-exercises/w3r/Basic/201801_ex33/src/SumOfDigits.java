// Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        long number=in.nextLong();
        System.out.println("The sum of the digits in number " + number + " is: " + sumDigits(number));
    }

    public static int sumDigits(long n)
    {
        int sum=0;

        while (n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}