//Write a Java program to reverse a string.

import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sentence=in.nextLine();
        System.out.println("Reversed string: " + new StringBuilder(sentence).reverse().toString());
    }
}