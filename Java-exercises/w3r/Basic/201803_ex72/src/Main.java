//Write a Java program to create a new string taking first three characters from a given string.
// If the length of the given string is less than 3 use "#" as substitute characters.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String word = in.next();
        System.out.println("Your string: " + word);
        System.out.println("New string: " + createNewString(word));
    }

    private static String createNewString(String word) {
        if (word.length() == 2){
            return word.concat("#");
        } else if (word.length() == 1) {
            return word.concat("##");
        } else if (word.length() == 0) {
            return word.concat("###");
        }
        return word.substring(0,3);
    }
}
