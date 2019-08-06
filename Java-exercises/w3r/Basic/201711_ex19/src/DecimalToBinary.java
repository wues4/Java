// Write a Java program to convert a decimal number to binary number.
// Using for loop

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        int decimalNumber, decimalProduct, i=0, j;
        int[] sum = new int[50];

        System.out.print("Enter decimal number: ");
        Scanner in = new Scanner(System.in);
        decimalNumber = in.nextInt();

        for (decimalProduct = decimalNumber; decimalProduct>0; decimalProduct/=2) {
            sum[i++] = (decimalProduct % 2);
        }

        System.out.print("Your decimal number is converted to binary number : ");
        for (j=i-1; j>=0; j--) {
            System.out.print(sum[j]);
        }
    }
}
