// Write a Java program to convert a decimal number to hexadecimal number.

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal;
        String result;

        Scanner in = new Scanner(System.in);
        System.out.print("Input decimal number: " );
        decimal = in.nextInt();

        result = Integer.toHexString(decimal);
        System.out.println("Hexadecimal number is " + result);
    }
}