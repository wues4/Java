// Write a Java program to print the ascii value of a given character.

import java.util.Scanner;

public class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a character: ");
        String character = in.next();
        int ascii = (int)character.charAt(0);
        System.out.println("ASCII value of given char: " + "'" + character.charAt(0) + "'" + " are: " + ascii);
    }
}