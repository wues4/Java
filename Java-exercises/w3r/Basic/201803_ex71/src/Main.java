// Write a Java program to create the concatenation of the two strings except removing the first character of each string.
// The length of the strings must be 1 and above.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 string of length 1 or above");
        String first = in.next();
        String second = in.next();
        System.out.println("Your strings are " + first + " + " + second);
        System.out.println("Modified string: " + createNewString(first,second));
    }

    private static String createNewString(String s1, String s2){
        return s1.substring(1).concat(s2.substring(1));
    }
}
