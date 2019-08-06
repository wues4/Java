//Write a Java program to convert a hexadecimal to a decimal number.

import java.util.Scanner;

public class HexaToDecimal {
    public static void main(String[] args) {
        String hexaNumber;
        int decimalNumber;

        Scanner in = new Scanner(System.in);
        System.out.print("Input hexadecimal number:");
        hexaNumber=in.nextLine();

        decimalNumber=Integer.parseInt(hexaNumber,16);
        System.out.println("Decimal value: " + decimalNumber);
    }
}
