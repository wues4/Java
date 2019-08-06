// Write a Java program to extract the first half of a string of even length.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = in.next();
        System.out.println("Your string: " + s);
        System.out.println("Extracted string: " + createNewString(s));
    }

    private static String createNewString(String string){
        int lengthOfString = string.toCharArray().length;
        return string.substring(0, lengthOfString / 2);
    }
}
