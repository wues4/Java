// Write a Java program to convert a hexadecimal to a octal number.

import java.util.Scanner;

public class HexaToOctal {
    public static void main(String[] args) {
        String hexaNumber, octalNumber;
        int decimalNumber;

        Scanner in = new Scanner(System.in);
        System.out.print("Input hexadecimal value:");
        hexaNumber=in.nextLine();

        decimalNumber=Integer.parseInt(hexaNumber, 16);
        octalNumber=Integer.toOctalString(decimalNumber);
        System.out.println("Octal value:" + octalNumber);
    }
}