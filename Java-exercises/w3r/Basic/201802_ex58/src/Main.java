// Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = in.nextLine();
        capitalizeLetters(sentence);
    }

    private static void capitalizeLetters(String s) {
        String upper_case_sentence="";
        Scanner lineScan = new Scanner(s);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            upper_case_sentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_sentence.trim());
    }
}
