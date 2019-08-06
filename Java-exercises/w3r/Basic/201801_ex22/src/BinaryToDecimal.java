// Write a Java program to convert a binary number to decimal number.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        long binaryNumber, decimalNumber=0, remainder, next=1;

        Scanner in = new Scanner(System.in);
        System.out.print("Input binary number: ");
        binaryNumber = in.nextLong();

        while (binaryNumber != 0) {
            remainder=binaryNumber%10;
            decimalNumber=decimalNumber+remainder*next;
            next=next*2;
            binaryNumber/=10;
        }
        System.out.println("Decimal number: " + decimalNumber);
    }
}