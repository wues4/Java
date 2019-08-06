//Write a Java program to swap two variables.

import java.util.Scanner;

public class Exercise13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Input first number: ");
        a = sc.nextInt();

        System.out.println("Input second number: ");
        b = sc.nextInt();

        System.out.println("Numbers before swapping are: " + a + " and " + b);

        c=a;
        a=b;
        b=c;
        System.out.println("Swapped numbers are: " + a + " and " + b );
    }
}
