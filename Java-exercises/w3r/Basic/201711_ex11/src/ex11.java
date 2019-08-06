//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class ex11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers to calculate average ");

        System.out.println("Input first number: ");
        float a = sc.nextFloat();

        System.out.println("Input second number: ");
        float b = sc.nextFloat();

        System.out.println("Input third number: ");
        float c = sc.nextFloat();

        System.out.println("Average of your numbers: " + "(" + a + " + " + b + " + " + c + ")" + "/3" + " = " + (a + b + c)/3);
    }
}
