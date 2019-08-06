//  Write a Java program to find the penultimate (next to last) word of a sentence.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sentence = in.nextLine();
        wordFinder(sentence);
    }

    private static void wordFinder(String s){
        String[] word = s.split(" ");
        String nextToLast = word[word.length-2];
        System.out.println("Your next to last word in a string is: " + nextToLast);
    }
}