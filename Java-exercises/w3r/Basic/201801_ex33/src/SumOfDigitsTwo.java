// Write a Java program and compute the sum of the digits of an integer.

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        System.out.printf("The sum of the digits is: %d%n",
                Arrays.stream(scanner.next().split(""))
                        .mapToInt(Integer::parseInt)
                        .sum());
    }
}