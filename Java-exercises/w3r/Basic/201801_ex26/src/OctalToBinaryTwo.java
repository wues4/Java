//// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class OctalToBinaryTwo {
    public static void main(String[] args) {
        int[] octalNumberValues={0,1,10,11,100,101,110,111};
        long octalNumber, binaryNumber=0, place=1;
        int remainder;

        Scanner in = new Scanner(System.in);
        System.out.print("Input octal number: ");
        octalNumber = in.nextLong();

        try {
            while (octalNumber!=0) {
                remainder=(int)(octalNumber%10);
                binaryNumber=binaryNumber+place*octalNumberValues[remainder];
                place*=1000;
                octalNumber/=10;
            }
            System.out.println("Binary value: " + binaryNumber);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}