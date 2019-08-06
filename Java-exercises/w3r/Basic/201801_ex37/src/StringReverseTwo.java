//Write a Java program to reverse a string.

import java.util.Scanner;

public class StringReverseTwo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        char[] letters = in.nextLine().toCharArray();

        System.out.print("Reversed string: ");
        for (int i=letters.length-1;i>=0;i--)
        {
            System.out.print(letters[i]);
        }
    }
}
