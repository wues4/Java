// Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
// The length of the original string must be 3 and above.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input string of 3 or more characters: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println("Your string: " + string);
        System.out.println("Changed string: " + createNewString(string));
        System.out.println("Second method: " + createNewStringTwo(string));
    }

    private static String createNewString(String s){
        String reverseString = new StringBuilder(s).reverse().toString().substring(0,3);
        String result = new StringBuilder(reverseString).reverse().toString();
        return result.concat(result).concat(result).concat(result);
    }

    private static String createNewStringTwo(String s){
        String result = s.substring(s.length()-3);
        return result+result+result+result;
    }
}
