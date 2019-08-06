// Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class SumOfDigitsThree
{
    public static void main(String[] args)
    {
        int sum=0;
        System.out.print("Input number: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        for (int i=0; i<=number.length()-1;i++)
        {
            sum+=Character.getNumericValue(number.charAt(i));
        }
        System.out.println("The sum of the digits in number " + number + " is: " + sum);
    }
}