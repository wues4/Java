// Write a Java program to convert a given string into lowercase.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ipnut uppercase string: ");
        String sentence = in.nextLine();
        stringToUpperCase(sentence);
    }

    private static void stringToUpperCase(String s) {
        StringBuilder lower_case_sentence = new StringBuilder();
        Scanner lineScan = new Scanner(s);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            lower_case_sentence.append(word.toLowerCase()).append(" ");
        }
        System.out.println("Your lowercase string: " + lower_case_sentence.toString().trim());
    }
}
