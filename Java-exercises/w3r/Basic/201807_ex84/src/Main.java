// Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string.
// String length must be greater than three and more.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input String (length must be greater than three)");
        String foo = in.nextLine();
        createNewStringFromGivenString(foo);
    }

    private static void createNewStringFromGivenString(String s){
        if (s.length()>3) {
            String newString = s.substring(s.length()-3, s.length()).concat(s).concat(s.substring(s.length()-3, s.length()));
            System.out.println(newString);
        } else
            System.out.println("Your string is too short !");
    }
}
