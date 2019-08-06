// Write a Java program to check if a string starts with a specified word.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence = "How are you ?";
        System.out.println("Your string: " + sentence);
        System.out.println(checkStringStartsWith(sentence));
    }

    private static boolean checkStringStartsWith(String s){
        System.out.println("Input word: ");
        Scanner in = new Scanner(System.in);
        return s.toLowerCase().startsWith(in.nextLine().toLowerCase());
    }
}
