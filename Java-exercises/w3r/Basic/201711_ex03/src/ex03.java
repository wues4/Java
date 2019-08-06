/*Write a Java program to divide two numbers and print on the screen.*/

import java.util.Scanner;

public class ex03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Divide of two numbers");

        System.out.println("First number: ");
        int a = sc.nextInt();
        System.out.println("Second number: ");
        int b = sc.nextInt();
        System.out.println(a  + " / " + b + " = " + (a/b));
    }
}
