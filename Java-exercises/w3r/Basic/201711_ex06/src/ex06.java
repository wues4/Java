//Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

public class ex06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number: ");
        int a = sc.nextInt();
        for (int i=1; i<11; i++)
        {
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}