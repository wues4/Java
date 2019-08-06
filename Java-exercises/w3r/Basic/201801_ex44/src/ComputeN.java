//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;

public class ComputeN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer value: ");
        int n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", n,n,n,n,n,n);
    }
}
