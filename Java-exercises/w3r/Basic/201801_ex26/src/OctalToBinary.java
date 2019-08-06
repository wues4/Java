// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        String octalNumber, binaryNumber;
        int decimalNumber=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input octal number:");
        octalNumber=in.nextLine();

        try {
            decimalNumber = Integer.parseInt(octalNumber, 8);
        } catch (Exception e) {
            System.out.println(e);
        }

        binaryNumber=Integer.toBinaryString(decimalNumber);
        System.out.println("Binary value: " + binaryNumber);
    }
}