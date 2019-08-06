// Write a Java program to create a new string taking first and last characters from two given strings.
// If the length of either string is 0 use "#" for missing character.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first string: ");
        String s1 = in.nextLine();
        System.out.print("Input second string: ");
        String s2 = in.nextLine();
        System.out.println("Your string: " + s1 + " " + s2);
        System.out.println("New string: " + createNewString(s1, s2));
    }

    private static String createNewString(String s1, String s2) {
        if ((s1.length() & s2.length()) == 0)
            return "##";
        else if (s1.length() == 0)
            return "#".concat(s2.substring(s2.length()-1));
        else if (s2.length() == 0)
            return s1.substring(0,1).concat("#");
        else
            return s1.substring(0,1).concat(s2.substring(s2.length()-1));
    }
}