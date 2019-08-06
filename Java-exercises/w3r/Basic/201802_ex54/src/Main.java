// Write a Java program that accepts three integers from the user
// and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.println(lastDigitTest(num1,num2,num3,true));
    }

    private static boolean lastDigitTest(int num1, int num2, int num3, boolean check){
        return (num1%10 == num2%10) || (num1%10 == num3%10) || (num2%10 == num3%10);
    }
}
