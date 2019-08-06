// Write a Java program to reverse a word.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = in.nextLine();
        stringReverse(word);
    }

    private static void stringReverse(String w) {
        StringBuilder reversedWord = new StringBuilder(w);
        System.out.println("Reversed word: " + reversedWord.reverse());
    }
}
