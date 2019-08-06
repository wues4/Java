// Given an int n, return the absolute difference between n and 21

import java.util.Scanner;

public class Exercise14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Difference between your number and 21");
        System.out.println("Input number: ");
        int n = sc.nextInt();

        if (n<=21)
        {
            System.out.println(21 - n);
        }
        else if (n>21)
        {
            System.out.println(n - 21);
        }
    }
}
