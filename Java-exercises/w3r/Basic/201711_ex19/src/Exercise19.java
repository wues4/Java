// Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        int decimalNumber, decimalProduct, count=0;
        int[] sum = new int[50];

        System.out.print("Enter decimal number: ");
        Scanner in = new Scanner(System.in);
        decimalNumber = in.nextInt();

        while (decimalNumber > 0) {
            decimalProduct = decimalNumber;
            if ((decimalProduct%=2) == 0){
                sum[count++] = 0;
            }else {
                sum[count++] = 1;
            }
            decimalNumber /= 2;
        }
        --count;

        System.out.print("Your decimal number is converted to binary number : ");
        while (count>=0) {
            System.out.print(sum[count--]);
        }
    }
}
