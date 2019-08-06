//Write a Java program to convert a decimal number to octal number.

import java.util.Scanner;

public class DecimalToOctadecimal {
    public static void main(String[] args) {
        int decimal;
        String result;

        Scanner in = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        decimal = in.nextInt();

        result = Integer.toOctalString(decimal);
        System.out.println("Octadecimal number is: " + result);
    }
}
