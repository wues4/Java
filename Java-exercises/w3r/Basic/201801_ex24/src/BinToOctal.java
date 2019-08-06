//Write a Java program to convert a binary number to a Octal number.

import java.util.Scanner;

public class BinToOctal {
    public static void main(String[] args) {
        int binaryNumber, remainder, decimalNumber=0, i=1;
        String result;

        Scanner in = new Scanner(System.in);
        System.out.print("Input binary number: ");
        binaryNumber = in.nextInt();

        while (binaryNumber>0){
            remainder=binaryNumber%2;
            decimalNumber=decimalNumber+remainder*i;
            i*=2;
            binaryNumber/=10;
        }

        result = Integer.toOctalString(decimalNumber);
        System.out.print("Octal value: " + result);
    }
}
