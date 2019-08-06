// Write a Java program to convert a octal number to a decimal number.

import java.util.Scanner;

public class OctalToDecimalTwo {
    public static void main(String[] args) {
        String octalNumber;
        int decimalNumber;

        Scanner in = new Scanner(System.in);
        System.out.print("Input octal number:");
        octalNumber=in.nextLine();

        try {
            decimalNumber = Integer.parseInt(octalNumber, 8);
            System.out.println("Decimal value: " + decimalNumber);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}