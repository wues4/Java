//Given two non-negative int values, return true if they have the same last digit

import java.util.Scanner;

public class Exercise15
{
    private static boolean lastD (int a , int b)
    {
        return(a % 10 == b % 10 );
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        System.out.println(lastD(sc.nextInt(),sc.nextInt()));
    }
}
