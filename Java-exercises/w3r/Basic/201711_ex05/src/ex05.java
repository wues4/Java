//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class ex05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum : " + (a + b));
        System.out.println("Subtract : " + (a - b));
        System.out.println("Multiply : " + (a * b));
        System.out.println("Divide : " + (a / b));
    }
}
