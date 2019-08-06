// Write a Java program to multiply two binary numbers.

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long bin1, bin2, multiply = 0;
        int digit, factor = 1;

        System.out.print("Input first binary number: ");
        bin1 = in.nextLong();
        System.out.print("Input second binary number: ");
        bin2 = in.nextLong();

        while (bin2 != 0) {
            digit = (int) (bin2 % 10);
            if (digit == 1) {
                bin1 = bin1 * factor;
                multiply = binaryproduct((int) bin1, (int) multiply);
            } else {
                bin1 = bin1 * factor;
            }
            bin2 = bin2 / 10;
            factor = 10;
        }
        System.out.println("Product of two binary numbers: " + multiply + "\n");
    }

    static int binaryproduct(int bin1, int bin2){

        int remainder=0, i=0;
        int[] sum = new int[50];
        int binary_result = 0;

        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = ((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = ((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;

        while (i >= 0){
            binary_result = binary_result * 10 + sum[i--];
        }
        return binary_result;
    }
}