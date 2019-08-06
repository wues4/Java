// Write a Java program to convert a hexadecimal to a binary number.

import java.util.Scanner;

public class HexaToBinary {
    public static void main(String[] args) {
        String hexaNumber, binaryNumber;
        int decimalNumber;

        Scanner in = new Scanner(System.in);
        System.out.print("Input hexadecimal value:");
        hexaNumber=in.nextLine();

        decimalNumber=Integer.parseInt(hexaNumber, 16);
        binaryNumber=Integer.toBinaryString(decimalNumber);
        System.out.println("Binary value:" + binaryNumber);
    }
}