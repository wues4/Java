// Write a Java program to convert a octal number to a decimal number.

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        long octalNumber, decimalNumber=0;
        int i=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input octal number: ");
        octalNumber=in.nextLong();

        while (octalNumber!=0) {
            decimalNumber=(long)(decimalNumber+(octalNumber%10)*Math.pow(8,i++));
            octalNumber/=10;
        }
        System.out.println("Decimal value: " + decimalNumber);
    }
}