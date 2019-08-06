// Write a Java program to count the letters, spaces, numbers and other characters of an input string.


import java.util.Scanner;

public class StringFormat
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String sentence = in.nextLine();
        System.out.print("The string: " + sentence + "\n");
        countOccurrencies(sentence);
    }

    private static void countOccurrencies(String str)
    {
        int letters=0;
        int digits=0;
        int spaces=0;
        int other=0;
        char[] chars=str.toCharArray();

        for (int i=0; i<str.length();i++)
        {
            if (Character.isLetter(chars[i]))
            {
                letters++;
            }
            else if (Character.isDigit(chars[i]))
            {
                digits++;
            }
            else if (Character.isSpaceChar(chars[i]))
            {
                spaces++;
            }
            else
                {
                    other++;
                }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other: " + other);
    }
}