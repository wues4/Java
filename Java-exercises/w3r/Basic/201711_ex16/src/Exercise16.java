// Write a Java program to compare two numbers.

import java.util.Scanner;

public class Exercise16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b)
            System.out.println(a + " = " + b);
        else if (a > b)
            System.out.println(a + " > " + b);
        else if (a < b)
            System.out.println(a + " < " + b);
        else
            System.out.println("ERROR");

        System.out.println("*** PROGRAM ENDED ***");
    }
}
