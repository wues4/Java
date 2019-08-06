//Write a Java program to convert a binary number to hexadecimal number.

import java.util.Scanner;

public class BinToHex {
    public static void main(String[] args) {
        int[] hexadecimalNumber = new int[1000];
        int i=1, j=0, remainder, decimalNumber=0, binaryNumber;

        Scanner in = new Scanner(System.in);
        System.out.print("Input binary number: ");
        binaryNumber=in.nextInt();

        while (binaryNumber>0){
            remainder=binaryNumber%2;
            decimalNumber=decimalNumber+remainder*i;
            i*=2;
            binaryNumber/=10;
        }

        i=0;
        while (decimalNumber!=0) {
            hexadecimalNumber[i]=decimalNumber%16;
            decimalNumber/=16;
            i++;
        }

        System.out.print("Hxadecimal value: ");
        for (j=i-1; j>=0; j--) {
            if (hexadecimalNumber[j] > 9) {
                System.out.print((char) (hexadecimalNumber[j] + 55) + "\n");
            } else {
                System.out.print(hexadecimalNumber[j]);
            }
        }
    }
}
