/*Write a Java program to print the sum of two numbers.*/

import java.util.Scanner;

public class ex02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of two numbers");

        System.out.println("First number: ");
        int a = sc.nextInt();
        System.out.println("Second number: ");
        int b = sc.nextInt();
        System.out.println(a  + " + " + b + " = " + (a+b) );
    }
}
