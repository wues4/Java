// Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two strings with different length:");
        String first = in.next();
        String second = in.next();
        System.out.println("Your strings: " + first + " + " + second);
        System.out.println("New string: " + createNewString(first,second));
    }

    private static String createNewString(String first, String second) {
        String invalidInput = "Your strings are the same length";
        if (first.toCharArray().length < second.toCharArray().length) {
            return first+second+first;
        } else if (first.toCharArray().length > second.toCharArray().length) {
            return second+first+second;
        } else return invalidInput;
    }
}
